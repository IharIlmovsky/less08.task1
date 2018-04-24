package by.epam.jb24.less08.task2;

import java.util.*;

public class testPayment {

	public static void main(String[] args) {
		
		Payment thePaym = new Payment();
		
		thePaym.add(new goodItem("the_Cow", 1000, 999543));
		thePaym.add(new goodItem("the_Cheese", 20, 45687));
		thePaym.add(new goodItem("the_Chicken", 12, 236854));
		
		printout(thePaym);
	}

	public static void printout(Payment thePaym) {
		
		System.out.println("Payment consists: ");
		thePaym.printList();
	}
	
	
}
