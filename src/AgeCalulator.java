
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AgeCalulator {
	
	Date today= new Date();
	static int[] ages =new int [50] ;
	static Date dob ;

	public static void main(String[] args) throws ParseException  {
		
	   ageCalcutor();
	   printAge();
		
	}
	
	public static int ageCalcutor() throws ParseException {
		
		Scanner scn = new Scanner(System.in);
		String hasNext = "Y";
		int counter = 0;
		
		while(hasNext.equalsIgnoreCase("y")){
			
			System.out.println("Please enter your date of birth, month and year in MM/dd/yyyy format");
			
			String entry = scn.nextLine();
			
			DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy"); 
			
			
				dob = (Date)formatter.parse(entry);
				 
				ages[counter] = getAge(new Date(), dob);
		    
			
			System.out.println("Would you like to enter details for another client?");
			hasNext = scn.nextLine();
			counter++;
		}
		return getAge(new Date(), dob);
	}
	
	public static int getAge(Date d1, Date d2) {
		
	    int age = d1.getYear()-d2.getYear();
	    
	   
	    return age;
	}
	
	public static void printAge(){
		
		for(int i=0; i< ages.length; i++){
		    	System.out.println(ages[i]);
		    }
		  
	}

}
