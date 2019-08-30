package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int time=scan.nextInt();
		String[] arr1=new String[time];
		int[] arr2=new int[time];
		int[] arr3=new int[time];
	      for (int i=0;i<time;i++)
		{
			arr1[i]=scan.next();
			scan.nextDouble();
		}
	      //
        int person=scan.nextInt();
		int item;int number;String name;
		for(int i=0;i<person;i++) {
	    	scan.next();scan.next();
	    	item=scan.nextInt();
	    			for(int j=0;j<item;j++) {
	    		   number=scan.nextInt(); 
	    		   name=scan.next();
	    		   arr2=arr2.clone();
	    		   for(int k=0;k<time;k++) {
	    		           if(arr1[k].equals(name))  
	    		           {         
	    		    	  arr2[k]+=number;
	       		           }
	    		   }
	    		   for(int r=0;r<item;i++) {
	    			   if(arr2[r]!=arr2.clone()[r]) {
	    				   arr3[r]++;}
	    		   }
	    			   }
	    		   }
		for(int i=0;i<time;i++) {
		if(arr3[i]==0) {
			System.out.println("No customers bought "+arr1[i]);
		}
		else
			System.out.println(arr3[i]+" customers bought "+arr2[i]+" "+arr1[i]);
		}
	}
}

