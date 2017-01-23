package com.satty.nonsamsung;

public class Practice {
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int arr_vis[] = new int[arr.length];
		int R = 4;
		int arr_res[] = new int[5];
		System.out.println("Printing Permuation of "+arr.length+" Elements");
		call_Perm(arr,arr_vis,  arr_res, 0);
		System.out.println("Total Permuation("+arr.length+"! or "+arr.length+"P"+arr.length+") : "+total_perm);
		System.out.println("************************************************************");
		
		System.out.println("Printing Permuation of "+R+" numbers from "+arr.length+" Elements");
		arr_res = new int[arr.length];
		call_Perm(arr,arr_vis,  arr_res, 0, arr.length);
		System.out.println("Total Permuation for "+R+" elements ("+arr.length+"P"+R+") : "+total_perm_r);
		System.out.println("************************************************************");
		
		System.out.println("Printing Combination to select "+R+" out of "+arr.length +" Elements");
		arr_res = new int[R];
		call_comb(arr, arr_vis, arr_res, 0, R, 0);
		System.out.println("Total Combination("+arr.length+"C"+R+"): "+total_comb);
		System.out.println("************************************************************");
		
	}
	static int total_comb ;
	static int total_perm ;
	static int total_perm_r ;
	private static void call_comb(int[] arr, int[] arr_vis, int [] result, int count, int R, int index) {
		// TODO Auto-generated method stub
 		if(count==R){
			for (int j = 0; j < result.length; j++) {
				System.out.print(result[j]+" ");
			}
			System.out.println();
			total_comb++;
			return;
		}
		
   		for (int i = index; i < arr.length; i++) {
 			if(arr_vis[i]!=1)
			{
 				arr_vis[i]=1;
 				result[count]= arr[i];
 				call_comb(arr, arr_vis, result, count+1,R,  i+1);
				arr_vis[i]=0;
				result[count]= 0;
			}
		}
		
	}
	private static void call_Perm(int[] arr, int[] arr_vis, int [] result, int count) {
		// TODO Auto-generated method stub
 		if(count==arr.length){
			for (int j = 0; j < result.length; j++) {
				System.out.print(result[j]+" ");
			}
			System.out.println();
			total_perm++;
			return;
		}
		
   		for (int i = 0; i < arr.length; i++) {
 			if(arr_vis[i]!=1)
			{
 				arr_vis[i]=1;
 				result[count]= arr[i];
 				call_Perm(arr, arr_vis, result, count+1);
				arr_vis[i]=0;
				result[count]= 0;
			}
		}
		
	}
	
	private static void call_Perm(int[] arr, int[] arr_vis, int [] result, int count, int R) {
		// TODO Auto-generated method stub
 		if(count==R){
			for (int j = 0; j < result.length; j++) {
				System.out.print(result[j]+" ");
			}
			System.out.println();
			total_perm_r++;
			return;
		}
		
   		for (int i = 0; i < arr.length; i++) {
 			if(arr_vis[i]!=1)
			{
 				arr_vis[i]=1;
 				result[count]= arr[i];
 				call_Perm(arr, arr_vis, result, count+1, R);
				arr_vis[i]=0;
				result[count]= 0;
			}
		}
		
	}


}

class MymQ{
	Data d[];
	int max_size, front, rear;
	public MymQ(int size) {
		this.max_size = size;
		d = new Data[max_size];
		front=0;
		rear = -1;
	}
	
	public void insert(Data temp){
		if(rear==max_size-1){
			rear = -1;
		}
		rear++;
		d[rear] = temp;
	}
	
	public Data remove(){
		Data temp = d[front++];
		if(front==max_size)
			front = 0;
		return temp;	
	}
	
	public boolean isEmpty(){
		return ((rear+1==front)||(front+max_size-1==rear));
	}
}

class Data{
	int x;

	public Data(int x) {
		super();
		this.x = x;
	}
}
