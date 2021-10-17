class LeapYear{
	public static void main(String[] args) {
		int year=1992;
		if((year%4==0 && year%100!=0)||(year%400==0)){
			System.out.println("given year is leap year");
		}
		else{
			System.out.println("not a leap year");
		}
	}
	
}