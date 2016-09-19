package com.satty.practice;

public class Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N_arr = 4;
		int arr[] = {1, 2, 3, 4};
		int t_comb = calculateTotalCombination(N_arr);
//		System.out.println(t_comb);
		String[] str_arr = new String[t_comb];
		
		for (int i = 0; i < t_comb; i++) {
			StringBuilder s = new StringBuilder();
			String tt = (Integer.toBinaryString(i));
			if(tt.length()==N_arr)
				s.append(tt);
			else
			{
				for (int j = 0; j < N_arr-tt.length(); j++) {
					s.append("0");
				}
				s.append(tt);
			}
			str_arr[i] = s.toString();	
			System.out.println(s.toString());
		}
		
		
		for (int j = 1; j < str_arr.length; j++) {
			for (int j2 = 0; j2 < N_arr; j2++) {
				if(str_arr[j].charAt(j2)!='0')
					System.out.print(arr[j2]);
			}
			System.out.println();
		}
		
	}

	private static int calculateTotalCombination(int i) {
		// TODO Auto-generated method stub
		if(i==1)
			return 2;
		else 
			return 2*calculateTotalCombination(i-1);
	}

}
/*
0000
0001
0010
0011
0100
0101
0110
0111
1000
1001
1010
1011
1100
1101
1110
1111
4
3
34
2
24
23
234
1
14
13
134
12
124
123
1234

*/
