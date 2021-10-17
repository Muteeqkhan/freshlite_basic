class Cpatern2{
	public static void main(String[] args) {
		int row=12;
		int  space=0;
		int star=6;
		char p= 'A';
		for(int i=1;i<=row;i++){
			char temp=p;
			
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++){
				System.out.print((char)temp+" ");
				temp++;
			}
			if(i==6){
				space=space;
				star=star;
				p=p;
			}
		
			else if(i<row/2){
				star--;
				space++;
				p++;
			}
			else{
				star++;
				space--;
				p--;
			}

			System.out.println();
		}
	}
	
}