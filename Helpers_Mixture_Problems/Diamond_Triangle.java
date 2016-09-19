package com.satty.practice.clone;

public class Diamond_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len =10;
		char arr[][] = new char[2*len-1][2*len-1];
		int s =len-1;int d=0;
		for (int i = 0; i < len; i++) {
			for (int j = s; j <= s+d*2; j=j+2) {
				arr[i][j] = '*';
			}
			s--;
			d++;
		}
		s=1; d=len-1;
		for (int i = len; i < arr.length; i++) {
			for (int j = s; j < s+(d*2)-1; j=j+2) {
				arr[i][j] = '*';
			}
			s++;
			d--;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
/*





*/
