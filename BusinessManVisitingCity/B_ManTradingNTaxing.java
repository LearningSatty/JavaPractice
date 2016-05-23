

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class B_ManTradingNTaxing {

	static int quan[],  taxes[];
	static int N_cities;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T_case = sc.nextInt();
		for (int t = 0; t < T_case; t++) {
			N_cities=sc.nextInt();
			quan= new int[N_cities];
			taxes = new int[N_cities];
			for (int i = 0; i < N_cities; i++) {
				quan[i]  = sc.nextInt();
				taxes[i] = sc.nextInt();
			}
			
			System.out.println(FindMin_Cost( 0, 0, 1, 0));
		}
			
	}
	
	
	private static long FindMin_Cost(int money, int fruit,
			int currentCity, int bagopen) {
		long p1= Integer.MAX_VALUE; long p2= Integer.MAX_VALUE; long p3= Integer.MAX_VALUE; 
		//(1) 
		p1= currentCity==N_cities ? money + taxes[currentCity-1]: FindMin_Cost(money+ taxes[currentCity-1], fruit, currentCity+1 ,bagopen); 
		//(2)
		p2 = currentCity==N_cities ? money + taxes[currentCity-1]*2:FindMin_Cost(taxes[currentCity-1]*2, fruit+ quan[currentCity-1], currentCity+1,bagopen);
		//3)
		if(fruit>=quan[currentCity-1]) { 
			fruit = fruit-quan[currentCity-1]; 
			bagopen= bagopen+1; 
			if(bagopen==3) 
			{
				fruit=0; bagopen=0;
			} 
			p3= currentCity==N_cities ? money : FindMin_Cost(money, fruit, currentCity+1, bagopen); 
			} 
		return java.lang.Math.min(java.lang.Math.min(p1, p2),p3); 
	}

	

}

