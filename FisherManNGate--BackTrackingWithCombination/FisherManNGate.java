package com.satty.practice;

import java.util.Scanner;

public class FisherManNGate {

	private static int final_total;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t_cases = sc.nextInt();
		for (int t = 0; t < t_cases; t++) {
			int N	 = sc.nextInt();
			
			int gates[][] = new int[3][2];
			for (int i = 0; i < 3; i++) {
				gates[i][0] = sc.nextInt()-1;
				gates[i][1] = sc.nextInt();
			}
			int gates_temp[] = new int[gates.length];
			for (int i = 0; i < gates.length; i++) {
				gates_temp[i] = gates[i][0];
			}
			s=0;
			arr_b = new int[6][3];
			final_total = Integer.MAX_VALUE;
			perm1(gates_temp, gates_temp.length);
			for (int i = 0; i < arr_b.length; i++) {
				int arr_val[] = new int[N];
				int arr_vis[] = new int[N];
				int arr_b_vis[] = new int[3];
				startTraverse(gates, arr_val, arr_vis, arr_b_vis, arr_b[i], 0, arr_b[i][0], getNoofPerson(gates, arr_b[i][0]));
			}
			System.out.println("#"+(t+1)+" "+final_total);
		}
		sc.close();
	}
	
	
	private static void startTraverse(int[][] gates, int[] arr_val, int[] arr_vis, int[] arr_vis_b, int[] arr_b, int i, int gate_no, int noofPerson) {
		// TODO Auto-generated method stub
		if(noofPerson==0){
			arr_vis_b[i] = 1;
			i++;
			if(i<3){
			gate_no = arr_b[i];
			noofPerson = getNoofPerson(gates, gate_no);
			}
		}
		if(AllGatesVisited(arr_vis_b) && noofPerson==0){
			int total = 0;
			for (int j = 0; j < arr_val.length; j++) {
				total = total + arr_val[j];
				
			}
			//System.out.println("["+arr_b[0]+", "+arr_b[1]+", "+arr_b[2]+"]==>"+total);
			if(total<final_total)
			{
				final_total = total;
				
			}
			return;
		}
		
		if(arr_vis[gate_no]!=1){
			int temp_l = arr_val[gate_no];
			arr_val[gate_no] = 1;
			arr_vis[gate_no] = 1;
			startTraverse(gates, arr_val, arr_vis, arr_vis_b, arr_b, i, gate_no, noofPerson-1);
			arr_val[gate_no] = temp_l;
			arr_vis[gate_no] = 0;
		}
		else{
			int final_loc = 0;
			int loc1 = gate_no - 1;
			int loc2 = gate_no +1;
			int dis1 = 1, dis2 = 1;
			for (int j = loc1; j >=0; j--) {
				dis1++;
				if(j==0 && arr_vis[j]!=0)
				{
					dis1 = Integer.MAX_VALUE;
					break;
				}
				if(arr_vis[j]==0)
				{
					//dis1++;
					loc1 = j;
					break;
				}
				
			}
			if(loc1<0)
				dis1 = Integer.MAX_VALUE;
			if(loc2>arr_val.length-1)
				dis2 = Integer.MAX_VALUE;
			for (int j = loc2; j <arr_val.length; j++) {
				dis2++;
				if((j==arr_val.length-1) && arr_vis[j]!=0){
					dis2 = Integer.MAX_VALUE;
					break;
				}
				if(arr_vis[j]==0)
				{
					loc2 = j;
					break;
				}
				
			}
			if(dis1==dis2){
				final_loc = loc1;
				arr_vis[final_loc] = 1;
				int temp_vl = arr_val[final_loc];
				arr_val[final_loc] = dis1;
				startTraverse(gates, arr_val, arr_vis, arr_vis_b, arr_b, i, gate_no, noofPerson-1);
				arr_vis[loc1] = 0;
				arr_val[loc1] = temp_vl;
				final_loc = loc2;
				temp_vl = arr_val[final_loc];
				arr_vis[final_loc] = 1;
				arr_val[final_loc] = dis2;
				startTraverse(gates, arr_val, arr_vis, arr_vis_b, arr_b, i, gate_no, noofPerson-1);
				arr_vis[final_loc] = 0;
				arr_val[final_loc] = temp_vl;
			}
			else if(dis1<dis2){
				final_loc = loc1;
				int temp_l = arr_val[final_loc];
				arr_vis[final_loc] = 1;
				arr_val[final_loc] = dis1;
				startTraverse(gates, arr_val, arr_vis, arr_vis_b, arr_b, i, gate_no, noofPerson-1);
				arr_vis[final_loc] = 0;
				arr_val[final_loc] = temp_l;
			}else{
				final_loc = loc2;
				int temp_l = arr_val[final_loc];
				arr_vis[final_loc] = 1;
				arr_val[final_loc] = dis2;
				startTraverse(gates, arr_val, arr_vis, arr_vis_b, arr_b, i, gate_no, noofPerson-1);
				arr_vis[final_loc] = 0;
				arr_val[final_loc] = temp_l;
			}
		}
		
		
	}


	private static boolean AllGatesVisited(int[] arr_vis) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr_vis.length; i++) {
			if(arr_vis[i]==0)
				return false;
		}
		return true;
	}


	private static int getNoofPerson(int[][] gates, int i) {
		// TODO Auto-generated method stub
		for (int j = 0; j < gates.length; j++) {
			if(gates[j][0]==i)
				return gates[j][1];
		}
		return 0;
	}


	static	int arr_b[][];
	static int s=0;
	private static void perm1(int[] arr, int n) {
		// TODO Auto-generated method stub
		if(n==1)
		{
			
			for (int i = 0; i < arr.length; i++) {
				//System.out.print(arr[i]);
				arr_b[s][i] = arr[i];
				
			}
			s++;
			//System.out.println();
			return;
		}
		for (int i = 0; i < n; i++) {
            swap(arr, i, n-1);
            perm1(arr, n-1);
            swap(arr, i, n-1);
        }
			
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i] =  arr[j];
		arr[j] = temp;
	}

}
