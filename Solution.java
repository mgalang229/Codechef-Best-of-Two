import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int[] a = new int[3];
			for (int i = 0; i < 3; i++) {
				a[i] = fs.nextInt();
			}
			int[] b = new int[3];
			for (int i = 0; i < 3; i++) {
				b[i] = fs.nextInt();
			}
			shuffleSort(a);
			shuffleSort(b);
			if (a[1] + a[2] == b[1] + b[2]) {
				System.out.println("Tie");
			} else if (a[1] + a[2] > b[1] + b[2]) {
				System.out.println("Alice");
			} else {
				System.out.println("Bob");
			}
		}
		fs.close();
	}
	
	static final Random rnd = new Random();
	static void shuffleSort(int[] a) { //change this
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int newInd = rnd.nextInt(n);
			int temp = a[newInd]; //change this
			a[newInd] = a[i];
			a[i] = temp;
		}
		Arrays.sort(a);
	}
}
