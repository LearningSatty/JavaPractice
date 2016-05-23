
import java.util.Scanner;

public class Baloon {

	static int[][] arr_b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T_case = sc.nextInt();
		for (int t = 0; t < T_case; t++) {
			int N=sc.nextInt();
			int baloon[] = new int[N];
			for (int i = 0; i < N; i++) {
				baloon[i] = sc.nextInt();
			}
			s=0;
			arr_b = new int[calcFactorial(N)][N];
			perm1(baloon, N);
			int scoreAnswer =0;
			for (int i = 0; i < arr_b.length; i++) {
				int[] sq = arr_b[i];
				int[] baloon_vis = new int[N];
				int score =0;
				for (int j = 0; j < sq.length; j++) {
					int b_baloon =  sq[j];
					int index=0;
					for (int k = 0; k < baloon.length; k++) {
						if(baloon[k]==b_baloon)
						{
							index = k;break;
						}
					}
					
					int index_left = findUnvisitedOnLeft(index, baloon_vis);
					int index_right = findUnvisitedOnRight(index, baloon_vis);
					if(index_left==-1 && index_right==-1){
						score = score + baloon[index];
					}
					else if(index_left!=-1 && index_right!=-1)
					{
							
							score = score + baloon[index_left]*baloon[index_right];
					}
					else if (index_left!=-1 || index_right!=-1){
						if(index_left!=-1)
						{
							score = score + baloon[index_left];
						}
						else
						{
							score = score + baloon[index_right];
						}
					}
					baloon_vis[index] = 1;
				}
				if(score>scoreAnswer)
					scoreAnswer = score;
			}
			System.out.println("Case #"+(t+1));
			System.out.println(scoreAnswer);
		}
	}

	
	private static int findUnvisitedOnRight(int index, int[] baloon_vis) {
		// TODO Auto-generated method stub
		
		for (int i = index+1; i < baloon_vis.length; i++) {
			if(baloon_vis[i]==0)
			{
				return i;
			}
		}
		return -1;
	}


	private static int findUnvisitedOnLeft(int index, int[] baloon_vis) {
		// TODO Auto-generated method stub
		
		for (int i = index-1; i >= 0; i--) {
			if(baloon_vis[i]==0)
				return i;
		}
		return -1;
	}


	static int calcFactorial(int n){
		if(n==0 || n==1)
			return 1;
		else{
			return n*calcFactorial(n-1);
		}
	}
	
	static int s=0;
	private static void perm1(int[] arr, int n) {
		// TODO Auto-generated method stub
		if(n==1)
		{
			
			for (int i = 0; i < arr.length; i++) {
				//System.out.print(arr[i]+" ");
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
