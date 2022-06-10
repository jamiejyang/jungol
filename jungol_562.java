package teacher;

import java.util.Scanner;

public class jungol_562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];
		for(int i=0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();
		
		//print
//		for(int i=0; i < ar.length; i++) {
//			System.out.print(ar[i] + " ");
//		}
		
		int odd = 0, even = 0;
		for(int i = 0; i < ar.length; i++) {
//			ar[0] : odd number
//			ar[1] : even number
			if(i % 2 == 0) {
				odd += ar[i];
			} else {
				even += ar[i];
			}
			
		}
		System.out.println("sum : " + even);
		System.out.printf("avg : %.1f\n", (double) odd / (ar.length/2));
	}

}
