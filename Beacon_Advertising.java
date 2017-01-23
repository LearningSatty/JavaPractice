package com.satty.practice;

import java.util.Scanner;

public class Beacon_Advertising {

	private static int final_total;
	private static int min_cust_time;
	private static int max_cust_time;
	private static int max_adv_time;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T_case = sc.nextInt();
		for (int t = 0; t < T_case; t++) {
			int t_cust=sc.nextInt();
			int adv[][] = new int[3][2];
			for (int i = 0; i < 3; i++) {
				adv[i][0] = sc.nextInt();
			}
			for (int i = 0; i < 3; i++) {
				adv[i][1] = sc.nextInt();
			}
			
			int cust[][] = new int[t_cust][2];
			for (int i = 0; i < cust.length; i++) {
				cust[i][0] = sc.nextInt();
				cust[i][1] = sc.nextInt();
			}
			min_cust_time = Integer.MAX_VALUE;
			max_cust_time = Integer.MIN_VALUE;
			for (int i = 0; i < cust.length; i++) {
				if(cust[i][0]<min_cust_time)
					min_cust_time = cust[i][0];
				if((cust[i][0]+cust[i][1])>max_cust_time)
					max_cust_time = (cust[i][0]+cust[i][1]);
			}
			for (int i = 0; i < adv.length; i++) {
				if(adv[i][0]>max_adv_time)
					max_adv_time = cust[i][0];
			}
			
			int arr_val[] = new int[t_cust];
			final_total = Integer.MIN_VALUE;
			int arr_b[][] = {{0, 1, 2},{0, 2, 1}, {1, 2, 0}, {1, 0, 2}, {2, 0, 1}, {2, 1, 0}};
			for (int i = 0; i < arr_b.length; i++) {
				int arr[] = arr_b[0];
				callbackTrack(adv, cust, arr_val, arr,  0, min_cust_time);
			}
			System.out.println("#"+(t+1)+" "+final_total);
		}
		sc.close();
	}

	private static void callbackTrack(int[][] adv, int[][] cust, int[] arr_val, int[] arr_b, int adv_no, int min_time) {
		// TODO Auto-generated method stub
		if(adv_no>2){
			int total =0;
			for (int i = 0; i < arr_val.length; i++) {
				total = total + arr_val[i];
			}
			if(total>final_total)
				final_total = total;
			return;
		}
		int cur_adv = arr_b[adv_no];
		int lim = (max_cust_time)<50?(max_cust_time+max_adv_time):50;
		for (int i = min_time; i < lim; i++) {
			int arr_temp[] = new int[arr_val.length];
			for (int j = 0; j < arr_val.length; j++) {
				arr_temp[j] = arr_val[j];
			}
			
			for (int j = 0; j < arr_val.length; j++) {
				if(canAdvBeReceived(cust[j][0], (cust[j][1]), i, adv[cur_adv][0])){
					if(adv[cur_adv][1] > arr_val[j])
						arr_val[j] = adv[cur_adv][1]; 
				}
			}
			callbackTrack(adv, cust, arr_val, arr_b, adv_no+1, min_time+adv[cur_adv][0]);
			for (int j = 0; j < arr_val.length; j++) {
				arr_val[j] = arr_temp[j];
			}
		}
	}

	private static boolean canAdvBeReceived(int i, int j, int i2, int k) {
		// TODO Auto-generated method stub
		if(i2>=i && (i+j>=(i2+k)))
			return true;
		return false;
	}

}
