package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		// Your code follows here.
		int cos=scan.nextInt();
        int number; double price;
        String cap;
        String last;
        String name;
        for(int i=0; i<cos;i++)
        {
        	double total=0.0;
        	cap=scan.next().substring(0,1);
        	last=scan.next();
        	name=cap+". "+last;
        	int numitem = scan.nextInt();
        	for(int j=0; j<numitem;j++) 
        	{
        		number=scan.nextInt();
        		String item = scan.next();
        		price=scan.nextDouble();
        		total+=price*number;
        	}
        	System.out.println(name+": "+ String.format("%.2f", total));
        }
	}
}
