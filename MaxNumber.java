class MaxNumber{
	public static void main(String[] args) {
		int num[]={5,6,7,55,48,78,587};
		int max=num[0];
		for(int i=1;i<num.length;i++) {
			if (num[i]>max){
				max=num[i];
			}

		}
		System.out.println(max);
	}
	
}