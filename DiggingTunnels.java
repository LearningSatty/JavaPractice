package com.satty.practice;

import java.util.Scanner;


public class Digging_Tunnels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int N1 = 200;
//		int a[] = {1, 2};
//		call_perm(a,  N1, 0, "", 0);
		
		Scanner sc = new Scanner(System.in);
		int t_cases = sc.nextInt();
		for (int t = 0; t < t_cases; t++) {
			int N = sc.nextInt();
			int H = sc.nextInt();
			int V = sc.nextInt();
			int arr[][] = new int[V][H];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			int cranes[][] = new int[2][3];
			for (int i = 0; i < cranes.length; i++) {
				cranes[i][0] = sc.nextInt();
				cranes[i][1] = sc.nextInt();
				cranes[i][2] = sc.nextInt();
			}
			int final_row_min[] = new int[arr.length];
			for (int i = 0; i < arr.length; i++) {
					final_cost_row = Integer.MAX_VALUE;
//					call_perm(a,  arr[0].length, 0, "", 0, cranes, arr[i]);
					perm_bfs(arr[i], 0, "", cranes);
					perm_bfs(arr[i],  arr[0].length-1, "", cranes);
					final_row_min[i] = final_cost_row;
			}
			int[] data = new int[N];
			final_answer = Integer.MAX_VALUE;
			comb_(0, final_row_min, data, final_row_min.length,	N, 0, cranes);
			System.out.println("Case #"+(t+1));
			System.out.println(final_answer);
		}
	}
	static  int final_answer;
	private static void comb_(int index,int[] arr,int[] data,  int N, int R, int count, int[][] cranes){
		if(count==R)
		{
			int sum = arr[data[0]];
			for (int i = 1; i < data.length; i++) {
				sum = sum + arr[data[i]]+(((cranes[0][2]*cranes[0][2])+(cranes[1][2]*cranes[1][2]))*(data[i]-data[i-1]));
				
			}
			if(sum<final_answer)
				final_answer = sum;
			return;
		}
		
 		for (int i = index; i <N ; i++) {
			data[count] = i; 
			comb_(i+2, arr,data, N, R, count+1, cranes);
			data[count] = 0; 
		}
	}
	static int final_cost_row ;
	private static void call_perm(int[] a, int n,int cur, String string, int index, int[][] cranes, int[] arr) {
		// TODO Auto-generated method stub
 		if(cur==n){
			System.out.println(string);
			int arr_fin[] = new int[string.length()];
			for (int i = 0; i < string.length(); i++) {
				arr_fin[i] = Character.getNumericValue(string.charAt(i));
			}
			int cost =0;
			int last_machine = arr_fin[0];
			int side_index_x = 0; int side_index_y = arr.length-1;
			if(arr_fin[0]==0)
			{
				cost = cranes[arr_fin[0]][0]*arr[side_index_x];
				side_index_x++;
			}
			else
			{
				cost = cranes[arr_fin[0]][0]*arr[side_index_y];
				side_index_y--;
			}
			for (int i = 1; i < arr_fin.length; i++) {
				if(arr_fin[i]==0)
				 {
					cost = cost + (cranes[arr_fin[i]][0]*arr[side_index_x]); 
					side_index_x++;
				 }
				else
				{
					cost = cost + (cranes[arr_fin[i]][0]*arr[side_index_y]); 
					side_index_y--;
				}
				if(last_machine==arr_fin[i]  )
					cost = cost + cranes[arr_fin[i]][1];
				last_machine = arr_fin[i];
			}
			if(final_cost_row>cost)
				 final_cost_row = cost;
			System.out.println(cost);
			return;
		}
       	for (int i = 0; i < a.length; i++) {
			call_perm(a,  n, cur+1,	 string+""+a[i], i, cranes, arr);
		}
	}

	private static void perm_bfs(int[] arr,  int start,  String string, int[][] cranes) {
		// TODO Auto-generated method stub
		MyPermQueue mpq = new MyPermQueue(arr.length*arr.length);
		int arr_vis1[] = new int[arr.length];
		arr_vis1[start] = 1;
		if(start==0)
			mpq.insert(new MyPermData(1, arr[start]*cranes[0][0], ""+start, 1, arr.length-1, arr_vis1));
		else
			mpq.insert(new MyPermData(2, arr[start]*cranes[1][0], ""+start, 0, arr.length-2, arr_vis1));
		
		while(!mpq.isEmpty()){
			MyPermData data = mpq.remove();
			String path = data.path;
			int x = data.x;
			int y = data.y;
			int value = data.value;
			int level = data.level;
			int arr_vis[] = data.arr_vis;
			if(x==y)
			{
				int final_val = 0;
//				System.out.println(path+x);
				if(level==1)
					final_val = (value+ (arr[x]*cranes[0][0])+cranes[0][1]);
				else
					final_val = (value+ (arr[x]*cranes[0][0]));
//				System.out.println(final_val);
				if(final_val<final_cost_row)
					final_cost_row = final_val;
				if(level==2)
					final_val = (value+ (arr[x]*cranes[1][0])+cranes[1][1]);
				else
					final_val = (value+ (arr[x]*cranes[1][0]));
//				System.out.println(final_val);
				if(final_val<final_cost_row)
					final_cost_row = final_val;
				continue;
			}
			
			if(arr_vis[x]!=1)
			{
				arr_vis[x] = 1;
				if(level==1)
					mpq.insert(new MyPermData(1, value+ (arr[x]*cranes[0][0])+cranes[0][1], path+x, x+1, y, arr_vis));
				else
					mpq.insert(new MyPermData(1, value+ (arr[x]*cranes[0][0]), path+x, x+1, y, arr_vis));
				arr_vis[x] = 0;
			}
			if(arr_vis[y]!=1){
				arr_vis[y] = 1;
				if(level==2)
					mpq.insert(new MyPermData(2, value+ (arr[y]*cranes[1][0])+cranes[1][1], path+y, x, y-1, arr_vis));
				else
					mpq.insert(new MyPermData(2, value+ (arr[y]*cranes[1][0]), path+y, x, y-1, arr_vis));
				arr_vis[y] = 0;
			}
				
		}
	}
}

class MyPermQueue{
	MyPermData data[];
	int front, rear;
	int max_size;
	
	
	public MyPermQueue(int size) {
		// TODO Auto-generated constructor stub
		this.max_size = size;
		data = new MyPermData[this.max_size];
		front = 0;
		rear = -1;
	}
	
	public void insert(MyPermData temp){
		if(rear==max_size-1)
			rear = -1;
		rear++;
		data[rear] = temp;
	}
	
	public MyPermData remove(){
		MyPermData temp = data[front++];
		if(front==max_size)
			front = 0;
		return temp;
	}
	
	public boolean isEmpty(){
		return ((front==rear+1) || (front+max_size-1==rear));
	}
}

class MyPermData{
	int level;
	int value;
	String path;
	int x; int y;
	int[] arr_vis;
	public MyPermData(int level, int value, String path, int x, int y, int[] arr_vis) {
		super();
		this.level = level;
		this.value = value;
		this.path = path;
		this.x = x;
		this.y = y;
		this.arr_vis = new int[arr_vis.length];
		for (int i = 0; i < arr_vis.length; i++) {
			this.arr_vis[i] = arr_vis[i];
		}
	}
}
