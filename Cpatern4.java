class Cpatern4{
	public static void main(String[] args) {
		int row=12;
		int space=0;
		int star=6;
		char p='A';
		for(int i=1;i<=row;i++){
			char temp=p;
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++){
				System.out.print((char)temp);
				temp++;
			}
			if(i==6){
				p=p;
				star=star;
				space=space;
			}
			else if(i<row/2){
				p++;
				star--;
				space++;
			}
			else{p--;
				star++;
				space--;
			}
			System.out.println();
		}
	}
	
}