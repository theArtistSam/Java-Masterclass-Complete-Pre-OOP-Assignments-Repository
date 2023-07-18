



import java.util.Scanner;
public class Method01{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int i = 3;
        int count = 0;
        long n;
        while(count < i){
        	System.out.println("Enter integers");
	        n = input.nextLong();
		count++;
        }
        System.out.println(sumDigits(n));
	}

	public static int sumDigits(long n){
		int sum = 0;
		sum = sum + (int)n;
		return sum;
	}
}