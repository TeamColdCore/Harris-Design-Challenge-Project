public class PrimeFactorization {
	
	public static void main(String[] args) {
		int input = 169;
		int num_2 = 0;
		int num_3 = 0;
		int num_5 = 0;
		int num_7 = 0;
		int num_11 = 0;
		int num_13 = 0;
		while((input%2)==0){
			input = input / 2;
			num_2++;
		}	
		while((input%3)==0){
			input = input / 3;
			num_3++;
		}
		while((input%5)==0){
			input = input / 5;
			num_5++;
		}
		while((input%7)==0){
			input = input / 7;
			num_7++;
		}
		while((input%11)==0){
			input = input / 11;
			num_11++;
		}
		while((input%13)==0){
			input = input / 13;
			num_13++;
		}
		System.out.printf("The final number is %d. There are,\n %d twos,\n %d threes,\n %d fives,\n% d sevens,\n %d elevens,\n %d thirteens",input,num_2,num_3,num_5,num_7,num_11,num_13);
	}
}
