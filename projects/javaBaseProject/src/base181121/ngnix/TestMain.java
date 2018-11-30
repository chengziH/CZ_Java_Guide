package base181121.ngnix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class TestMain {
	private static Map<String,Integer> serverMap = new HashMap<String,Integer>(){{
        put("192.168.1.100",1);
        put("192.168.1.101",1);
        put("192.168.1.102",4);
        put("192.168.1.103",1);
        put("192.168.1.104",1);
        put("192.168.1.105",3);
        put("192.168.1.106",1);
        put("192.168.1.107",2);
        put("192.168.1.108",1);
        put("192.168.1.109",1);
        put("192.168.1.110",1);
    }};
    
    /**
     * 随机法 
     */
    public static void random(){
    	List<String> serverList = new ArrayList<>(serverMap.keySet());
    	Random random = new Random();
    	int index = random.nextInt(serverList.size());
    	String server = serverList.get(index);
    	System.out.println(server);
    }
    
    /**
     * 权重随机法
     */
    public static void weightRandom(){
    	 Set<String> keySet = serverMap.keySet();
         List<String> servers = new ArrayList<String>();
         for(Iterator<String> it = keySet.iterator();it.hasNext();){
             String server = it.next();
             int weithgt = serverMap.get(server);
             for(int i=0;i<weithgt;i++){
                 servers.add(server);
             }
         }
         String server = null;
         Random random = new Random();
         int idx = random.nextInt(servers.size());
         server = servers.get(idx);
         System.out.println(server);
    }

    
    public static void main(String args[]){
    	/** 随机法 */
    	random();
    }
}
