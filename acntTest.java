package by.epam.jb24.less08.task1;

import java.text.*;
import java.util.*;

public class acntTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String v_acntNumber = "BYEPM_1029384756";		
		SimpleDateFormat dateformat2 = new SimpleDateFormat("dd/MM/yyyy");
		Currency curr  = new Currency("Indian rupee",356,"INR");
		
		String s_date = "30/11/1999";
		try {
			Date bdate = dateformat2.parse(s_date);
			person v_owner = new person ("John","Doe","IDPERS##DD#MM#XX#9631",bdate);
			bankAccount theAccount = new bankAccount (v_acntNumber,v_owner,curr);
			System.out.println(theAccount.toString());
		}
		catch (ParseException e) {
			System.out.println("Error due to date parcing occured");
			e.printStackTrace(); } 
	}
}
