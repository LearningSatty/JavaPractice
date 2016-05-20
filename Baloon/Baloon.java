import java.util.Scanner;


//// Incomplete right now
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
					baloon_vis[index] = 1;
					if(index+1>N && index-1<0){
						score = score + baloon[index];
					}
					else if(index+1<N && index-1>=0)
					{
							score = score + baloon[index-1]*baloon[index+1];
					}
					else if (index+1<N || index-1>=0){
						if(index+1<N)
						{
							score = score + baloon[index+1];
						}
						else
						{
							score = score + baloon[index-1];
						}
					}
					
				}
				if(score>scoreAnswer)
					scoreAnswer = score;
			}
			System.out.println("Case #"+(t+1));
			System.out.println(scoreAnswer);
		}
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
				System.out.print(arr[i]+" ");
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
