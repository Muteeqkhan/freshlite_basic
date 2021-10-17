class Npatern18{
	public static void main(String[] args) {
		int row=5;
		int star=1;
		int space=4;
		for(int i=1;i<=row;i++){
			int p=1;
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++){
				System.out.print(p);
				if(k>=i){
					p--;
				}
				else{
					p++;
				}

			}
			System.out.println();
			star+=2;
			space--;
		}
	}
}