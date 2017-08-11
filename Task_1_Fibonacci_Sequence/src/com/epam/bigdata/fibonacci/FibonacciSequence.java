package com.epam.bigdata.fibonacci;
import java.math.BigInteger;

public class FibonacciSequence {

	private int sequenceLength;
	private int i = 2;
	private int indexOfConcreteElement;
	private double evenCounter = 0;
	private double oddCounter = 2;	
	private BigInteger concreteElement;	
	
	public FibonacciSequence(int sequenceLength, int indexOfConcreteElement) {
		this.sequenceLength = sequenceLength;
		this.indexOfConcreteElement = indexOfConcreteElement;
		System.out.println("\nElement of number " + 1 + " is: " + BigInteger.ONE);  // Printing the two first elements of the sequence
		System.out.println("Element of number " + 2 + " is: " + BigInteger.ONE);	// 1 and 1 in this case
		sequencePrint(BigInteger.ONE, BigInteger.ONE);								// Passing the two first elements into the method
	}	
	
	private void sequencePrint(BigInteger x, BigInteger y) {
		BigInteger z = x.add(y);													// Calculation of the next number in the sequence
		
		if(z.remainder(BigInteger.valueOf(2)) == BigInteger.ZERO) {					// Counting of even/odd numbers through the sequence
			evenCounter++;
		}
		else {
			oddCounter++;
		}
		
		System.out.println("Element of number " + (i+1) + " is: " + z);				// Formated print of the sequence elements
		
		if (i == indexOfConcreteElement-1) {										// Finding an element at the concrete position
			 concreteElement = z;
		}
		
		i++;		
		if(i < sequenceLength) {													// Recursive call while not reached desired length of the sequence
			sequencePrint(y, z);
		}
		else {
			System.out.println("\nConcrete element of number " + indexOfConcreteElement + " is: " + concreteElement);
			System.out.println("\nEven number percentage is: " + evenCounter/sequenceLength*100 + "%");
			System.out.println("Odd number percentage is: " + oddCounter/sequenceLength*100 + "%");
		}
	}	
}
