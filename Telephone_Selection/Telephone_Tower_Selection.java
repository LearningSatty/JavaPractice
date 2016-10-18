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
			int arr_common[][] = new int[count][total_tower+1];
			for (int i = 0; i < count; i++) {
				int temp = sc.nextInt();
				int temp_[] = new int[temp];
				for (int j = 0; j < temp; j++) {
					temp_[j] = sc.nextInt()-1;
				}
				int val = sc.nextInt();
				for (int j = 0; j < temp_.length; j++) {
					arr_common[i][temp_[j]] = val;
				}
				arr_common[i][arr_common[0].length-1] = temp;
			}
			int arr_final[] = new int[issued_tower];
			max_covered = Integer.MIN_VALUE;
			call_Combination(arr, arr_common, arr_final, issued_tower, 0, 0);
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
			for (int i = 0; i < arr_common.length; i++) {
				boolean b = true;
				int val = 0;
				for (int j = 0; j < arr_common[0].length-1; j++) {
					if(arr_common[i][j]!=0){
						val = arr_common[i][j];
						boolean b2 = false;
						for (int k = 0; k < arr_final.length; k++) {
							if(arr_final[k]==j){
								b2 = true;
								break;
							}
						}
						if(!b2){
							b = false;
							break;
						}
						
					}
				}
				int nn= arr_common[i][arr_common[0].length-1];
				if(nn>2){
					int ctemp= 0;
					ctemp = nn;
					while(ctemp-2!=0){
						int arrr[] = new int[ctemp-1];
						call_bc2(arrr, arr_final, arr_common, sum,ctemp-1, 0, 0);
						ctemp--;
					}
					
				}
				
				
				
				if(b){
					sum -= val;
				}
			}
			if(sum>max_covered){
				max_covered = sum;
				max_cov_string = s;
			}
			System.out.println(sum);
			System.out.println(s);
			return;
		}
		for (int i = index; i < arr.length; i++) {
			arr_final[curr] = i;
			call_Combination(arr, arr_common, arr_final, issued_tower, curr+1, i+1);
			arr_final[curr] = 0;
		}
	}
	private static void call_bc2(int[] arrr, int[] arr_c, int[][] arr_common, int sum, int total, int curr, int index) {
		// TODO Auto-generated method stub
		if(curr==total){
			for (int i = 0; i < arr_common.length; i++) {
				boolean b = true;
				int val = 0;
				for (int j = 0; j < arr_common[0].length-1; j++) {
					if(arr_common[i][j]!=0){
						val = arr_common[i][j];
						boolean b2 = false;
						for (int k = 0; k < arrr.length; k++) {
							if(arrr[k]==j){
								b2 = true;
								break;
							}
						}
						if(!b2){
							b = false;
							break;
						}
					}
				}
				if(b){
					sum -= val;
				}
			}
			return;
		}
		for (int i = index; i < arr_c.length; i++) {
			arrr[curr] = arr_c[i];
			call_bc2(arrr, arr_c, arr_common, sum, total, curr+1, i+1);
			arrr[curr] = 0;
		}
	}

}
