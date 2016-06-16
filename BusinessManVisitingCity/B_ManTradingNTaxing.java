package com.satty.practice;

import java.util.Scanner;

public class BusManTradingNTaxing {

	static int quan[], taxes[];
	static int N_cities;
	static long min;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T_case = sc.nextInt();
		for (int t = 0; t < T_case; t++) {
			N_cities = sc.nextInt();
			quan = new int[N_cities];
			taxes = new int[N_cities];
			for (int i = 0; i < N_cities; i++) {
				quan[i] = sc.nextInt();
				taxes[i] = sc.nextInt();
			}
			min = Integer.MAX_VALUE;
			findMin_Cost(0, 0, 0, 0, 0);
			System.out.println("Case #" + (t + 1));
			System.out.println(min);
		}

	}

	private static void findMin_Cost(long money, int fruit1, int fruit2,
			int fruit3, int currentCity) {
		if (currentCity + 1 > N_cities) {
			if (money < min)
				min = money;
			return;
		}
		if (money >= min) {
			return;
		}

		findMin_Cost(money + taxes[currentCity], fruit1, fruit2, fruit3, currentCity + 1);
		findMin_Cost(money + (2 * taxes[currentCity]), fruit1 + quan[currentCity], fruit2, fruit3, currentCity + 1);

		int fruit = fruit1 + fruit2 + fruit3;
		if (fruit >= quan[currentCity]) {
			if (fruit3 >= quan[currentCity]) {
				fruit3 = fruit3 - quan[currentCity];
			} else if ((fruit3 + fruit2) >= quan[currentCity]) {
				fruit2 = (fruit3 + fruit2) - quan[currentCity];
				fruit3 = 0;
			} else {
				fruit1 = fruit - quan[currentCity];
				fruit3 = 0;
				fruit2 = 0;
			}
			findMin_Cost(money, 0, fruit1, fruit2, currentCity + 1);
		}
	}
}
