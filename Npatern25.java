class Npatern25{
	public static void main(String[] args) {
		int row=13;
		int space=0;
		int star=7;
		int p=1;
		for(int i=1;i<=row;i++){
			int temp=p;
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++){
				System.out.print(temp+" ");
				temp++;
			}if(i<=row/2){
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