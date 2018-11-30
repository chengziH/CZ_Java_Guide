package base180830;

import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
public class DigestUtil {
	
	public static void main(String[] agrs){
//		Map<String, Object> validatMap = new HashMap<String, Object>();
//		validatMap.put("service", "QUERY_LOAN_CUSTOMER_LIST");
//		validatMap.put("settleStartTime", "2018-09-15");
//		validatMap.put("settleEndTime", "2018-10-15");
//		String sign = digest(validatMap, "177b27bab90e79f570901daf979950f6", DigestALGEnum.MD5);
//		System.out.println(sign); // f28cf4d1313cbd66533b0c511221e84c
		
		
		
//		Map<String, Object> validatMap = new HashMap<String, Object>();
//		validatMap.put("service", "QUERY_LOAN_CUSTOMER_LIST");
//		String sign = digest(validatMap, "177b27bab90e79f570901daf979950f6", DigestALGEnum.MD5);
//		System.out.println(sign); // 7f9398d8e110ec7a3c2671c7503e9261
	}
	
	/**
	 * 签名编码
	 */
	public static final String UTF8 = "utf-8";
	
	/**
	 * 签名key
	 */
	public static final String SIGN_KEY = "sign";
	
	/**
	 * 签名算法
	 *
	 * @Filename DigestUtil.java
	 * @Description
	 * @Version 1.0
	 * @Author bohr.qiu
	 * @Email qzhanbo@yiji.com
	 * @History <li>Author: bohr.qiu</li> <li>Date: 2013-1-5</li> <li>Version:
	 * 1.0</li> <li>Content: create</li>
	 */
	public static enum DigestALGEnum {
		SHA256("SHA-256"),
		MD5("MD5");
		private String name;
		
		DigestALGEnum(String name) {
			this.name = name;
		}
		
		public static DigestALGEnum getByName(String name) {
			for (DigestALGEnum _enum : values()) {
				if (_enum.getName().equals(name)) {
					return _enum;
				}
			}
			return null;
		}
		
		public String getName() {
			return name;
		}
	}
	
	/**
	 * 以Map中key的字符顺序排序后签名，如果secretKey不为空，排在最后面签名。<br/>
	 * 比如：Map中值如下：<br/>
	 * keyA=valueA<br/>
	 * keyB=valueB<br/>
	 * keyA1=valueA1<br/>
	 * <br/>
	 * security_check_code为yjf<br/>
	 * <p/>
	 * 待签名字符串为：<br/>
	 * keyA=valueA&keyA1=valueA1&keyB=valueByjf<br/>
	 * <b>注意:</b>SIGN_KEY不会被签名
	 *
	 * @param dataMap
	 * @param securityCheckKey 密钥
	 * @param de 摘要算法
	 * @return
	 */
	public static <T> String digest(Map<String, T> dataMap, String securityCheckKey,
									DigestALGEnum de) {
		return digest(dataMap, securityCheckKey, de, UTF8);
	}
	
	/**
	 * 以Map中key的字符顺序排序后签名，如果secretKey不为空，排在最后面签名。<br/>
	 * 比如：Map中值如下：<br/>
	 * keyA=valueA<br/>
	 * keyB=valueB<br/>
	 * keyA1=valueA1<br/>
	 * <br/>
	 * security_check_code为yjf<br/>
	 * <p/>
	 * 待签名字符串为：<br/>
	 * keyA=valueA&keyA1=valueA1&keyB=valueByjf<br/>
	 * <b>注意:</b>SIGN_KEY不会被签名
	 *
	 * @param dataMap
	 * @param securityCheckKey 密钥
	 * @param de 摘要算法
	 * @return
	 */
	public static <T> String digest(Map<String, T> dataMap, String securityCheckKey,
									DigestALGEnum de, String encoding) {
		if (dataMap == null) {
			throw new IllegalArgumentException("数据不能为空");
		}
		if (dataMap.isEmpty()) {
			return null;
		}
		if (securityCheckKey == null) {
			throw new IllegalArgumentException("安全校验码数据不能为空");
		}
		if (de == null) {
			throw new IllegalArgumentException("摘要算法不能为空");
		}
		if (encoding == null || "".equalsIgnoreCase(encoding)) {
			throw new IllegalArgumentException("字符集不能为空");
		}
		
		TreeMap<String, T> treeMap = new TreeMap<String, T>(dataMap);
		StringBuilder sb = new StringBuilder();
		for (Entry<String, T> entry : treeMap.entrySet()) {
			if (entry.getValue() == null) {
				throw new IllegalArgumentException(entry.getKey() + " 待签名值不能为空");
			}
			if (entry.getKey().equals(SIGN_KEY)) {
				continue;
			}
			sb.append(entry.getKey()).append("=").append(entry.getValue().toString()).append("&");
		}
		sb.deleteCharAt(sb.length() - 1);
		
		sb.append(securityCheckKey);
		
		byte[] toDigest;
		try {
			String str = sb.toString();
			toDigest = str.getBytes(encoding);
			MessageDigest md = MessageDigest.getInstance(de.getName());
			md.update(toDigest);
			return new String(Hex.encodeHex(md.digest()));
		} catch (Exception e) {
			throw new RuntimeException("签名失败", e);
		}
	}
}

class Hex{
	/**
     * Used to build output as Hex
     */
    private static final char[] DIGITS_LOWER =
        {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /**
     * Used to build output as Hex
     */
    private static final char[] DIGITS_UPPER =
        {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
	
	public static char[] encodeHex(final byte[] data) {
        return encodeHex(data, true);
    }
	public static char[] encodeHex(final byte[] data, final boolean toLowerCase) {
        return encodeHex(data, toLowerCase ? DIGITS_LOWER : DIGITS_UPPER);
    }
	protected static char[] encodeHex(final byte[] data, final char[] toDigits) {
        final int l = data.length;
        final char[] out = new char[l << 1];
        // two characters form the hex value.
        for (int i = 0, j = 0; i < l; i++) {
            out[j++] = toDigits[(0xF0 & data[i]) >>> 4];
            out[j++] = toDigits[0x0F & data[i]];
        }
        return out;
    }
}
