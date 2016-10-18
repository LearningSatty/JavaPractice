package com.satty.nonsamsung;

import java.util.Scanner;

public class Fill_Oil_In_Cars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t_cases = sc.nextInt();
		for (int t = 0; t < t_cases; t++) {
			int cars = sc.nextInt();
			int arr[] = new int[cars+2];
			arr[0] = 111;
			arr[arr.length-1] = 222;
			for (int i = 1; i < arr.length-1; i++) {
				arr[i] = sc.nextInt();
			}
			int arr_visited[] = new int[cars+2];
			final_min_move = Integer.MAX_VALUE;
			call_BackTracking(arr, arr_visited, 1, 2, 0, 0,"G->");
			System.out.println("Case #"+(t+1));
			System.out.println(final_min_move);
		}
	}

	static int final_min_move;
	private static void call_BackTracking(int[] arr, int[] arr_visited, int oil_mode, int oil_quan,int cur_loc, int moves, String path) {
		// TODO Auto-generated method stub
		if(moves>=final_min_move)
		{
			if(path.startsWith("G->car2filled ->G->car6filled ->car7filled ->P->car5filled")){
//			System.out.println(path);
//			System.out.println(moves);
			}
			return;
		}
		if(AllVisited(arr_visited)){
			if(moves< final_min_move)
				final_min_move = moves;
//			System.out.println(path);
//			System.out.println(moves);
			return; 
		}
		if(oil_quan>=1){
 		for (int i = 1; i < arr.length-1; i++) {
			if(arr[i]==oil_mode && arr_visited[i]!=1)
			{
				arr_visited[i] = 1; 
				call_BackTracking(arr, arr_visited, oil_mode, oil_quan-1, i, moves+Math.abs(i-cur_loc), path+"car"+(i-1)+"filled ->");
				arr_visited[i] = 0;
				
			}
		}
		}
		if(oil_quan<=1 ){
			if(AllCurModeVisited(arr, arr_visited, oil_mode)){
				int loc = oil_mode==1?arr.length-1 :0;
				call_BackTracking(arr, arr_visited, oil_mode==1?2:1, 2, oil_mode==1?arr.length-1 :0 , moves+(Math.abs(cur_loc-loc)), path+(oil_mode==1?"P":"G")+"->");
			}
			else{
				int loc = oil_mode==1?0:arr.length;
				call_BackTracking(arr, arr_visited, oil_mode, 2, oil_mode==1?0:arr.length-2 , moves+(Math.abs(cur_loc-loc)), path+(oil_mode==2?"P":"G")+"->");
				call_BackTracking(arr, arr_visited, oil_mode==1?2:1, 2, oil_mode==1?arr.length-2 :0 , moves+(Math.abs(oil_mode==1?cur_loc-arr.length:cur_loc-0)), path+(oil_mode==1?"P":"G")+"->");
			}
		}
		if(AllCurModeVisited(arr, arr_visited, oil_mode) && oil_quan==2 ){
			int loc = oil_mode==1?arr.length :0;
			call_BackTracking(arr, arr_visited, oil_mode==1?2:1, 2, oil_mode==1?arr.length-2 :0 , moves+(Math.abs(cur_loc-loc)), path+(oil_mode==1?"P":"G")+"->");
		}
	}

	private static boolean AllCurModeVisited(int[] arr, int[] arr_visited, int oil_mode) {
		// TODO Auto-generated method stub
		for (int i = 1; i < arr_visited.length-1; i++) {
			if(arr[i]==oil_mode && arr_visited[i]==0)
				return false;
		}
		return true;
	}

	private static boolean AllVisited(int[] arr_visited) {
		// TODO Auto-generated method stub
		for (int i = 1; i < arr_visited.length-1; i++) {
			if(arr_visited[i]==0)
				return false;
		}
		return true;
	}

}
