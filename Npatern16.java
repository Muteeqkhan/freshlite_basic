class Npatern16{
	public static void main(String[] args) {
		int row=9;
		int space=4;
		int star=1;
		for(int i=1;i<=row;i++){
			int p=1;
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++){
				System.out.print(p++ +" ");

			}
			if(i<=row/2){
				space--;
				star++;
			}
			else{
				space++;
				star--;
			}
			System.out.println(); 
		}
	}
	
}