package a1;

import java.util.Scanner;


public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Your code follows here.
        int time=scan.nextInt();
		String[] arr1=new String[time];
		double[] arr2=new double[time];
	      for (int i=0;i<time;i++)
		{
			arr1[i]=scan.next();
		    arr2[i]=scan.nextDouble();
		}
	      //
        int person=scan.nextInt();
		int item;int number;
		double max=0.0;
		double min=10000000.0;
		String Max=" ";
		String Min=" ";
		String temp;String name;
		double price = 0.0;double total=0.0;
       for(int i=0;i<person;i++) {
    	temp=scan.next()+" "+scan.next();
    	item=scan.nextInt();
    	double pur=0.0;
    			for(int j=0;j<item;j++) {
    		   number=scan.nextInt(); 
    		   name=scan.next();
    		   for(int k=0;k<time;k++) {
    		           if(arr1[k].equals(name))  
    		           {         
    		    	  price=arr2[k];
    		    	  pur+=price*number;
       		           }
    		   }
    	              }
    			if(pur>max) {
     		    	 Max=temp;
     		    	 max=pur;}
     		    	if(pur<min) {
     		    		min=pur;
     		    		Min=temp;}
     		    	total+=pur;
       }
       System.out.println("Biggest"+":"+" "+Max+" ("+String.format("%.2f",max)+")");
       System.out.println("Smallest: "+Min+" ("+String.format("%.2f",min)+")");
	   System.out.println("Average: "+String.format("%.2f",total/person));
	}
    		     
    
           
				
				

}
