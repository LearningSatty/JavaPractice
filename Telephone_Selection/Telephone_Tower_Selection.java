package com.satty.practice;

import java.util.Scanner;

public class Telephone_Tower_Selection {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int t_cases = sc.nextInt();
		for (int t = 0; t < t_cases; t++) {
			int total_tower = sc.nextInt();
			int issued_tower = sc.nextInt();
			int arr[] = new int[total_tower];
			for (int i = 0; i < arr.length; i++) {
				
				arr[i] = sc.nextInt();
			}
			int count = sc.nextInt();
			int arr_t[][] = new int[total_tower][total_tower];
			for (int k = 0; k < count; k++) {
				int data_c = sc.nextInt();
				
				
				
				int arr_c[] = new int[data_c];
				for (int i = 0; i < arr_c.length; i++) {
					arr_c[i] = sc.nextInt()-1;
				}
				int value = sc.nextInt();
				for (int i = 0; i < arr_c.length; i++) {
					for (int j = i+1; j < arr_c.length; j++) {
						arr_t[arr_c[i]][arr_c[j]] += value;
						arr_t[arr_c[j]][arr_c[i]] += value;
					}
				}
			}
			/*for (int i = 0; i < arr_t.length; i++) {
				for (int j = 0; j < arr_t.length; j++) {
					System.out.print(arr_t[i][j]+" ");
				}
				System.out.println();
			}*/
			int arr_final[] = new int[issued_tower];
			max_covered = Integer.MIN_VALUE;
			call_Combination(arr, arr_t, arr_final, issued_tower, 0, 0);
			System.out.println("Case #"+(t+1));
			System.out.println(max_covered + " "+ max_cov_string);
		}
	}
	static int max_covered;
	static String max_cov_string;
	private static void call_Combination(int[] arr, int[][] arr_common, int[] arr_final, int issued_tower, int curr, int index) {

		// TODO Auto-generated method stub
		if(curr==issued_tower){
			int sum = 0;
			String s ="";
			for (int i = 0; i < arr_final.length; i++) {
				sum += arr[arr_final[i]];
				s = s + (arr_final[i]+1)+" ";
			}
			for (int i = 0; i < arr_final.length; i++) {
				for (int j = i+1; j < arr_final.length; j++) {
					int x =arr_final[i];
					int y = arr_final[j];
					sum-= arr_common[x][y]; 
				}
			}
			if(sum>max_covered){
				max_covered = sum;
				max_cov_string = s;
			}
//			System.out.println(sum);
//			System.out.println(s);
			return;
		}
		for (int i = index; i < arr.length; i++) {
			arr_final[curr] = i;
			call_Combination(arr, arr_common, arr_final, issued_tower, curr+1, i+1);
			arr_final[curr] = 0;
		}
	}


}
