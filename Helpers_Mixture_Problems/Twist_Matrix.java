
import java.util.Scanner;


public class Twist_Matrix {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T_case = sc.nextInt();
		for (int t = 0; t < T_case; t++) {
			int row=sc.nextInt();
			int col= sc.nextInt();
			int arr[][] = new int[row][col];
			for (int i = 0; i < row	; i++) {
				for (int j = 0; j < col; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			isTwistable = false;
			call_twisting(arr,0, 0);
			System.out.println("Case #"+(t+1));
			System.out.println(isTwistable);
		}
		sc.close();
	}
	static boolean isTwistable;
	private static void call_twisting(int[][] arr, int i, int count) {
		// TODO Auto-generated method stub
		if(count>4)
			return;
		if(count<=4)
		{
			if(!isTwistable){
			boolean b = true;
			int s = 1;
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr[0].length; k++) {
					if(arr[j][k]!=s)
					{
						b = false; break;
					}
					s++;
				}
			}
			if(b){
				isTwistable = true;
				System.out.println(isTwistable);
			}
			}
			
		}
		for (int j = i; j < (arr.length+arr[0].length); j++) {
			int arr_temp[][] = new int[arr.length][arr[0].length];
			for (int k = 0; k < arr.length; k++) {
				for (int l = 0; l < arr[0].length; l++) {
					arr_temp[k][l] = arr[k][l];
				}
			}
			twistRoworCol(j, arr);
			call_twisting(arr, j, count+1);
			for (int k = 0; k < arr.length; k++) {
				for (int l = 0; l < arr[0].length; l++) {
					arr[k][l] = arr_temp[k][l];
				}
			}
		}
	}
	private static void twistRoworCol(int j, int[][] arr) {
		// TODO Auto-generated method stub
		if(j<=arr.length-1){
			for (int k = 0; k < arr[0].length/2; k++) {
				int temp = arr[j][arr[0].length-k-1];
				arr[j][arr[0].length-k-1] = arr[j][k];
				arr[j][k] = temp;
			}
		}
		else{
;			j= j - arr.length;
			for (int k = 0; k < arr.length/2; k++) {
				int temp = arr[arr.length-k-1][j];
				arr[arr[0].length-k-1][j] = arr[k][j];
				arr[k][j] = temp;
			}
		}
	}
}
