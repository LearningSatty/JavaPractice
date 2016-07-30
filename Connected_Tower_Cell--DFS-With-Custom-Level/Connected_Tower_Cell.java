package com.satty.practice;

import java.util.Scanner;
/*
2
3 4
150 450 100 320
120 130 160 110
10 60 200 220
1 4
10 20 30 40
Sample Output:
1130
100
*/
public class Connected_Tower_Cell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t_cases = sc.nextInt();
		for (int t = 0; t < t_cases; t++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int arr[][] = new int[h*2][w];
			int[] arr_temp = new int[h*w];
			for (int i = 0; i < arr_temp.length; i++) {
				arr_temp[i] = sc.nextInt();
			}
			int s =0;
			for (int i = 0; i < arr.length; i+=2) {
				for (int j = 0; j < arr[0].length; j++) {
					if(s==h*w)
						break;
					if(j%2==0)
						arr[i][j] = arr_temp[s];
					else{
						arr[i+1][j] = arr_temp[s];
					}
					s++;
				}
			}
			
			/*for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}*/
			final_answer = Integer.MIN_VALUE;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					if(arr[i][j]!=0){
					int arr_vis[][] = new int[h*2][w];
					arr_vis[i][j] = 1;
					checkCircular(arr, i, j, 1, arr[i][j]);
					startTraversing(arr, arr_vis, i, j, 1, arr[i][j]);
					}
				}
			}
			
			System.out.println((final_answer));
		}
	}

	private static void checkCircular(int[][] arr,int x, int y, int level,
			int cost) {
		// TODO Auto-generated method stub
		int[] arr_temp = new int[6];
		int s[] = {-1, 1, -1, 1, 2, -2};
		int t[] = {-1, -1, 1, 1, 0, 0};
		int temp = 0;
		for (int i = 0; i < s.length; i++) {
			if(x+s[i]>=0 && x+s[i]<arr.length && y+t[i]>=0 && y+t[i]<arr[0].length && arr[x+s[i]][y+t[i]]!=0){
				arr_temp[temp] = arr[x+s[i]][y+t[i]];
				temp++;
			}
		}
		for (int i = 0; i < arr_temp.length; i++) {
			for (int j = 0; j < arr_temp.length-i-1; j++) {
				if(arr_temp[j]<arr_temp[j+1])
					{
						int c = arr_temp[j];
						arr_temp[j] = arr_temp[j+1];
						arr_temp[j+1] = c;
					}
			}
		}
		
		for (int i = 0; i < 3; i++) {
			cost = cost +arr_temp[i];
		}
		if(cost>final_answer){
			final_answer = cost;
		}
	}

	static int final_answer;
	private static void startTraversing(int[][] arr, int[][] arr_vis,int x, int y, int level,
			int cost) {
		// TODO Auto-generated method stub
		if(level==4){
			if(cost>final_answer)
				final_answer = cost;
			return;
		}
		int s[] = {-1, 1, -1, 1, 2, -2};
		int t[] = {-1, -1, 1, 1, 0, 0};
		for (int i = 0; i < s.length; i++) {
			if(x+s[i]>=0 && x+s[i]<arr.length && y+t[i]>=0 && y+t[i]<arr[0].length && arr[x+s[i]][y+t[i]]!=0 && arr_vis[x+s[i]][y+t[i]]!=1){
				arr_vis[x+s[i]][y+t[i]] = 1;
				startTraversing(arr, arr_vis, x+s[i], y+t[i], level+1, cost+arr[x+s[i]][y+t[i]]);
				arr_vis[x+s[i]][y+t[i]] = 0;
			}
		}
		
	}

}
