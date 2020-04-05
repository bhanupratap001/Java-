class Shortarry
{
//int arr[]=new arr[]; 
int arr[]={1,2,3,4,5};
int i,j,var;
public void showlength()
             {
				 //int p=0;
				 //=arr.length();
                  // System.out.println("the length of aarry"+arr.length());				 
				 
			 }
public void shorting()
                   {
                     for(i=0;i<=4;i++)
					     {
                           for(j=0;j<4;j++)
                                { 
							      if(arr[j]>=arr[j+1])
								  {
                                  var=arr[j+1];
                                  arr[j+1]=arr[j];
                                  arr[j+1]=var;
								  }								  
								}						   
						 
						 
						 }				   
								for(i=0;i<=4;i++)
									{
										System.out.println("After shorting="+arr[i]);
										
									}
									
					}
									
									
						public void oneloop()
						             {
										for(j=0;j<4;j++)
										     {
                                                  if(j==4){break;}
												  
												  
												  if(arr[j]<=arr[j+1])
								                                {
                                                                 var=arr[j];
                                                                 arr[j]=arr[j+1];
                                                                 arr[j+1]=var;
																 j=0;
								                                }								  
								             }
												  
                                             for(i=0;i<=4;i++)
									                        {
										System.out.println("After shorting="+arr[i]);
										
									                        } 										 
										     }											
										 
										 
										 
									 			
									
									
				   
				   
				   public static void main(String arv[])
				                           {
											   
											 Shortarry ar=new Shortarry();
                                              ar.shorting();											 
											  //ar.oneloop(); 
											  //ar.showlength();
										   }

  }
			 
	  		 
			 
