package myProject20;
import java.util.Scanner;

public class Combination {
	public static void main(String[]args) {
		int n,r,combination,f1=1,f2=1,f3=1;
		Scanner input=new Scanner(System.in);	
		System.out.println("This program calculate combination of two number entered.Caution! The design is c(first number,second number)");
		System.out.print("Please enter first number:");
		n=input.nextInt();
		System.out.print("Please enter second number:");
		r=input.nextInt();
		for(int counter=1;counter<=n;counter++) {
			f1*=counter;
			
			
		}
		for(int i=1;i<=r;i++) {
			f2*=i;
		}
		for(int k=1;k<=n-r;k++) {
			f3*=k;
		}
		combination=f1/(f2*f3);
		System.out.println("Combination:"+combination);
		
		
		
	}

}
