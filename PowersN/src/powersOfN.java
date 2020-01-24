/* Java program for ITC115 - Assignment 3 - Powers of N
 * A method that accepts a base and an exponent as arguments and prints each power of 
 * the base from base 0 (1) up the provided maximum.
 * I have created two methods, one using Math.pow and one that does not (per the book's 
 * suggestion).
 */
public class powersOfN {

	public static void main(String[] args) {
		printPowersOfN (2, 7);
		printPowersOfN (5, 3);
		
		System.out.println("The same result using Math.pow:");
		mathPowVersion (2, 7);
		mathPowVersion (5, 3);
	} // End main method

	public static void printPowersOfN (int base, int exp) {
		
		// exponent of 0 result is always 1, so start by printing "1".
		int result = 1;
		System.out.print(result + " ");
		
		// for loop to print each result in a line, repeating a number
		// of times equal to the given exponent value. 
		for (int i = 1; i <= exp; i++) {
			
			/*  for each iteration, print the updated result when the result is
			 *  multiplied by the base. The result variable updates each loop,
			 *  giving the next power in the sequence. For the "result *= base"
			 *  formula to work, the iteration counter has to start with 1. If 
			 *  we start with 0 like we do with mathPowVersion, "result" becomes
			 *  0 and never changes.
			 */ 
			System.out.print((result *= base) + " "); // result = result * base
			
		} // end for loop
		
		// make a new line for the next calling of the method
		System.out.println();
		
	} // End printPowersOfN method
	
	
	//this method is for the simpler version using Math.pow
	public static void mathPowVersion (int base, int exp) {
		
		//using Math.pow, we can start our iteration count at 0 to get exponent 0 (1).
		for (int i = 0; i <= exp; i++) {
			
			/* Because we want to print each number in the sequence, we print 
			 * the Math.pow base with loop iteration in the exponent parameter
			 * for the Math.pow function.
			 */
			System.out.print((int)Math.pow(base, i) + " ");
			
		} // end for loop
		
		// make a new line for the next calling of the method
		System.out.println();
		
	} // End mathPowVersion method
	
} // End powersOfN Class
