package com.satty.practice;

public class PermutationArray {

	static int arr_b[][] = new int[24][4];
	static int score=0;
	static int temp_score=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={1, 2, 3, 4};
		
		perm1(arr, arr.length);
		System.out.println();
		for (int i = 0; i < arr_b.length; i++) {
			int[] arr_temp = arr_b[i];
			if(temp_score>score)
				score = temp_score;
			temp_score=0;
			int visited_arr[] = new int[arr.length];
		}
		
	}
	static int s=0;
	private static void perm1(int[] arr, int n) {
		// TODO Auto-generated method stub
		if(n==1)
		{
			
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
				arr_b[s][i] = arr[i];
				
			}
			s++;
			System.out.println();
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
/*
2341
3241
3421
4321
2431
4231
4312
3412
3142
1342
4132
1432
2413
4213
4123
1423
2143
1243
2314
3214
3124
1324
2134
1234
*/
