
class Bubblesort{
	public static void main(String[] args) {
		int num[]= {5,9,6,75,11};
		int temp=0;
		for(int i=0;i<=num.length-1;i++) {
			for(int j=0;j<num.length-1;j++) {
				if(num[j]>num[j+1]) {
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		for(int i=0;i<=num.length-1;i++){
			System.out.println(num[i]);
		}
		
	}	
}