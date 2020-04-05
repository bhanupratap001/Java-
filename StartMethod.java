import java.io.IOException;
import java.util.Scanner;
import java.io.*;
public class StartMethod extends Thread//We Are Inherte Thread class
{        int H=0,M=0,S=0;//variable for minuts,hours and seconds 
         
		 public  void run()//Here run method is overload
		                  {
						     Start();//This Start method is defined by us in StartMethodclass
						   }//RunMethod
							 public void Start()//Defination of Start Methods
							                  {
												  for(S=0;S<=60;S++)//This loop is Run from 0 to 60 for incresing in seconds variable
												  {clearScreen();
													  System.out.println("Seconds="+S);//To Print Seconds vlaues
													  try{
													       sleep(1000);//This thread will sleep for  1 second  and loop also will increse after 0ne second
													  	  }
													  catch(Exception e){System.out.println(e);}
												   if(S>=60)//if seconds will be cross 60 than we have to increse Minuts variable
												      { 
														 M=M+1;
														 System.out.println("Minuts="+M);
														 S=0;//After increse in seconds we have to set seconds to 0
                                                          if(M>60)//if minuts Go Greater 60 that means is is equals to 1 hours
												            {System.out.println("Minuts"+M);
																 
																H=H+1;
															}//InnerIfBlock														 
														  
													  }//CloseIfBlock
													  
													  
													  
												   }//ForLoop
												  
							                  }//StartMethod                                                     
							     public static void clearScreen() {
   // System. out. print("\033[H\033[2J");
   // system("CLS");

      }//Clearscrn
							 
							 
							 

							 
						  	
						  
						  public static void main(String argv[])
						                                       {
																   
																   StartMethod m=new StartMethod();//creatting object of thread startmethod
																   
																   Scanner sc=new Scanner(System.in);//create variable for for hold "s"
																   String s;//for Start"s"
																   String x;//For start "x"
																   System.out.println("Enter S For Start Stopwatch");//waiting for Gething String ="s";
																   s=sc.next();
																   m.start();//StartedThred start method is predifined in thread class
																      	System.out.println("Enter x For stop Stopwatch");//waiting for geting string ="x"
																         x=sc.next();
																         
																         if(x.equals("x"))//If uesr enter x than stopwatch will stop
																            {
																            	 
																            	 m.stop();//stope method is predifined in thread class 
																            }//IfBlock
																    }//MainMethod

}//MainPublicClass

															   
	
	
               	
	

 