public class Fibbonacci
			{
				public static int[] sereis =new int[11];
				  public static int[]  Find()
				           {
							   
							   
							   sereis[0]=0;
							   sereis[1]=1;
                                for(int i=1;i<10;i++)
								     {
										sereis[i+1]=sereis[i-1]+sereis[i]; 
										 
										 
									 }
							        	
                                
                                 
									
								return sereis;
						   }	   
					   
					   
                 public static void main(String arg[])
				                     {
										int[] receve= new int [11];
									 
                                           receve=Find();
                                          for(int i=0;i<10;i++)
										  {
								           System.out.println(receve[i]);

										  }										 
								    
                                       										
									 }
			}								