public class callMethod {

	public static int calc(int x, int y) {
		int a = 1;
		for(int i=0; i<y; i++) {
			a = a * x;
		}
		return a;
	}
	
	/*
	 * public static int minus(hoge, huga){
	 * 
	 * }
	 */

	public static void main(String args[]) {
		int a = 4;
		int b = 3;
		int c;
		c = calc(a, b);
		System.out.println(a+"の"+b+"乗は"+c);
	}
}
