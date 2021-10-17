class Cpatern3{
	public static void main(String[] args) {
		int row=11;
		int space=5;
		int star=1;
		for(int i=1;i<=row;i++){
			char p='A';
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++){
				System.out.print((char)p+" ");
				p++;
			}
			System.out.println();
			if(i<=row/2){
				star++;
				space--;
			}
			else{
				star--;
				space++;
			}
		}
	}
	
}