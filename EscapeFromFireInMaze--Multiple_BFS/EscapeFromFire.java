package com.satty.practice;

import java.util.Scanner;

class EscapeFromFire{
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t_cases = sc.nextInt();
		for (int t = 0; t < t_cases; t++) {
			int row = sc.nextInt();
			int col = sc.nextInt();
			char[][] arr = new char[row][col];
			int[] x_fire=new int[row*col];
			int[] y_fire=new int[row*col];
			int count=0;
			int x_joe=0, y_joe=0;
			for (int i = 0; i < arr.length; i++) {
				String s = sc.next();
				for (int j = 0; j < s.length(); j++) {
					
					if(s.charAt(j)=='F')
					{
						x_fire[count] = i;
						y_fire[count] = j;
						count++;
					}
					else if(s.charAt(j)=='J')
					{
						x_joe = i;
						y_joe = j;
					}
					arr[i][j] = s.charAt(j);
				}
			}
			int[][] arr_vis = new int[row][col];
			
			final_time = Integer.MAX_VALUE;
			//startTraversing(arr, arr_vis, arr_vis_fire, m, n, 0);
			arr_vis_fire = new int[row][col];
			for (int i = 0; i < count; i++) {
				startBFSForFire(arr, row, col, x_fire[i], y_fire[i]);
			}
			
			MyFireQueue qu2 = new MyFireQueue(row*col);
			arr_vis[x_joe][y_joe] = 1;
			qu2.insert(new MyFireData(x_joe, y_joe, 0, null));
			while(!qu2.isEmpty()){
				MyFireData d = qu2.remove();
				int xx = d.x;
				int yy = d.y;
				int cost = d.cost;
				
				if(xx==0 || xx==arr.length-1 || yy==0 || yy==arr[0].length-1){
					if(cost<final_time)
						final_time =  cost;
					continue;
				}
				int x[] = {1, 0, -1, 0};
				int y[] = {0, -1, 0, 1};
				
				for (int k = 0; k < y.length; k++) {
					if(xx+x[k]>=0 && xx+x[k]<arr.length && yy+y[k]>=0 && yy+y[k]<arr[0].length && arr[xx+x[k]][yy+y[k]]!='#' && arr_vis_fire[xx+x[k]][yy+y[k]]>cost+1
							&& arr_vis[xx+x[k]][yy+y[k]]!=1){
						arr_vis[xx+x[k]][yy+y[k]] = 1;
						qu2.insert(new MyFireData(xx+x[k],  yy+y[k], cost+1, null));
					}
				}
				
			}
			
			
			if(final_time==Integer.MAX_VALUE)
				System.out.println("IMPOSSIBLE");
			else
				System.out.println(final_time+1);
			
		}
	}
	static int[][] arr_vis_fire;
	private static void startBFSForFire(char[][] arr, int row, int col, int x_fire, int y_fire) {
		// TODO Auto-generated method stub
		
		int[][] arr_visited_fire = new int[row][col];
		MyFireQueue qu = new MyFireQueue(row*col);
		arr_visited_fire[x_fire][y_fire] = 1;
		qu.insert(new MyFireData(x_fire, y_fire, 0, null));
		while(!qu.isEmpty()){
			MyFireData d = qu.remove();
			int xx = d.x;
			int yy = d.y;
			int cost = d.cost;
			
			int x[] = {1, 0, -1, 0};
			int y[] = {0, -1, 0, 1};
			
			for (int k = 0; k < y.length; k++) {
				if(xx+x[k]>=0 && xx+x[k]<arr.length && yy+y[k]>=0 && yy+y[k]<arr[0].length && arr[xx+x[k]][yy+y[k]]!='#' && arr_visited_fire[xx+x[k]][yy+y[k]]==0){
					arr_visited_fire[xx+x[k]][yy+y[k]] = 1;
					if(arr_vis_fire[xx+x[k]][yy+y[k]]==0 )
							arr_vis_fire[xx+x[k]][yy+y[k]] = cost+1;
					else {
						if((cost+1<arr_vis_fire[xx+x[k]][yy+y[k]]))
							arr_vis_fire[xx+x[k]][yy+y[k]] = cost+1;
					}
					qu.insert(new MyFireData(xx+x[k],  yy+y[k], cost+1, null));
				}
			}
			
		}
	}

	private static int final_time;
	


}

class MyFireData {
	int x;
	int y;
	int cost;
	String path;
	public MyFireData(int x, int y, int cost, String path) {
		super();
		this.x = x;
		this.y = y;
		this.cost = cost;
		this.path = path;
	}

	
}

class MyFireQueue{
	private MyFireData[] d;
	private int max_capacity;
	private int front;
	private int rear;
	
	public MyFireQueue(int s) {
		// TODO Auto-generated constructor stub
		max_capacity = s;
		d = new MyFireData[max_capacity];
		front =0;
		rear = -1;
	}			
	
	public void insert(MyFireData temp){
		if(rear==max_capacity-1)
			rear = -1;
		rear++	;
		d[rear] = temp;
	}
	
	public MyFireData remove(){
		MyFireData temp = d[front++];
		if(front==max_capacity)
			front  = 0;
		return temp;
	}
	
	public boolean isEmpty(){
		return ((rear+1==front) || (front+max_capacity-1==rear)); 
	}
}
