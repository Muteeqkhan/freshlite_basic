class Cpatern10{
	public static void main(String[] args) {
		int row=4;
		int space=4;
		int star=1;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++){
				if(i==1){
					System.out.print("j");
				}
				else if (i%2==0) {
					System.out.print("A");
				}
				else {
					System.out.print("v");
				}
			}
			System.out.println();
			space--;
			star+=2;		}
	}
	
}