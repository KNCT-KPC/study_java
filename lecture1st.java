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
	 * 練習問題
	 *   2変数を引数に引き算して計算結果をint型でreturnするメソッドminusを作成せよ
	 * }
	 * 
	 * 練習問題
	 *   1つの変数の正負を判定して正の値なら1,負の値なら0をreturnするメソッドplusORminusを作成せよ
	 *
	 * 練習問題
	 *   1つの変数が正か負かを表示するメソッドanswerを作成せよ
	 */

	public static void main(String args[]) {
		int a = 4;
		int b = 3;
		int c;
		c = calc(a, b);
		System.out.println(a+"の"+b+"乗は"+c);
		
		/*
		 * 練習問題
		 *   作成したメソッドを用いて, a^b-c^dの計算結果が正か負かを表示するプログラムを作成せよ
		 *   (a, b, c, dは任意のint型変数)
		 */
	}
}
