package com.satty.practice;

import java.util.Scanner;

public class BusinessManDobara1 { 
	static int ap_per_unit;
	static int or_per_unit;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t_cases = sc.nextInt();
		for (int t = 0; t < t_cases; t++) {
			int apples = sc.nextInt();
			int orange = sc.nextInt();
			int mangoes = sc.nextInt();
			ap_per_unit = sc.nextInt();
			or_per_unit = sc.nextInt();
			int comb = sc.nextInt();
			int arr[][]	= new int[comb][4];
			for (int i = 0; i < comb; i++) {
				arr[i][0] = sc.nextInt();
				arr[i][1] = sc.nextInt();
				arr[i][2] = sc.nextInt();
				arr[i][3] = sc.nextInt();
			}
			max_profit = 0;
			
			if((apples*ap_per_unit + orange*or_per_unit)>max_profit){
				max_profit = apples*ap_per_unit + orange*or_per_unit;
			}
			
			/*int max_no_chat[] = new int[comb];
			for (int i = 0; i < arr.length; i++) {
				while(apples>=arr[i][0] && orange>=arr[i][1] && mangoes>=arr[i][1]){
					max_no_chat[i] ++;
				}
			}*/
			int arr_type_vis[] = new int[comb];
			callBacktrack(arr, apples, orange, mangoes, 0, 0, 0, arr_type_vis);
			System.out.println("Case #"+(t+1));
			System.out.println(max_profit);
		}
	}

	private static void callBacktrack(int[][] arr, int apple_due, int orange_due, int mango_due, int price, int pass, int count, int[] arr_type_vis) {
		// TODO Auto-generated method stub
		
		if(!checkAnyCombinationPossible(arr, apple_due, orange_due, mango_due)){
			price = price + (apple_due*ap_per_unit + orange_due*or_per_unit);
			if(price>max_profit)
				max_profit = price;
			return;
		}
		int temp_price_ind = price + (apple_due*ap_per_unit + orange_due*or_per_unit);
		if(temp_price_ind>max_profit)
		{
			max_profit = temp_price_ind;
		}
		for (int i = pass; i < arr.length; i++) {
   			if(!checkAnyCombinationPossible(arr, apple_due, orange_due, mango_due)){
  				return;
  			}
			if(checkAnyCombinationPossibleFor(arr, apple_due, orange_due, mango_due, i)){
					arr_type_vis[i] = arr_type_vis[i]+1;
					if(ThreeCalled(arr_type_vis))
					{
						price = price + (apple_due*ap_per_unit + orange_due*or_per_unit);
						if(price>max_profit)
							max_profit = price;
						arr_type_vis[i] = arr_type_vis[i]-1;
						break;
					}
					
					callBacktrack(arr, apple_due-arr[i][0], orange_due-arr[i][1], mango_due-arr[i][2], price+arr[i][3], i, count, arr_type_vis);
					arr_type_vis[i] = arr_type_vis[i]-1;
			}
				
		}
//		count++;
	}

	private static boolean ThreeCalled(int[] arr) {
		// TODO Auto-generated method stub
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>0)
				sum++;
			
			if(sum==4)
				return true;
		}
		return false;
	}

	private static boolean checkAnyCombinationPossible(int[][] arr,
			int apple_due, int orange_due, int mango_due2) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			if(apple_due>=arr[i][0] && orange_due>=arr[i][1] && mango_due2>=arr[i][2]){
				return true;
			}
		}
		return false;
	}
	
	private static boolean checkAnyCombinationPossibleFor(int[][] arr,
			int apple_due, int orange_due, int mango_due, int i) {
		// TODO Auto-generated method stub
			if(apple_due>=arr[i][0] && orange_due>=arr[i][1] && mango_due>=arr[i][2]){
				return true;
		}
		return false;
	}

	static int max_profit;
	}
