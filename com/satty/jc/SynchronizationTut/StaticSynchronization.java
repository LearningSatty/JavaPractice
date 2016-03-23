package com.satty.jc.SynchronizationTut;

public class StaticSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 t1=new MyThread1();  
		MyThread2 t2=new MyThread2();  
		MyThread3 t3=new MyThread3();  
		MyThread4 t4=new MyThread4();  
		t1.start();  
		t2.start();  
		t3.start();  
		t4.start();  
	}
	
}

class Table{  
	
	static void sayHi(int n){
		System.out.println("hi, thread with n="+n +" !");
	}
	  
	 synchronized static void printTable(int n){  
		 System.out.println("executing Thread with n="+n+" .... ");
	   for(int i=1;i<=10;i++){  
	     System.out.println(n*i);  
	     try{  
	       Thread.sleep(400);  
	     }catch(Exception e){}  
	   }  
	 }  
	}  

class MyThread1 extends Thread{  
public void run(){  
	 System.out.println("Thread1 started.... ");
Table.printTable(1); 
Table.sayHi(1);
}  
}  
  
class MyThread2 extends Thread{  
public void run(){  
	System.out.println("Thread2 started.... ");
Table.printTable(10);  
Table.sayHi(10);
}  
}  
  
class MyThread3 extends Thread{  
public void run(){  
	System.out.println("Thread3 started.... ");
Table.printTable(100);  
Table.sayHi(100);
}  
}  
  
  
class MyThread4 extends Thread{  
public void run(){  
	System.out.println("Thread4 started.... ");
Table.printTable(1000);
Table.sayHi(1000); 
}  
} 
