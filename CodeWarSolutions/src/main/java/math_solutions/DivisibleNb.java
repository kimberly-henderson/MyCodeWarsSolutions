package math_solutions;

public class DivisibleNb {
	
	public static void main(String[] args) {
		System.out.println(isDivisible(120, 30, 40));
	}
	
	public static boolean isDivisible(long n, long x, long y) {
		return (n % x == 0) && (n % y == 0) ? true : false;
	}
}
