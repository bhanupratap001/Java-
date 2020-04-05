import java.util.Scanner;
class SimpleIntrest

{




public static void main(String[] args)
                          {
							  int m,r,si,t;
int prsnt=100;
							 Scanner sc = new Scanner(System.in); 
							 System.out.println("Please enter Amount");
                          	  
                             m=sc.nextInt();
                            
                             System.out.println("Enter Rate Of Intrest");
                             r=sc.nextInt();
                               System.out.println("Enter Time period ");
                              t=sc.nextInt();
                             
                              si=m*r*t/prsnt;
                      System.out.println("Ok Your Intrest is="+si);							  
							 
							  
						  }	
	
	
}