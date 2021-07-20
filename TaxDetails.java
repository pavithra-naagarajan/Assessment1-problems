package assessmentquestions;
import java.util.Scanner;
public class TaxDetails
{
	 
	public static void main(String[] args) 
	{
    Scanner s= new Scanner(System.in);   
    System.out.println("Enter Gender male or female : ");  
    String gender= s.nextLine();             	
    System.out.println( "Enter Income: " );
    int income = s.nextInt();
    System.out.println( "Enter year: " );
    int year = s.nextInt();
   
 
    	if(gender.equalsIgnoreCase("male"))
    	{
    		if(year!=2011 && year!=2012)
    		{
    			if(income<=180000)
    			{
    				System.out.println("No Tax to pay");
    			}
    			else if(income>=180001 && income<=500000)
    			{
    				System.out.println("10%");
    			}
    			else if(income>=500001 && income<800000)
    			{
    				System.out.println("20%");
    			}
    			else if(income>=800000)
    			{
    				System.out.println("30%");
    			}
    		}
    	}
    	 
    
    else if (gender.equalsIgnoreCase("female"))
		{
			if(year==2011 || year==2012)
			{
				if(income>=190000)
				{
					System.out.println("No Tax to pay");
				}
				else if(income>=190001 && income<=500000)
				{
					System.out.println("10%");
				}
				else if(income>=500001 && income<800000)
				{
					System.out.println("20%");
				}
				else if(income>=800000)
				{
					System.out.println("30%");
				}
			}
		}
    
	}

}


