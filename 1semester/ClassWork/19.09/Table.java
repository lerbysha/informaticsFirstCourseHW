class Table {
	public static void main(String[] args) {
		int bla =  Integer.parseInt(args[0]);
		if (args.length!=1 ){	
			System.out.println("Enter one number");
			System.exit(1);
		}
		else{
			for(int i = 1; i <= bla; i++ ){
					for ( int j =1; j <= bla; j++){
						System.out.printf("%6d", i*j );
					}
				System.out.println();
			}	
		}	
	}
}