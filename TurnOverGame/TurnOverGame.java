package com.satty.practice;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class TurnOverGame {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int T_Case = sc.nextInt();
		for (int i = 0; i < T_Case; i++) {
			t_cal = Integer.MAX_VALUE;
			int arr[][] = new int[4][4];
			for (int j = 0; j < arr.length; j++) {
				String s =(sc.next());
				for (int k = 0; k < s.length(); k++) {
					if(s.charAt(k)=='b'){
						arr[j][k] = 0;
					}
					else
						arr[j][k] = 1;
				}
			}
			
		 callBackTrack(arr, 0, 0);
			
			System.out.println("Case #"+ (i+1));
			if(t_cal==Integer.MAX_VALUE)
				System.out.println("Imposssible");
			else
				System.out.println(t_cal);
			
			
			
			
			
		}
	}
	
	private static void callBackTrack(int[][] arr, int x, int cal) {
		// TODO Auto-generated method stub
		int j, k;
		if(checkForSymmetry(arr)){
			if(cal<t_cal)
			{
				t_cal=cal;
				
			}
			return;
		}
		if (x >= 16)
	        return ;

	    j = x/4;
	    k = x%4;
	    
	    callBackTrack(arr, x + 1, cal);
	    arr[j][k] = (arr[j][k]==0)?1:0;
	    int x1[] = {0, 1, -1, 0};
		int y1[] = {1, 0, 0, -1};
		for (int s = 0; s < y1.length; s++) {
			if(j+x1[s]>=0 && j+x1[s]<arr.length &&  k+y1[s]>=0 && k+y1[s]<arr.length){
				arr[j+x1[s]][k+y1[s]] = (arr[j+x1[s]][k+y1[s]]==0)?1:0; 
			}
		}
	    
		callBackTrack(arr, x+1, cal+1);
		arr[j][k] = (arr[j][k]==0)?1:0;
		int x2[] = {0, 1, -1, 0};
		int y2[] = {1, 0, 0, -1};
		for (int s = 0; s < y2.length; s++) {
			if(j+x2[s]>=0 && j+x2[s]<arr.length &&  k+y2[s]>=0 && k+y2[s]<arr.length ){
				arr[j+x2[s]][k+y2[s]] = (arr[j+x2[s]][k+y2[s]]==0)?1:0; 
			}
		}
		
		return;
	}

	private static int t_cal;
	
	private static boolean checkForSymmetry(int[][] arr) {
		// TODO Auto-generated method stub
		int i = arr[0][0];
		for (int j = 0; j < arr.length; j++) {
			for (int k = 0; k < arr.length; k++) {
				if(i!=arr[j][k])
				{
					return false;
				}
			}
		}
		return true;
	}


}

