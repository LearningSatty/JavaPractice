package com.satty.nonsamsung;

public class CombinationAndPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={1, 2, 3, 4, 5};
		int R = 2;
		int[] data = new int[R];
		total_comb = 0;
		System.out.println("Printing Combination to select "+R+" out of "+arr.length +" Elements");
		comb_(0,arr, data, arr.length, R, 0);
		System.out.println("Total Combination("+arr.length+"C"+R+"): "+total_comb);
		System.out.println("************************************************************");
		
		System.out.println("Printing Permuation of "+arr.length+" Elements");
		total_perm = 0;
		int arr_vis[] = new int[arr.length];
		perm(arr, arr_vis, "");
		System.out.println("Total Permuation("+arr.length+"!) : "+total_perm);
	}
	static int total_comb ;
	static int total_perm ;
	//////Combination 		////// 
	private static void comb_(int index,int[] arr,int[] data,  int N, int R, int count){
		if(count==R)
		{
			for (int i = 0; i < data.length; i++) {
				System.out.print(data[i]+" ");
			}
			System.out.println();
			total_comb++;
			return;
		}
		
 		for (int i = index; i <N ; i++) {
			data[count] = arr[i]; 
			comb_(i+1, arr,data, N, R, count+1);
			data[count] = 0; 
		}
	}
	//////Combination 		////// 
	
	//////   Permutation 		////// 
	private static void perm(int[] arr, int[] arr_vis, String path){
		
		if(isAllVisited(arr_vis)){
			System.out.println(path);
			total_perm++;
			return;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr_vis[i]!=1)
			{
				arr_vis[i] = 1;
				perm(arr, arr_vis, path+arr[i]);
				arr_vis[i] = 0;
			}
		}
		
	}
	
	private static boolean isAllVisited(int[] arr_vis) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr_vis.length; i++) {
			if(arr_vis[i]==0)
				return false;
		}
		return true;
	}
	
	//////Permutation		////// 
	
}
