public class Task29 {

	public static void main(String[] args) {
		String a = args[0];
		String b = args[1];
		if( args.length != 2 || a.equals(b)){

			System.out.println("Enter two different arguments");
			System.exit(1);
		}
		char [] arr1 = a.toCharArray();
		char [] arr2 = b.toCharArray();

		int indexOfString = 0;

		for ( int i = 0; i < a.length(); i++ ){
			if( arr2[0] == arr1[i]){
				for (int j =1; j < b.length(); j++){
					if (arr2[j] == arr1[i+1]){
						indexOfString = i;
						
					}
				}
			}
		}
		System.out.println(indexOfString);
	}
}

	 