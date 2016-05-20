

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class WaterPipeline {

	static int Answer =0;
	static int Row =0;
	static int Col =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T_case = sc.nextInt();
		for (int t = 0; t < T_case; t++) {
			Row=sc.nextInt();
			Col=sc.nextInt();
			int x=sc.nextInt();
			int y=sc.nextInt();
			int N=sc.nextInt();
			int arr[][] = new int[Row][Col];
			int arr_vis[][] = new int[Row][Col];
			for (int i = 0; i < Row; i++) {
				for (int j = 0; j < Col; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			startTraverse(arr, x-1, y-1,N, arr_vis, t);
		}
	}
	
	private static void startTraverse(int[][] arr, int x, int y, int n, int[][] arr_vis, int t) {
//		MyQueue queue = new MyQueue(1000);
		Queue<Data> queue = new ArrayBlockingQueue<Data>(1000);
//		q.add(e)
		if(arr[x][y]==0 || n==0)
		{
			System.out.println("Case #"+ (t+1));
			System.out.println("0");
			return;
		}
		queue.add(new Data(arr[x][y], 1, x, y));
		int node_count=0;
		int level =1;
		arr_vis[x][y] = 1;
		node_count++;
		while(!queue.isEmpty()){
			Data pop_el = queue.remove();
			level = pop_el.level + 1;
			if(pop_el.level>n)
					continue;
			x = pop_el.x;
			y = pop_el.y;
			switch (pop_el.value) {
			case 1:
				int[] dx = {0, 1, 0, -1};
				int[] dy = {1, 0, -1, 0};
				if(x+dx[0]>=0 && x+dx[0]<Row && y+dy[0]>=0 && y+dy[0]<Col && arr_vis[x+dx[0]][y+dy[0]]!=1){
					int dir_type = arr[x+dx[0]][y+dy[0]];
					if(dir_type==1 || dir_type==2 || dir_type==5  || dir_type==7 ){
						queue.add(new Data(arr[x+dx[0]][y+dy[0]],level, x+dx[0], y+dy[0]));
						arr_vis[x+dx[0]][y+dy[0]] = 1;
						node_count++;
					}
				}

				if(x+dx[1]>=0 && x+dx[1]<Row && y+dy[1]>=0 && y+dy[1]<Col && arr_vis[x+dx[1]][y+dy[1]]!=1){
						int dir_type = arr[x+dx[1]][y+dy[1]];
						if(dir_type==1 || dir_type==3 || dir_type==4  || dir_type==5 ){
							queue.add(new Data(arr[x+dx[1]][y+dy[1]],level, x+dx[1], y+dy[1]));
							arr_vis[x+dx[1]][y+dy[1]] = 1;
							node_count++;
						}
					}
				if(x+dx[2]>=0 && x+dx[2]<Row && y+dy[2]>=0 && y+dy[2]<Col && arr_vis[x+dx[2]][y+dy[2]]!=1){
					int dir_type = arr[x+dx[2]][y+dy[2]];
					if(dir_type==1 ||dir_type==2 || dir_type==6  || dir_type==4 ){
						queue.add(new Data(arr[x+dx[2]][y+dy[2]],level, x+dx[2], y+dy[2]));
						arr_vis[x+dx[2]][y+dy[2]] = 1;
						node_count++;
					}
				}
				if(x+dx[3]>=0 && x+dx[3]<Row && y+dy[3]>=0 && y+dy[3]<Col && arr_vis[x+dx[3]][y+dy[3]]!=1){
					int dir_type = arr[x+dx[3]][y+dy[3]];
					if(dir_type==1 || dir_type==3 || dir_type==6  || dir_type==7 ){
						queue.add(new Data(arr[x+dx[3]][y+dy[3]],level, x+dx[3], y+dy[3]));
						arr_vis[x+dx[3]][y+dy[3]] = 1;
						node_count++;
					}
				}
				break;
				
				
			case 2:
				int[] dx2 = {0, 0};
				int[] dy2 = {1, -1};
				if(x+dx2[0]>=0 && x+dx2[0]<Row && y+dy2[0]>=0 && y+dy2[0]<Col && arr_vis[x+dx2[0]][y+dy2[0]]!=1){
					int dir_type = arr[x+dx2[0]][y+dy2[0]];
					if(dir_type==1 || dir_type==2 || dir_type==5  || dir_type==7 ){
						queue.add(new Data(arr[x+dx2[0]][y+dy2[0]],level, x+dx2[0], y+dy2[0]));
						arr_vis[x+dx2[0]][y+dy2[0]] = 1;
						node_count++;
					}
				}
				if(x+dx2[1]>=0 && x+dx2[1]<Row && y+dy2[1]>=0 && y+dy2[1]<Col && arr_vis[x+dx2[1]][y+dy2[1]]!=1){
					int dir_type = arr[x+dx2[1]][y+dy2[1]];
					if(dir_type==1 || dir_type==2 || dir_type==6  || dir_type==4 ){
						queue.add(new Data(arr[x+dx2[1]][y+dy2[1]],level, x+dx2[1], y+dy2[1]));
						arr_vis[x+dx2[1]][y+dy2[1]] = 1;
						node_count++;
					}
				}
				break;
			case 3:
				int[] dx3 = {1, -1};
				int[] dy3 = {0, 0};
				if(x+dx3[0]>=0 && x+dx3[0]<Row && y+dy3[0]>=0 && y+dy3[0]<Col && arr_vis[x+dx3[0]][y+dy3[0]]!=1){
					int dir_type = arr[x+dx3[0]][y+dy3[0]];
					if(dir_type==1 || dir_type==3 || dir_type==4  || dir_type==5 ){
						queue.add(new Data(arr[x+dx3[0]][y+dy3[0]],level, x+dx3[0], y+dy3[0]));
						arr_vis[x+dx3[0]][y+dy3[0]] = 1;
						node_count++;
					}
				}
				if(x+dx3[1]>=0 && x+dx3[1]<Row && y+dy3[1]>=0 && y+dy3[1]<Col && arr_vis[x+dx3[1]][y+dy3[1]]!=1){
					int dir_type = arr[x+dx3[1]][y+dy3[1]];
					if(dir_type==1 || dir_type==3 || dir_type==6  || dir_type==7 ){
						queue.add(new Data(arr[x+dx3[1]][y+dy3[1]],level, x+dx3[1], y+dy3[1]));
						arr_vis[x+dx3[1]][y+dy3[1]] = 1;
						node_count++;
					}
				}
				break;
			case 4:
				int[] dx4 = {0, -1};
				int[] dy4 = {1, 0};
				if(x+dx4[0]>=0 && x+dx4[0]<Row && y+dy4[0]>=0 && y+dy4[0]<Col && arr_vis[x+dx4[0]][y+dy4[0]]!=1){
					int dir_type = arr[x+dx4[0]][y+dy4[0]];
					if(dir_type==1 || dir_type==2 || dir_type==5  || dir_type==7 ){
						queue.add(new Data(arr[x+dx4[0]][y+dy4[0]],level, x+dx4[0], y+dy4[0]));
						arr_vis[x+dx4[0]][y+dy4[0]] = 1;
						node_count++;
					}
				}
				if(x+dx4[1]>=0 && x+dx4[1]<Row && y+dy4[1]>=0 && y+dy4[1]<Col && arr_vis[x+dx4[1]][y+dy4[1]]!=1){
					int dir_type = arr[x+dx4[1]][y+dy4[1]];
					if(dir_type==1 || dir_type==3 || dir_type==6  || dir_type==7 ){
						queue.add(new Data(arr[x+dx4[1]][y+dy4[1]],level, x+dx4[1], y+dy4[1]));
						arr_vis[x+dx4[1]][y+dy4[1]] = 1;
						node_count++;
					}
				}
				break;	
			case 5:
				int[] dx5 = {-1, 0};
				int[] dy5 = {0, -1};
				if(x+dx5[0]>=0 && x+dx5[0]<Row && y+dy5[0]>=0 && y+dy5[0]<Col && arr_vis[x+dx5[0]][y+dy5[0]]!=1){
					int dir_type = arr[x+dx5[0]][y+dy5[0]];
					if(dir_type==1 || dir_type==3 || dir_type==6  || dir_type==7 ){
						queue.add(new Data(arr[x+dx5[0]][y+dy5[0]],level, x+dx5[0], y+dy5[0]));
						arr_vis[x+dx5[0]][y+dy5[0]] = 1;
						node_count++;
					}
				}
				if(x+dx5[1]>=0 && x+dx5[1]<Row && y+dy5[1]>=0 && y+dy5[1]<Col && arr_vis[x+dx5[1]][y+dy5[1]]!=1){
					int dir_type = arr[x+dx5[1]][y+dy5[1]];
					if(dir_type==1 || dir_type==2 || dir_type==6  || dir_type==4 ){
						queue.add(new Data(arr[x+dx5[1]][y+dy5[1]],level, x+dx5[1], y+dy5[1]));
						arr_vis[x+dx5[1]][y+dy5[1]] = 1;
						node_count++;
					}
				}
				break;	
			case 6:
				int[] dx6 = {0, 1};
				int[] dy6 = {1, 0};
				if(x+dx6[0]>=0 && x+dx6[0]<Row && y+dy6[0]>=0 && y+dy6[0]<Col && arr_vis[x+dx6[0]][y+dy6[0]]!=1){
					int dir_type = arr[x+dx6[0]][y+dy6[0]];
					if(dir_type==1 || dir_type==2 || dir_type==5  || dir_type==7 ){
						queue.add(new Data(arr[x+dx6[0]][y+dy6[0]],level, x+dx6[0], y+dy6[0]));
						arr_vis[x+dx6[0]][y+dy6[0]] = 1;
						node_count++;
					}
				}
				if(x+dx6[1]>=0 && x+dx6[1]<Row && y+dy6[1]>=0 && y+dy6[1]<Col && arr_vis[x+dx6[1]][y+dy6[1]]!=1){
					int dir_type = arr[x+dx6[1]][y+dy6[1]];
					if(dir_type==1 || dir_type==3 || dir_type==4  || dir_type==5 ){
						queue.add(new Data(arr[x+dx6[1]][y+dy6[1]],level, x+dx6[1], y+dy6[1]));
						arr_vis[x+dx6[1]][y+dy6[1]] = 1;
						node_count++;
					}
				}
				break;	
			case 7:
				int[] dx7 = {1, 0};
				int[] dy7 = {0, -1};
				if(x+dx7[0]>=0 && x+dx7[0]<Row && y+dy7[0]>=0 && y+dy7[0]<Col && arr_vis[x+dx7[0]][y+dy7[0]]!=1){
					int dir_type = arr[x+dx7[0]][y+dy7[0]];
					if(dir_type==1 || dir_type==3 || dir_type==4  || dir_type==5 ){
						queue.add(new Data(arr[x+dx7[0]][y+dy7[0]],level, x+dx7[0], y+dy7[0]));
						arr_vis[x+dx7[0]][y+dy7[0]] = 1;
						node_count++;
					}
				}
				if(x+dx7[1]>=0 && x+dx7[1]<Row && y+dy7[1]>=0 && y+dy7[1]<Col && arr_vis[x+dx7[1]][y+dy7[1]]!=1){
					int dir_type = arr[x+dx7[1]][y+dy7[1]];
					if(dir_type==1 || dir_type==2 || dir_type==6  || dir_type==4 ){
						queue.add(new Data(arr[x+dx7[1]][y+dy7[1]],level, x+dx7[1], y+dy7[1]));
						arr_vis[x+dx7[1]][y+dy7[1]] = 1;
						node_count++;
					}
				}
				break;	
			}
			
		}
		System.out.println("Case #"+ (t+1));
		System.out.println(node_count);
	}
	
}
	
//	class MyQueue{
//		Data[]	d;
//		int size;
//		int qfqrqoqnqt=-1, rear=-1;
//		public MyQueue(int size) {
//			// TOD Auto-generated constructor stub
//			this.size = size;
//			d = new Data[size];
//		}
//		
//		public void add(Data add_item){
//		    if (rear == size - 1)
//		    	return;
//		    else
//		    {
//		        if (qfqrqoqnqt == - 1)
//		        	qfqrqoqnqt = 0;
//		        rear = rear + 1;
//		        d[rear] = add_item;
//		    }
//		}
//		
//		public Data pop(){
//			if (qfqrqoqnqt == - 1 || qfqrqoqnqt > rear)
//		    {
//		        return null;
//		    }
//		    else
//		    {
//		    	Data temp =  d[qfqrqoqnqt];
//		        qfqrqoqnqt = qfqrqoqnqt + 1;
//		        return temp;
//		    }
//		}
//		
//		public boolean isEmpty()
//		{
//		    if (qfqrqoqnqt ==-1)
//		       return true;
//		    else
//		        return false;
//		}
//	}
	
	class 	Data{
		int value;
		int level;
		int x, y;
		public Data(int value, int level, int x, int y) {
			// TODO Auto-generated constructor stub
			this.value = value;
			this.level = level;
			this.x = x;
			this.y = y;
		}
	}
	



