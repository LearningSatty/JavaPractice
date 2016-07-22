package com.satty.practice;

import java.util.Scanner;

/*
 *Input 
2
130 30
4 50 7
5 0 5
5 10 4
5 20 3
5 30 2
91 30
4 50 7
5 0 5
5 10 4
5 20 3
5 30 2
Output: 153.20
159.50
*/

public class MarathonWithMinTime {

	static int Answer = Integer.MAX_VALUE;
	private static int totalEnergy;
	private static int totalDistanceToTravel;
	private static int noOfPaces;

	private static int[] timeIndex;
	private static int[] energyIndex;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 0; test_case < T; test_case++) {

			noOfPaces = 5;
			totalEnergy = sc.nextInt();
			totalDistanceToTravel = sc.nextInt();

			timeIndex = new int[noOfPaces];
			energyIndex = new int[noOfPaces];

			for (int i = 0; i < noOfPaces; i++) {
				int min = sc.nextInt();
				int sec = sc.nextInt();
				int energy = sc.nextInt();

				timeIndex[i] = (min * 60) + sec;
				energyIndex[i] = energy;
			}

			startTraversing();

			int MIN = Answer / 60;
			int SEC = Answer - MIN * 60;

			System.out.println("Case #" + (test_case + 1));
			System.out.println(MIN + " " + SEC);

			Answer = Integer.MAX_VALUE;
		}
	}

	private static void startTraversing() {
		for (int firstPace = 0; firstPace < totalDistanceToTravel; firstPace++) {
			for (int secondPace = 0; secondPace < totalDistanceToTravel; secondPace++) {
				for (int thirdPace = 0; thirdPace < totalDistanceToTravel; thirdPace++) {
					for (int fourthPace = 0; fourthPace < totalDistanceToTravel; fourthPace++) {
						for (int fifthPace = 0; fifthPace < totalDistanceToTravel; fifthPace++) {
							int distance = firstPace + secondPace + thirdPace + fourthPace + fifthPace;

							if (distance > totalDistanceToTravel) {
								break;
							}

							if (distance == totalDistanceToTravel) {
								int energy = firstPace * energyIndex[0] + secondPace * energyIndex[1] + thirdPace * energyIndex[2] + fourthPace * energyIndex[3] + fifthPace * energyIndex[4];
								if (energy <= totalEnergy) {
									int timeCost = firstPace * timeIndex[0] + secondPace * timeIndex[1] + thirdPace * timeIndex[2] + fourthPace * timeIndex[3] + fifthPace * timeIndex[4];
									if (timeCost < Answer) {
										Answer = timeCost;
									}
								}
							}

						}
					}
				}
			}
		}
	}

}
