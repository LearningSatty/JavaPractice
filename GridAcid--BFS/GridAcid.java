package com.satty.practice;

import java.util.Scanner;

public class GridAcid {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t_cases = sc.nextInt();
		for (int t = 0; t < t_cases; t++) {
			int row = sc.nextInt();
			int col = sc.nextInt();
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			int arr[][] = new int[row][col];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					arr[i][j] = sc.nextInt();
					if(arr[i][j]==2)
					{
						xx1=i;
						yy1=j;
					}
				}
			}
			if(xx1==0 || yy1==0 || xx1==arr.length-1 || yy1==arr[0].length-1 || (!AnyOneZeroDir(arr, xx1, yy1)))
			{
				System.out.println("Case #"+(t+1));
				System.out.println("-1"+" "+"-1");
				continue;
			}
			
			e_cell_time = Integer.MAX_VALUE;
			full_grid_time = -1;
			int arr_vis[][] = new int[row][col];
			startTraverse(arr, arr_vis, x, y);
			System.out.println("Case #"+(t+1));
			if(e_cell_time== Integer.MAX_VALUE)
			{
				e_cell_time = -1;
				full_grid_time = -1;
			}
			System.out.println(e_cell_time+" "+full_grid_time);
		}
		sc.close();
	}
	static int xx1;
	static int yy1;

	private static boolean checkAll4OneDir(int[][] arr, int x, int y) {
		// TODO Auto-generated method stub
		int s[]	={0, 1, 0, -1};
		int t[] ={1, 0, -1, 0};
		for (int i = 0; i < t.length; i++) {
			if( arr[x+s[i]][y+t[i]]!=1){
				return false;
			}
		}
		return true;
	}
	
	private static boolean AnyOneZeroDir(int[][] arr, int x, int y) {
		// TODO Auto-generated method stub
		int s[]	={0, 1, 0, -1};
		int t[] ={1, 0, -1, 0};
		for (int i = 0; i < t.length; i++) {
			if( arr[x+s[i]][y+t[i]]==0){
				return false;
			}
		}
		return true;
	}

	private static int e_cell_time;
	private static int full_grid_time;
	
	private static void startTraverse(int[][] arr, int[][] arr_vis, int x,
			int y) {
		// TODO Auto-generated method stub
		MyAcidQ qu = new MyAcidQ((arr.length-1) *  (arr[0].length-1));
		arr_vis[x][y] = 1;
		qu.insert(new MyAcidData(x, y, 0, 1));
		boolean b = true;
		int t2 = 0;
		while(!qu.isEmpty()){
			MyAcidData d = qu.remove();
			int xx =  d.x;
			int yy = d.y;
			int t1 = d.t1;
			t2 = d.t2_grid;
			
			int s[]	={0, 1, 0, -1};
			int t[] ={1, 0, -1, 0};
			for (int i = 0; i < t.length; i++) {
				
				if(xx+s[i]>=0 && xx+s[i]<arr.length && yy+t[i]>=0 && yy+t[i]<arr[0].length && arr[xx+s[i]][yy+t[i]]!=0 && arr_vis[xx+s[i]][yy+t[i]]!=1){
					if(arr[xx+s[i]][yy+t[i]]==2  )
					{
						if(checkAll4OneDir(arr_vis, xx1, yy1)){
						if(b){
							arr_vis[xx1][yy1] = 1;
							e_cell_time = t2;
							b = false;
						}
						}
						continue;
					}		
					
					arr_vis[xx+s[i]][yy+t[i]] = 1;
					qu.insert(new MyAcidData(xx+s[i], yy+t[i], t1+1, t2+1));
				}
				
			}
			
		}
		if(isGridMelt(arr_vis, arr))
			full_grid_time = t2;
		else
			full_grid_time = -1;
	}

	private static boolean isGridMelt(int[][] arr_vis, int[][] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr_vis.length; i++) {
			for (int j = 0; j < arr_vis[0].length; j++) {
				if(arr_vis[i][j]==0 && arr[i][j]!=0)
					return false;
			}
		}
		return true;
	}


}

class MyAcidQ{
	private MyAcidData[] d;
	private int max_capacity;
	private int front;
	private int rear;
	
	public MyAcidQ(int s) {
		// TODO Auto-generated constructor stub
		max_capacity = s;
		d = new MyAcidData[max_capacity];
		front =0;
		rear = -1;
	}			
	
	public void insert(MyAcidData temp){
		if(rear==max_capacity-1)
			rear = -1;
		rear++	;
		d[rear] = temp;
	}
	
	public MyAcidData remove(){
		MyAcidData temp = d[front++];
		if(front==max_capacity)
			front  = 0;
		return temp;
	}
	
	public boolean isEmpty(){
		return ((rear+1==front) || (front+max_capacity-1==rear)); 
	}
}

class MyAcidData {
	int x;
	int y;
	int t1;
	int  t2_grid;
	public MyAcidData(int x, int y, int cost, int path) {
		super();
		this.x = x;
		this.y = y;
		this.t1 = cost;
		this.t2_grid = path;
	}

	
}
