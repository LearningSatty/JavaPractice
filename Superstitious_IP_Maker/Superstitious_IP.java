package com.satty.practice;

import java.util.Scanner;

public class Superstitious_IP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t_cases = sc.nextInt();
		for (int t = 0; t < t_cases; t++) {
			int N = sc.nextInt();
			int arr[] = new int[N];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			total_ips = 0;
			perm1(arr, arr.length);
			System.out.println("Case #"+(t+1));
			System.out.println(total_ips);
		}
		sc.close();
	}
	private static void perm1(int[] arr, int n) {
		// TODO Auto-generated method stub
		if(n==1){
			String str ="";
			for (int i = 0; i < arr.length; i++) {
				str= str+ arr[i];
			}
			MakePalindrome1(str);
			MakePalindrome2(str);
		}
		for (int i = 0; i < n; i++) {
			swap(arr, i, n-1);
			perm1(arr, n-1);
			swap(arr, i, n-1);
		}
	}

	private static void MakePalindrome2(String str) {
		// TODO Auto-generated method stub
		String rev="";
		for (int i = str.length()-2; i >=0; i--) {
			rev = rev + str.charAt(i);
		}
		MakeIps(str+rev);
	}
	private static void MakePalindrome1(String str) {
		// TODO Auto-generated method stub
		String rev="";
		for (int i = str.length()-1; i >=0; i--) {
			rev = rev + str.charAt(i);
		}
		MakeIps(str+rev);
	}
	private static void MakeIps(String ip) {
		// TODO Auto-generated method stub
		for (int i = 1; i < ip.length(); i++) {
			for (int j = i+1; j < ip.length(); j++) {
				for (int k = j+1; k < ip.length(); k++) {
					String octet1=ip.substring(0, i);
					String octet2=ip.substring(i, j);
					String octet3=ip.substring(j, k);
					String octet4=ip.substring(k, ip.length());
					if((octet1.length()>1 && octet1.charAt(0)=='0')
						|| (octet2.length()>1 && octet2.charAt(0)=='0')
						|| (octet3.length()>1 && octet3.charAt(0)=='0') 
						|| (octet4.length()>1 && octet4.charAt(0)=='0'))
						continue;
					
					if(Integer.parseInt(octet1)<=255 && Integer.parseInt(octet2)<=255 && Integer.parseInt(octet3)<=255 && 
							Integer.parseInt(octet4)<=255){			
						//System.out.println(octet1+"."+octet2+"."+octet3+"."+octet4);
						total_ips++;
					}
				}
			}
		}
	}
	
	
	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static int total_ips;

}
