package base180830;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 运算符
 * @author chengzi
 *
 */
public class TestDemo {
	
	private static String str3 = "chengzi";
	
	public static void main(String args[]){
		/** 情况一 */
//		int m = 10;int n = 10;
//		// 运算符放在变量之后
//		System.out.println(m++); // 10
//		System.out.println(n--); // 10
//		m = 10;n = 10;
//		// 运算符放在变量之前
//		System.out.println(++m); //11
//		System.out.println(--n); // 9
		
//		/** 情况二 */
//		int n = 10;
//		int m = --n * 5;
//		System.out.println(n); // 9
//		System.out.println(m); // 45
		
//		/** 情况三 */
//		int n = 10;
//		int m = n-- * 5;
//		System.out.println(n); // 9
//		System.out.println(m); // 50
		
		
//		/** 情况四 */
//		int n = 10; 
//		int m = 10 * n++; 
//		int i = m++ * --n; 
//		int j = ++i + ++m - n--; 
//		System.out.printf("n:%d, m:%d, i:%d, j:%d",n,m,i,j); // 9  102  1001 1093
		
//		System.out.println(TestEnum.RED.getMessage());// 红色

	
//		String str = "chengzi";
//		String str2 = "chengzi";
//		System.out.println(str.equals(str2));
//		System.out.println(str == str2);
//		System.out.println(str == str3);
//		System.out.println(str.equals(str3));
		
		
//		int index = 0;
//		do{
//			System.out.println("执行一次 index = "+index);
//			index ++;
//		}while(index < 5);
		
		
//		int number = 5;
//		for(int i = 0 ; i < number ; i ++){
//			System.out.println("A开始执行 = "+i);
//		}
//		for(int i = 10 ; i > number ; i--){
//			System.out.println("B开始执行 = "+i);
//		}
//		for(int i = 20 ; i > number ; i-=5){
//			System.out.println("C开始执行 = "+i);
//		}
		
//		for(;;){
//			System.out.println("死循环了");
//		}
		
		
		
//		Scanner in = new Scanner(System.in);
//		String value = in.next();
//		switch(value){
//			case "A" :
//				System.out.println("输入了A");
//				break;
//			case "B" :
//				System.out.println("输入了B");
//			default :
//				System.out.println("输入了未知值");
//				break;
//		}
		
		
//		double a = 2.0 - 1.1;
//		System.out.println(a); // 0.8999999999999999
//		
//		
//		double d1 = 20.0;
//		double d2 = 19.563;
//		System.out.println(d1 - d2);
		
		
		
//		BigDecimal b = BigDecimal.valueOf(2.9632258).subtract(BigDecimal.valueOf(1.2232200023));
//		b.setScale(newScale)
//		System.out.println(b);// 0.9
		
//		BigDecimal big = new BigDecimal(3.63452636);
//		System.out.println(big.setScale(2,BigDecimal.ROUND_DOWN)); //ROUND_DOWN直接删除多余的小数点位数，不做四舍五入处理    3.63
//		System.out.println(big.setScale(2,BigDecimal.ROUND_UP)); // 3.64 进位处理(小数点第三位不满足四舍五入条件依然进位1)，并保留小数点后两位 3.64
//		System.out.println(big.setScale(2,BigDecimal.ROUND_HALF_UP)); // 四舍五入并保留小数点后两位 3.63
		
		
		
		
		
		
		
//		int[] array = new int[100];
//		for(int value : array){
//			System.out.println(value); // 0
//		}
//		boolean [] array1 = new boolean[10];
//		for(boolean value : array1){
//			System.out.println(value); // false
//		}
//		String[] array2 = new String[100];
//		for(String value : array2){
//			System.out.println(value); //null
//		}
		
		
		
//		int[] a = new int[]{1,2,3,4,5,6};
//		int[] b = {1,2,3,4,5,6,7};
//		
//		
//		for(int value : b){
//			System.out.println(value); //null
//		}
		
		
		int[] a ;
		int[] b = new int[]{3,4,5,6};
		a = Arrays.copyOf(b, 8);
		for(int value : a){
			System.out.println(value); //3,4,5,6,0,0,0,0
		}
		
		
		
		
	}
}
