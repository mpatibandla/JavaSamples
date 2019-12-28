package java_basics;

public class MyUtils {
	
	
	public static void printBlahBlah(String text) {
		System.out.println(text);
	}
	
	private static void printBlahBlah(int num) {
		System.out.println(num);
	}
	
	public static void sum2nums(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public static int add10(int num) {
		int result = num + 10;
		return result;
	}
	
	public static int testpvt(int num) {
		printBlahBlah(num);
		return num;
	}
	
}
