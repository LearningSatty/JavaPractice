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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T_Case = sc.nextInt();
		for (int i = 0; i < T_Case; i++) {
			int H = sc.nextInt();
			int D = sc.nextInt();
			int[] min = new int[5];
			int[] sec = new int[5];
			int[] energy = new int[5];
			for (int j = 0; j < 5; j++) {
				min[j] = sc.nextInt();
				sec[j] = sc.nextInt();
				energy[j] = sc.nextInt();
			}
			
			for (int j = 0; j < energy.length; j++) {
				sec[j] = sec[j] + min[j]*60;
			}
			
			for (int j = 0; j < energy.length; j++) {
				System.out.println((j+1)+"th pace time: "+sec[j]);
			}
			int max_km[] = new int[5];
			for (int j = 0; j < energy.length; j++) {
				max_km[j] = H/energy[j];
			}
			
			int final_time = Integer.MAX_VALUE;
			
			for (int j = 0; j < max_km[0]; j++) {
				int d1 = j;
				int energ1 = j*energy[0];
				int secs1 = j*sec[0];
				if(energ1>H)
					break;
				if(D==d1)
				{
					int seccc = secs1;
					if(seccc<final_time)
						{
						final_time = seccc;
						System.out.println("d1= "+d1);
						System.out.println(seccc);
						System.out.println(energ1);
					}
				}
				for (int k = 0; k < max_km[1]; k++) {
					int d2 = k;
					int energ2 = k*energy[1];
					int secs2 = k*sec[1];
					if(energ1+energ2>H)
						break;
					if(D==d1+d2)
					{
						int seccc = secs1+secs2;
						if(seccc<final_time)
						{
						final_time = seccc;
						System.out.println("d1="+d1+" d2="+d2);
						System.out.println(seccc);
						System.out.println(energ1+energ2);
					}
					}
					for (int l = 0; l < max_km[2]; l++) {
						int d3 = l;
						int energ3 =  l*energy[2];
						int secs3 = l*sec[2];
						if(energ1+energ2+energ3>H)
							break;
						if(D==d1+d2+d3)
						{
							int seccc = secs1+secs2+secs3;
							if(seccc<final_time)
							{
							final_time = seccc;
							System.out.println("d1="+d1+" d2="+d2+" d3="+d3);
							System.out.println(seccc);
							System.out.println(energ1+energ2+energ3);
						}
						}
						for (int m = 0; m < max_km[3]; m++) {
							int d4 = m;
							int energ4 =  m*energy[3];
							int secs4 = m*sec[3];
							if(energ1+energ2+energ3+energ4>H)
								break;
							if(D==d1+d2+d3+d4)
							{
								int seccc = secs1+secs2+secs3+secs4;
								if(seccc<final_time)
								{
								final_time = seccc;
								System.out.println("d1="+d1+" d2="+d2+" d3="+d3+" d4="+d4);
								System.out.println(seccc);
								System.out.println(energ1+energ2+energ3+energ4);
							}
							}
							for (int n = 0; n < max_km[4]; n++) {
								int d5 = n;
								int energ5 =  n*energy[4];
								int secs5 = n*sec[4];
								if(energ1+energ2+energ3+energ4+energ5>H)
									break;
								if(D==d1+d2+d3+d4+d5)
								{
									int seccc = secs1+secs2+secs3+secs4+secs5;
									if(seccc<final_time)
									{
									final_time = seccc;
									System.out.println("d1="+d1+" d2="+d2+" d3="+d3+" d4="+d4+" d5="+d5);
									System.out.println(seccc);
									System.out.println(energ1+energ2+energ3+energ4+energ5);
								}
								}
							}
						}
					}
				}
			}
			
			System.out.println("#"+(i+1)+" "+final_time/60+" "+final_time%60);
			
		}
	}

}
