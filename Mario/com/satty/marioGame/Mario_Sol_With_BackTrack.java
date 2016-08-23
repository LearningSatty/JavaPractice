package com.satty.practice.clone;

import java.util.Scanner;

public class Mario_Sol_With_BackTrack {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int posts = sc.nextInt();
			int e_coins = 0;
			// int e_bombs =0;
			int[] p_flower = new int[posts];
			int[] n_petals = new int[posts];
			int[] coins = new int[posts];
			int[] bombs = new int[posts];

			int[] bombs_power = new int[3];

			for (int j = 0; j < posts; j++) {
				p_flower[j] = sc.nextInt();
				n_petals[j] = sc.nextInt();
				coins[j] = sc.nextInt();
				bombs[j] = sc.nextInt();
			}

			for (int j = 0; j < posts; j++) {
				
				if (p_flower[j] == 0) {
					e_coins = e_coins + coins[j];
					bombs_power[2] = bombs[j];
					if (j - 1 > 0)
						bombs_power[1] = bombs[j - 1];
					if (j - 2 > 0)
						bombs_power[0] = bombs[j - 2];
				} else {
					if(e_coins<n_petals[j] && getpetal_fight_Bombs(bombs_power)<n_petals[j])
					{
						e_coins = -1;
						break;
					}
					if (j == posts - 1) {
						e_coins = e_coins + coins[j];
						break;
					}
					if (bombs[j] > 0 && getpetal_fight_Bombs(bombs_power)!=0) {
						e_coins = e_coins + coins[j];
						bombs_power[2] = bombs[j];
						bombs_power[1] = 0;
						bombs_power[0] = 0;
						//and snatch all previous bombs
						for (int j2 = j; j2 >=0; j2--) {
							bombs[j2] = 0;
						}
					}
					
					else if (getpetal_fight_Bombs(bombs_power) >= n_petals[j]) {
							if(coins[j]==0){
								
								
							}
							
					}
					else if(getpetal_fight_Bombs(bombs_power) < n_petals[j]){
						e_coins = e_coins - n_petals[j];
						e_coins = e_coins + coins[j];
						bombs_power[2] = bombs[j];
						if (j - 1 > 0)
							bombs_power[1] = bombs[j - 1];
						if (j - 2 > 0)
							bombs_power[0] = bombs[j - 2];
					}
					else if(bombs[j] == 0 && getpetal_fight_Bombs(bombs_power)!=0){
						e_coins = e_coins + coins[j];
						bombs_power[2] = bombs[j];
						bombs_power[1] = 0;
						bombs_power[0] = 0;
						//and snatch all previous bombs
						for (int j2 = j; j2 >=0; j2--) {
							bombs[j2] = 0;
						}
					}

				}

			}
			System.out.println("Case #" + (i+ 1));
			System.out.println(e_coins);
		}
		sc.close();
	}

	public static int getpetal_fight_Bombs(int[] bombs) {
		int petals = 0;
		petals = bombs[0] + bombs[1] * 2 + bombs[2] * 5;
		return petals;
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
