public class Multithread extends Thread
{        int a=2,b=3;
		 public  void run()
		                  {
							  
				System.out.println("bhanu");
				showmulty();
				for(int i=0;i<=4;i++)
				{
				if(a==3)
					
					{
					multy();}
							  
						  }}
							 public void multy(){b=a*b;System.out.println("multiyply calculation ho gi");
							 b=a+b;System.out.println("ab addtion ho gi"); }                                                     
							 public void showmulty(){a++;System.out.println("after multiplyis="+b+"bhanu thread");
							 System.out.println("after add="+b); }
							 
							 
							 

							 
						  	
						  
						  public static void main(String argv[])
						                                       {
																   Multithread m=new Multithread();
																   Multi m2=new Multi();
																   m.start();
															       m2.start();
																															  
															   }
}

															   
	
	
               	
	


	class Multi extends Thread 
                            {
								int a=2,b=5;
								public void run()
								                 {
											    System.out.println("sumit");
												faltu1();
                                                faltu2();
                                                faltu3();												 
												 }
												 public void faltu1(){b=a+b;System.out.println("m faltu1");}
												 public void faltu2(){System.out.println("m faltu 2");}
												 public void faltu3(){System.out.println("m faltu 3");}
								
								
								
							}
