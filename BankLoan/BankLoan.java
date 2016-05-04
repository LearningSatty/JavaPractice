package com.satty.practice;

import java.util.Scanner;

/*
0    50  100  0    = 150
150  0   20   0    = 170
0    0   0    30   = 30
30   0   0    0    = 30
||   ||  ||   ||
180  50  120  30
1. (150 + 170 + 30 + 30 + 180 + 50 + 120 + 30 = 320)
2. ((|(180-150)| + |(50 - 170)| +|(120-30)| + |(30-30)|) = 240)
    240/2 =120
So, final_output T_case. 320 240

*/

public class BankLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int T_Case = sc.nextInt();
		for (int k = 0; k <= T_Case; k++) {
		int n_banks =  sc.nextInt();
		int[][] adj_matrix = new int[n_banks][n_banks];
		
		
			
			int in_value = 0;
			for (int i = 0; i < n_banks; i++) {
				for (int j = 0; j < adj_matrix.length; j++) {
					adj_matrix[i][j] = sc.nextInt();
					in_value += adj_matrix[i][j];
				}
			}
			
//			System.out.println(in_value);
			int arr_row[] =new int[n_banks];
			int arr_col[] =new int[n_banks];
			
			for (int i = 0; i < adj_matrix.length; i++) {
				int row_some = 0;
				int col_some = 0;
				for (int j = 0; j < adj_matrix.length; j++) {
					row_some = row_some +  adj_matrix[i][j];
					col_some = col_some + adj_matrix[j][i];
				}
				arr_row[i] = row_some;
				arr_col[i] = col_some;
			}
			
			
			
			for (int i = 0; i < arr_col.length; i++) {
				arr_row[i] = arr_row[i] - arr_col[i];
			}
			int f_value=0;
			for (int i = 0; i < arr_row.length; i++) {
				f_value = f_value +Math.abs(arr_row[i]);
			}
			
			System.out.println(k+1+". "+ in_value + " "+f_value/2);
			
		}
		
		
		
		
	}

}
