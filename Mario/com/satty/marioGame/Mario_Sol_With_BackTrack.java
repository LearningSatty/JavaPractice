package com.satty.practice.clone;

import java.util.Scanner;

public class Mario_Sol_With_BackTrack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t_cases = sc.nextInt();
		for (int t = 0; t < t_cases; t++) {
			int gates = sc.nextInt();
			Gate[] gates_desc = new Gate[gates];
			for (int i = 0; i < gates; i++) {
				gates_desc[i] = new Gate((sc.nextInt()==0?false:true), sc.nextInt(), sc.nextInt(), sc.nextInt());
			}
			final_coins = Integer.MIN_VALUE;
			callBackTrack(gates_desc, 0, 0, 0, 0, 0);
			System.out.println("Case #"+(t+1));
			System.out.println(final_coins==Integer.MIN_VALUE?-1:final_coins);
		}
		sc.close();
	}

	private static int final_coins;
	private static void callBackTrack(Gate[] gates_desc, int bomb1, int bomb2, int bomb3, int coins, int gate_no){
		if(gate_no==gates_desc.length){
			if(coins>final_coins)
				final_coins = coins;
			return;
		}
		//if dragon is not at gate
		if(!gates_desc[gate_no].pak_avail){
			callBackTrack(gates_desc, bomb2, bomb3, gates_desc[gate_no].bombs, coins+gates_desc[gate_no].coins, gate_no+1);
		}
		else{   //if dragon is at gate
			//deals with all bomb/dragon snatch all your bombs and let you go
			if(bomb1+bomb2+bomb3==0){
				callBackTrack(gates_desc, bomb1, bomb2, gates_desc[gate_no].bombs, coins-gates_desc[gate_no].flow_petals+gates_desc[gate_no].coins, gate_no+1);
			}
			else{
				callBackTrack(gates_desc, 0, 0, gates_desc[gate_no].bombs, coins+gates_desc[gate_no].coins, gate_no+1);
			}
			//
			//deals with money
			if(coins>=gates_desc[gate_no].flow_petals)
				callBackTrack(gates_desc, bomb2, bomb3, gates_desc[gate_no].bombs, coins-gates_desc[gate_no].flow_petals+gates_desc[gate_no].coins, gate_no+1);
			//
			//attack on dragon
			int temp1_bomb = bomb1;
			int temp2_bomb = bomb2;
			int temp3_bomb = bomb3;
			int capacity = bomb1+bomb2*2+bomb3*5;
			int fl_petas = gates_desc[gate_no].flow_petals;
			if(capacity>=fl_petas){
				if(fl_petas==capacity)
					callBackTrack(gates_desc, 0, 0, 0, coins, gate_no+1);
				else{
					//finish older gates bombs first and then later ones.
					while(capacity>0){
						if(bomb1>0)
							capacity--;
						else if(bomb2>0){
							capacity = capacity -2;
						}
						else if(bomb3>0){
							capacity = capacity -3;
						}
					}
				}
				callBackTrack(gates_desc, bomb2, bomb1, 0, coins, gate_no+1);
				bomb1 = temp1_bomb;
				bomb2 = temp2_bomb;
				bomb3 = temp3_bomb;
			}
			//
		}
	}
}

class Gate{
	boolean pak_avail;
	int flow_petals;
	int bombs, coins;
	public Gate(boolean pak_avail, int flow_petals, int coins, int bombs) {
		super();
		this.pak_avail = pak_avail;
		this.flow_petals = flow_petals;
		this.bombs = bombs;
		this.coins = coins;
	}
	
}
