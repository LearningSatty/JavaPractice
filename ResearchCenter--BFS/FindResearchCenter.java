package com.satty.practice;

import java.util.Scanner;
/*
1
5 3
2 4
4 1
5 3
0 1 0 1 0
0 1 0 1 0
1 1 1 1 0
1 1 1 0 0
1 1 1 1 0
o/p
Case #1
3
*/
public class FindResearchCenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T_cases = sc.nextInt();
		for (int i = 0; i < T_cases; i++) {
			int region_size = sc.nextInt();
			int no_element = sc.nextInt();
			int region[][] = new int[region_size][region_size];
			int[][] elem_cen = new int[no_element][2];
			for (int j = 0; j < elem_cen.length; j++) {
				elem_cen[j][0] = sc.nextInt()-1;
				elem_cen[j][1] = sc.nextInt()-1;
			}
			for (int j = 0; j < region.length; j++) {
				for (int k = 0; k < region.length; k++) {
					region[j][k] = sc.nextInt();
				}
			}
			long_moving_dis = Integer.MAX_VALUE;
			for (int j = 0; j < region.length; j++) {
				for (int k = 0; k < region.length; k++) {
					if(region[j][k]!=0){
						if(!isThisElement(j,k,elem_cen)){
							int moving_distance[] = new int[elem_cen.length];
							for (int e = 0; e < elem_cen.length; e++) {
								dis_ = Integer.MAX_VALUE;
								int region_vis[][] = new int[region.length][region.length];
								findDistance2(region, j, k, elem_cen[e][0], elem_cen[e][1], region_vis, 0);
								moving_distance[e] = dis_;
							}
							int long_d = Integer.MIN_VALUE;
							for (int l = 0; l < moving_distance.length; l++) {
								if(moving_distance[l]>long_d)
									long_d = moving_distance[l];
							}
							if(long_d<long_moving_dis)
								long_moving_dis = long_d;
						}
					}
				}
			}
			
			System.out.println("Case #"+(i+1) );
			System.out.println(long_moving_dis);
			
		}
		sc.close();
	}
	
	
	
	private static void findDistance2(int[][] region, int j, int k, int l,
			int m, int[][] region_vis, int dis) {
		// TODO Auto-generated method stub
		MyJobQueue queue = new MyJobQueue(region.length * region.length);
        Data_ node = new Data_(j, k, 0);
//        tmpMatrix[j][k] = 1;
        queue.insert(node);
        region_vis[j][k] = 1;
        while(!queue.isEmpty()){
        	Data_ d =queue.remove();
        	dis =  d.disd;
        	j = d.x;
        	k = d.y;
        	if(d.x == l && d.y == m){
        		if(dis<dis_)
        			dis_ = dis;
        		break;
        	}
        	int[] x= {0, 1, 0, -1};
    		int[] y ={1, 0,-1, 0};
    		for (int t = 0; t < y.length; t++) {
    			if(j+x[t]>=0 && j+x[t]<region.length && k+y[t]>=0 && k+y[t]<region.length && region[j+x[t]][k+y[t]]==1 && region_vis[j+x[t]][k+y[t]]!=1){
    				region_vis[j+x[t]][k+y[t]]=1;
    				queue.insert(new Data_(j+x[t], k+y[t], dis+1));
    			}
    		}
        }

	}
	
	private static boolean isThisElement(int j, int k, int[][] elem_cen) {
		// TODO Auto-generated method stub
		for (int i = 0; i < elem_cen.length; i++) {
			if(j==elem_cen[i][0] && k==elem_cen[i][1]){
				return true;
			}
		}
		return false;
	}
	private static int long_moving_dis ;
	private static int dis_ ;

}


class MyJobQueue
{
    private final int maxSize;

    private Data_[] queArray;

    private int front;

    private int rear;

    public MyJobQueue(int s)
    {
        maxSize = s;
        queArray = new Data_[maxSize];
        front = 0;
        rear = -1;
    }

    public void insert(Data_ j)
    {
        if(rear == maxSize - 1)
            rear = -1;
        queArray[++rear] = j;
    }

    public Data_ remove()
    {
        Data_ temp = queArray[front++];
        if(front == maxSize)
            front = 0;
        return temp;
    }

    public Data_ peekFront()
    {
        return queArray[front];
    }

    public boolean isEmpty() // true if queue is empty
    {
        return(rear + 1 == front || (front + maxSize - 1 == rear));
    }

}


class Data_{
	int x; int y; int disd;
	public Data_(int x, int y, int disd) {
		this.x = x;
		this.y = y;
		this.disd = disd;
	}
}
