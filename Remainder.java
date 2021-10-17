import java.util.*;
class Remainder{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the divisor");
		int devisor=sc.nextInt();
		System.out.println("enter the divider");
		int divider=sc.nextInt();
		int remainder;
		remainder=devisor-(devisor/divider)*divider;
		System.out.println("remainder of the number is: "+remainder);
		
	}
	
}