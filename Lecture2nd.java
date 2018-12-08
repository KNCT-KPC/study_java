package lecture; // ここは不要

public class Lecture2nd {

	public static int calc(int x, int y) {
		int a = 1;
		for(int i=0; i<y; i++) {
			a = a * x;
		}
		return a;
	}


	/*
	 * 練習問題
	 *  1からNまでの総和を求めるメソッドsigmaを作成せよ
	 */
	public static int sigma(int N) {
		int x=0;

		for(int i=0; i<=N; i++) {
			x += i;
			// x = x + i;
		}

		return x;
	}



	/*
	 * 練習問題
	 *  第N番目の素数を求めるメソッドsosuを作成せよ
	 *  (例では機能を小さくするためにjugdeSosuを実装しています)
	 */
	public static Boolean jugdeSosu(int a) {
		boolean flg = true;
		for(int i=2; i<a; i++) {
			if(a % i == 0) {
				flg = false;
			}
		}
		return flg;
	}
	public static void sosu(int N) {
		int x = 0;
		int i = 1;

		while(x<N) {
			i++;
			if(jugdeSosu(i)) {
				x++;
			}
		}
		System.out.println("第" + N + "番目の素数は " + i +" です");
	}


	public static void main(String args[]) {
		int a = Integer.parseInt(args[0]);
		//int a = 4;
		int b = 3;
		int c;
		c = calc(a, b);
		System.out.println(a+"の"+b+"乗は"+c);
		c = sigma(c);
		System.out.println(c);

		sosu(a);
	}
}
