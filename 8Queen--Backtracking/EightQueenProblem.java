package com.satty.practice;

import java.util.Scanner;

public class EightQueenProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t_cases = sc.nextInt();
		for (int t = 0; t < t_cases; t++) {
			int no_chess_board = sc.nextInt();
			
			for (int i = 0; i < no_chess_board; i++) {
				int arr[][] = new int[8][8];
				for (int j = 0; j < arr.length; j++) {
					for (int k = 0; k < arr[0].length; k++) {
						arr[j][k] = sc.nextInt();
					}
				}
				if(i==0)
					System.out.println("Case #"+(t+1));
				int arr_vis[][] = new int[8][8];
				rooks_score = Integer.MIN_VALUE;
				
					callBackTrack(arr, arr_vis, 0, 0);
				System.out.println(rooks_score);
			}
		}
		sc.close();
	}

	static int rooks_score;
	static String rooks_score_path;
public static void  callBackTrack(int board[][], int board_vis[][], int col, int score)
    {
        /* base case: If all queens are placed
           then return true */
		int N = board.length;
        if (col >= N)
        {
        	if(score > rooks_score)
        	{
        		rooks_score = score;
        	}
        }
 
        /* Consider this column and try placing
           this queen in all rows one by one */
        for (int i = 0; i < N; i++)
        {
            /* Check if queen can be placed on
               board[i][col] */
            if (isSafe(board_vis, i, col))
            {
                /* Place this queen in board[i][col] */
            	int temp = board[i][col];
                board_vis[i][col] = 1;
 
                /* recur to place rest of the queens */
                callBackTrack(board, board_vis, col + 1, score+temp);
 
                /* If placing queen in board[i][col]
                   doesn't lead to a solution then
                   remove queen from board[i][col] */
                board_vis[i][col] = 0; // BACKTRACK
            }
        }
 
    }
		
	public static boolean isSafe(int board[][], int row, int col)
    {
        int i, j;
 
        /* Check this row on left side */
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;
 
        /* Check upper diagonal on left side */
        for (i=row, j=col; i>=0 && j>=0; i--, j--)
            if (board[i][j] == 1)
                return false;
 
        /* Check lower diagonal on left side */
        for (i=row, j=col; j>=0 && i<board.length; i++, j--)
            if (board[i][j] == 1)
                return false;
 
        return true;
    }
	
}
