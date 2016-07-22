package com.sat;

import java.util.Scanner;

public class ChessRook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int TestCase = sc.nextInt();
		for (int Q = 1; Q <= TestCase; Q++) {
			int size = sc.nextInt();
			int chess[][] = new int[size][size];
			sc.nextLine();
			for (int i = 0; i < chess.length; i++) {
				String s = sc.nextLine();
				for (int j = 0; j < s.length(); j++) {
					char ch = s.charAt(j);
					if(ch=='X')
						chess[i][j] = 9999;
					else if(ch=='.')
						chess[i][j] = 0;
			
				}
			}
			int chess_tmp[][] = new int[size][size];
			for (int i = 0; i < chess_tmp.length; i++) {
				for (int j = 0; j < chess_tmp.length; j++) {
					chess_tmp[i][j] = chess[i][j];
				}
			}
			rooks_final = Integer.MIN_VALUE;
			if(isSafe(chess_tmp, 0, 0))
			{
				chess_tmp[0][0] = 1;
				callBackTrack(chess, chess_tmp, 0, 0, 1);
			}
			chess_tmp[0][0] = chess[0][0]; //didn't place rook at [0, 0]
			callBackTrack(chess, chess_tmp, 0, 0, 0);
			
			System.out.println("Case #"+(Q));
			System.out.println(rooks_final);
			
		}
		sc.close();
	}
	
	private static boolean isSafe(int[][] chess, int row, int col) {
		// TODO Auto-generated method stub
		int i;
		if(chess[row][col]==9999)
    		return false;
        /* Check this row on left side */
        for (i = col-1; i >=0 && chess[row][i]!=9999; i--)
        {
        	if (chess[row][i] == 1)
        		 return false;
        }
        for (i = row-1; i >=0 && chess[i][col]!=9999; i--)
        {
        	if (chess[i][col] == 1)
        		 return false;
        }
             
        return true;

	}

	private static int rooks_final = 0;
	
	private static void callBackTrack(int[][] chess, int[][] chess_tmp, int row, int col, int rooks) {
		// TODO Auto-generated method stub
       		if(row==chess.length-1 && col==chess.length-1 ){
  			if(rooks>rooks_final)
				rooks_final = rooks;
			return;
		}
		int new_row = row+1;
		int new_col = col;
		if(new_row == chess.length)
		{
			new_row = 0;
			new_col = col+1;
		}
		if(isSafe(chess_tmp, new_row, new_col))
		{
			chess_tmp[new_row][new_col] = 1;
			callBackTrack(chess, chess_tmp, new_row, new_col, rooks+1); //placed rook at [new_row, new_col]
		}
		chess_tmp[new_row][new_col] = chess[new_row][new_col]; 			//didn't place rook at [new_row, new_col]
		callBackTrack(chess, chess_tmp, new_row, new_col, rooks);
	}
	

}
Enter file contents herepackage com.sat;

import java.util.Scanner;

public class ChessRook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int TestCase = sc.nextInt();
		for (int Q = 1; Q <= TestCase; Q++) {
			int size = sc.nextInt();
			int chess[][] = new int[size][size];
			sc.nextLine();
			for (int i = 0; i < chess.length; i++) {
				String s = sc.nextLine();
				for (int j = 0; j < s.length(); j++) {
					char ch = s.charAt(j);
					if(ch=='X')
						chess[i][j] = 9999;
					else if(ch=='.')
						chess[i][j] = 0;
			
				}
			}
			int chess_tmp[][] = new int[size][size];
			for (int i = 0; i < chess_tmp.length; i++) {
				for (int j = 0; j < chess_tmp.length; j++) {
					chess_tmp[i][j] = chess[i][j];
				}
			}
			rooks_final = Integer.MIN_VALUE;
			if(isSafe(chess_tmp, 0, 0))
			{
				chess_tmp[0][0] = 1;
				callBackTrack(chess, chess_tmp, 0, 0, 1);
			}
			chess_tmp[0][0] = chess[0][0]; //didn't place rook at [0, 0]
			callBackTrack(chess, chess_tmp, 0, 0, 0);
			
			System.out.println("Case #"+(Q));
			System.out.println(rooks_final);
			
		}
		sc.close();
	}
	
	private static boolean isSafe(int[][] chess, int row, int col) {
		// TODO Auto-generated method stub
		int i;
		if(chess[row][col]==9999)
    		return false;
        /* Check this row on left side */
        for (i = col-1; i >=0 && chess[row][i]!=9999; i--)
        {
        	if (chess[row][i] == 1)
        		 return false;
        }
        for (i = row-1; i >=0 && chess[i][col]!=9999; i--)
        {
        	if (chess[i][col] == 1)
        		 return false;
        }
             
        return true;

	}

	private static int rooks_final = 0;
	
	private static void callBackTrack(int[][] chess, int[][] chess_tmp, int row, int col, int rooks) {
		// TODO Auto-generated method stub
       		if(row==chess.length-1 && col==chess.length-1 ){
  			if(rooks>rooks_final)
				rooks_final = rooks;
			return;
		}
		int new_row = row+1;
		int new_col = col;
		if(new_row == chess.length)
		{
			new_row = 0;
			new_col = col+1;
		}
		if(isSafe(chess_tmp, new_row, new_col))
		{
			chess_tmp[new_row][new_col] = 1;
			callBackTrack(chess, chess_tmp, new_row, new_col, rooks+1); //placed rook at [new_row, new_col]
		}
		chess_tmp[new_row][new_col] = chess[new_row][new_col]; 			//didn't place rook at [new_row, new_col]
		callBackTrack(chess, chess_tmp, new_row, new_col, rooks);
	}
	

}
