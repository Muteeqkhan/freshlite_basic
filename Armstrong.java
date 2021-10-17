import java.lang.Math;
class Armstrong{
	public static void main(String[] args) {
	int num=1634;
		int temp=num;
		int count=0;
		int sum=0;
		int r;
		while(temp>0) {
			count++;
			temp/=10;
		}
		temp=num;
		while(temp>0) {
			r=temp%10;
			sum+=Math.pow(r,count);
			temp/=10;
		
		}
		if(sum==num) {
			System.out.println("ghn");
		}
		else
			System.out.println("gbnfjg");
	}
	
}