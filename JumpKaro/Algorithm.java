/*
You should use the statndard input/output

in order to receive a score properly.

Do not use file input and output

Please be very careful. 
*/

import java.util.Scanner;

/*
   As the name of the class should be Algorithm , using Algorithm.java as the filename is recommended.
   In any case, you can execute your program by running 'java Algorithm' command.
 */
class Algorithm {
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t_cases = sc.nextInt();
		for (int t = 0; t < t_cases; t++) {
			int row = sc.nextInt();
			int col	= sc.nextInt();
			int arr[][] = new int[row][col];
			int my_point_x=0, my_point_y = 0;
			int dest_point_x=0, dest_point_y = 0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					arr[i][j] = sc.nextInt();
					if(arr[i][j]==2){
						my_point_x = i	;
						my_point_y = j;
					}
					else if(arr[i][j]==3){
						dest_point_x = i;
						dest_point_y = j;
					}
						
				}
			}
			found = false;
			System.out.println("Case #"+(t+1));
			for (int i = 1; i < arr.length; i++) {
				int arr_vis[][] = new int[arr.length][arr[0].length];
				arr_vis[my_point_x][my_point_y] = 1;
				callBFS(arr, arr_vis, my_point_x, my_point_y, dest_point_x, dest_point_y, i);
				if(found)
				{
					System.out.println(i);
					break;
				}
			}
			
		}
	}
	static boolean found;
	private static void callBFS(int[][] arr, int[][] arr_vis, int my_point_x1,
			int my_point_y1, int dest_point_x, int dest_point_y, int j) {
		// TODO Auto-generated method stub
		MyBQueue qu = new MyBQueue(arr.length*(arr[0].length-1));
		qu.insert(new MyBData(my_point_x1, my_point_y1, 0));
		while(!qu.isEmpty()){
			MyBData dd = qu.remove();
			int my_point_x = dd.x;
			int my_point_y = dd.y;
			if(my_point_x==dest_point_x && my_point_y==dest_point_y	){
				found = true;
				break;
			}
			for (int k = 0; k < j; k++) {
				int x[] ={0, j-k, -(j-k), 0};
				int y[] ={1, 0, 0, -1};
			
			for (int i = 0; i < y.length; i++) {
				if(my_point_x+x[i]>=0 && my_point_x+x[i]<arr.length && my_point_y+y[i]>=0 
						&& my_point_y+y[i]<arr[0].length && arr_vis[my_point_x+x[i]][my_point_y+y[i]]!=1 && 
						arr[my_point_x+x[i]][my_point_y+y[i]]!=0){
					arr_vis[my_point_x+x[i]][my_point_y+y[i]] =1;
					qu.insert(new MyBData(my_point_x+x[i], my_point_y+y[i], 0));
				}
			}
			}
		}
		
	}


}
class MyBQueue{

	MyBData[] data;
	int max_size;
	int front, rear;
	
	public MyBQueue(int size){
		data = new MyBData[size];
		this.max_size = size;
		front = 0; rear = -1;
	}
	
	public void insert(MyBData d){
		if(rear==max_size-1){
			rear = -1;
		}
		rear++;
		data[rear] = d;
	}
	
	public MyBData remove(){
		MyBData temp = data[front++];
		if(front==max_size){
			front = 0;
		}
		return temp;
	}
	
	public boolean isEmpty(){
		return ((rear+1==front) || (front+max_size-1==rear));
	}

}

class MyBData{
	int x, y, cost;

	public MyBData(int x, int y, int cost) {
		super();
		this.x = x;
		this.y = y;
		this.cost = cost;
	}
}
