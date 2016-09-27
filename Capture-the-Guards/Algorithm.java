
import java.util.Scanner;

class Node
{
	public int X;
	public int Y;
	public int D;

	public Node (int x, int y, int d)
	{
		X=x;
		Y=y;
		D=d;
	}
}

public class Algorithm {		

	public static int rows;
	public static int cols;
	public static int [][] input;
	public static Node[] queue; 
public static int min;
	public static int front =0;
	public static int rear = -1;
	public static int count=0;
	public static boolean[][] visited;
	public static int[] dx = {-1,1,0,0};
	public static int[] dy = {0,0,-1,1};
	public static int type;
	public static int [][] guards;
	public static int guardCount;
	public static int [][][] distance;
		public static void main(String args[]) throws Exception	{
			Scanner sc = new Scanner(System.in);
			//Scanner sc = new Scanner(new FileInputStream("C:\\Users\\test5\\workspace\\test\\src\\Guards\\input.txt"));
			
			int T = sc.nextInt();			
			
			for(int test_case = 0; test_case < T; test_case++) {				

				rows = sc.nextInt();
				cols = rows;
				guardCount = sc.nextInt();
				input = new int[rows][cols];
				min = Integer.MAX_VALUE;
				for (int i = 0; i < rows; i++) {
					for (int j = 0; j <cols; j++) {
						input[i][j] = sc.nextInt();
					}
				}
				guards = new int [guardCount][2];
				distance = new int[rows][cols][guardCount];
                
                for (int i = 0; i < rows; i++) {
					for (int j = 0; j < cols; j++) {
						for (int j2 = 0; j2 < guardCount; j2++) {
							distance[i][j][j2] = -1;
						}
					}
				}
                
				for (int i = 0; i < guardCount; i++) {
					int gr = sc.nextInt();
					int gc = sc.nextInt();
					guards[i][0] =gr;
					guards[i][1] =gc;
					
				}
				
				for (int i = 0; i < guardCount; i++) {
					visited = new boolean[rows][cols];
					queue = new Node[(rows*cols) +1];			
					
					front =0;
					rear =-1;
					count =0;
					type = i;
					Enqueue(guards[i][0],guards[i][1],0);
					BFS();
				}
				for (int i = 0; i < rows; i++) {
					for (int j = 0; j < cols; j++) {
					  int dis =0;
					  if(input[i][j] !=0)
                        {
						  boolean temp = true;
						  int c =0;
							for (int j2 = 0; j2 < guardCount; j2++) {
								//if(temp)
								//{
									if(distance[i][j][j2] >0)
									{
										if(dis< distance[i][j][j2])
										{
											dis =  distance[i][j][j2];
										}
										c++;
									}
									//else
									//{
									//	temp = false;
									//	dis=0;
									//}
								//}
							}
							if(c == guardCount)
							{
								if(dis != 0 && min > dis)
								{
									min = dis;
								}
							}
                        }						
					}
				}
				if(min == Integer.MAX_VALUE)
                {
                  //  min = 0;
                }
				System.out.println(min);
			}
	}
	
	public static void BFS()
	{
		while(!IsEmpty())
		{
			Node n = Dequeue();
			if(n!=null)
			{				
				Traverse(n);				
			}
		}
	}
	
	public static void Traverse(Node n)
	{
		int x = n.X;
		int y = n.Y;
		int d = n.D;

		for (int i = 0; i < dx.length; i++) {
			int newX = x+dx[i];
			int newY = y+dy[i];
			if(newX >= 0 && newX < rows && newY >= 0 && newY < cols)
			{
				if(!visited[newX][newY] && input[newX][newY] ==1  )
				{
					visited[newX][newY] = true;

					Enqueue(newX,newY, d+1);
				}
			}
		}		
	}
	
	public static void Enqueue(int x, int y, int d)
	{
		Node n = new Node(x,y,d);
		
		visited[x][y] = true;
		distance[x][y][type] = d;
		rear++;
		queue[rear] = n;
		count++;
	}
	
	public static Node Dequeue()
	{
		Node n = null;
		if(!IsEmpty())
		{
			count--;
			n=  queue[front];
			front++;
		}
		
		return n;
	}
	
	public static boolean IsEmpty()
	{
		return count==0;
	}
	public static boolean IsGuardPosition(int x, int y)
	{
		boolean isPresent = false;
		for (int i = 0; i < guardCount; i++) {
			if(x==guards[i][0] && y == guards[i][1] )
			{
				isPresent = true;
				break;
				
			}

		}
		
		return isPresent;
	}
}
