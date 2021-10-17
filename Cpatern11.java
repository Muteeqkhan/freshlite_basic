class Cpatern11{
	public static void main(String[] args) {
		int row=5;
		int star=1;
		int  p=65;
		for(int i=1;i<=row;i++){
			char temp=(char)p;
			for(int j=1;j<=star;j++){
				if(i%2==0){
					System.out.print((char)temp);
					temp--;
				}
				else{
					System.out.print((char)temp);
					temp++;
				}

				
			}
			System.out.println();
			star++;
			p=65;
			p=p+i+1;
		}
	}
	
}