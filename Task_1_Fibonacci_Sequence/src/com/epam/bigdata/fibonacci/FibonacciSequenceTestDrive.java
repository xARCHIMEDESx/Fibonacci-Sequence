package com.epam.bigdata.fibonacci;
import java.util.InputMismatchException;

public class FibonacciSequenceTestDrive {
	
	public static void main (String[] args) {
		try {
			System.out.print("Enter the sequence length: ");
			int length = SingletonScanner.getInstance().nextInt();
				
			if(length < 3) {
				throw new IllegalArgumentException("The range of the sequence must be more than two.\n");
			}
				
			System.out.print("Enter the number of concrete element to be shown: ");
			int elem = SingletonScanner.getInstance().nextInt();
				
			if(elem > length) {
				throw new IllegalArgumentException("The number of concrete element must be in the range of the sequence.\n");
			}							
				
			new FibonacciSequence(length, elem);
		}						
			
		catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
			main(args);
		}
			
		catch(InputMismatchException ex){
			System.out.println("Wrong input. Try again.\n");		
			SingletonScanner.getInstance().next();
			main(args);
		}			
	}			
}
