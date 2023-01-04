import java.util.ArrayList; 
import java.util.Scanner;


class PrimeDirective {

    public boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public ArrayList<Integer> onlyPrimes(int[] array) {

        final ArrayList<Integer> list = new ArrayList<Integer>();
        
	for (final int j : array) {
            
	    if (this.isPrime(j)) {
                
		list.add(j);
            }
        }
        
	return list;
    }
    
    public static void main(String[] args) {
	
	System.out.println();	
	System.out.println("This program will ask you to enter 10 numbers and will return any prime numbers that you entered.");
	System.out.println();
	
	Scanner input = new Scanner(System.in);

	int[] numbers = new int[10];

	for (int i = 0; i <= 9; i++) {
	    System.out.print("Enter a number: ");
	
	    numbers[i] = input.nextInt();
	    System.out.println();
	};
	
	System.out.print("The prime numbers you entered are: ");

        System.out.println(new PrimeDirective().onlyPrimes(numbers));
    }
}
