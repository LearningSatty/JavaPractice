package com.satty.practice;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class TurnOverGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 60;
//		System.out.println(a<<1);
//		System.out.println(a>>1);
//		System.out.println((a+1)&1);
//		String s ="WXYX";
//		System.out.println((int)s.charAt(0));
//		char ch = (char) (s.charAt(0) ^ ' ');
//		System.out.println(ch);
//		
//		int array[]={3,4,1,3,1,7,2,2,4};
//		int remaining=0;
//		for(int i=0;i < array.length;i++ ) 
//		     remaining^=array[i]; 
//		 System.out.println(remaining);
		
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
			
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr.length; k++) {
					callBFS(arr, j, k);
				}
			}
			
			System.out.println("Case #"+ (i+1));
			if(t_cal==Integer.MAX_VALUE)
				System.out.println("Imposssible");
			else
				System.out.println(t_cal);
			
			
			
			
			
		}
	}
	
	private static int t_cal;
	
	private static  void callBFS(int arr[][],int j,int k){
		int arr_vis[][] = new int[arr.length][arr.length];
		
		Queue<GameData> queue = new ArrayBlockingQueue<GameData>(1000);
		arr_vis[j][k] = 1;
		queue.add(new GameData(j, k, arr[j][k]));
		int cal=0;
		while(!queue.isEmpty()){
			if(checkForSymmetry(arr)){
				if(cal<t_cal)
					t_cal =  cal;
				break;
			}
			else{
				GameData d = queue.remove();
				j = d.i;
				k = d.j;
				int x[] = {0, 1, -1, 0};
				int y[] = {1, 0, 0, -1};
				for (int s = 0; s < y.length; s++) {
					if(j+x[s]>=0 && j+x[s]<arr.length &&  k+y[s]>=0 && k+y[s]<arr.length && arr_vis[j+x[s]][k+y[s]]!=1){
						arr[j+x[s]][k+y[s]] = arr[j+x[s]][k+y[s]]==0?1:0; 
						arr_vis[j+x[s]][k+y[s]] =1;
						queue.add(new GameData(j+x[s], k+y[s], arr[j+x[s]][k+y[s]]));
					}
				}
			}
		}
	}

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

class GameData{
	int i, j;
	int value;

	public  GameData(int i, int j, int value) {
		super();
		this.i = i;
		this.j = j;
		this.value = value;
	}
	
}
