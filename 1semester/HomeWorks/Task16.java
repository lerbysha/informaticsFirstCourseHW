class Task16 {

	 public static void main(String[] args){

	 	 int[] arr = new int[255];
		 


		 int a = Integer.parseInt(args[0]);
		 /*while (a > 0){
		 	bin += (a % 2) * digit;
		 	a /= 2;
		 	digit *= 10;
		 }*/
		System.out.println(convertToBinary(a));
		}

	public static int convertToBinary (int a){
		int bin = 0;
		int summOfNumberOne = 0;
			for (int i =1; a>0; i*=10,a/=2){
				bin += (a % 2) * i;
				if (a%2==1){
					summOfNumberOne ++;
				}
			}
			return bin;
			}		

		 /*for (int i = a/2; i >= 1; a/=2, i/=2, bin++){
		 	if (a % i == 0){
		 		arr[bin] = 0;}
		 	else{
		 		arr[bin] = 1;}
		 	if (i == 1){
		 		arr[bin+1] = 1;
		 	}
		 }
		 for (int i = bin; i > -1; i--){
		 System.out.print(arr[i]);}
	 */

}