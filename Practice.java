 class Node 
{
String data;
Node next; 	
}

          class Linkedlist
                {
                 Node head;
				 int flag=0;
				 Node temp;
              public  void addNode(String value)
				            {
								  
								Node n=new Node();
                                n.data=value;
                                if(head==null)								
								        {
									      head=n;
									    }
										
                                       else
									       {
											
								 			 temp=head;
											        while(temp.next!=null)
											                {
														       temp=temp.next;
													        }
											temp.next=n;			
											}								  
							}	



                      public void show()
					                {
								      if(head==null)
									        {
												
												System.out.println("LinkedList is Empty");
												
											}		
										
										
                                       else
									   { temp=head;
                                        while(temp!=null)
										        {
												System.out.println("the value Before sort is="+temp.data);
												 temp=temp.next;
												}
												
                                         
                                   

									    }										
									}

		/*			public void sort()
					            {    Node temp=head;
									 while(temp.next!=null)
								  {
									
									if(temp.data<temp.next.data)
									                 {
													   //System.out.println("sahi ja ra h londe");	 
												 int hold =temp.data;
                                                    temp.data=temp.next.data;
                                                     temp.next.data=hold;	
													 flag=0;
                                                 	}
									  				else{flag=1;}
													if(flag==0){this.sort();}
					             	temp=temp.next;							 
								    }
                                }	*/								
                                    								  
//-----------------------------------------------------------------------------------------------------//
                      public void checkPalendrom()
					  {
						int i=0;
						temp=head;
                         Node tem2;						
						Node arr[]=new Node[5];
									while(temp!=null)
										        {
													
												//System.out.println("\nAfter sort is="+temp.data);
												 
											     arr[i]=temp;
												i++;
												temp=temp.next;
							                   	}temp=head;
												
						 			while(temp.next!=null)
									       {i=1;
											tem2=arr[i];
                                            if(tem2.data==temp.data){flag=1;}else flag=0;
                                            i--;
                                            temp=temp.next;											
                                              

      									   }
                           if(flag==0){System.out.println("not Palendrom");}else System.out.println("Palendrom");										   
												
					  }	
                
				}
				
				
				
				
				
            public class Practice
			{
				
					   
                 public static void main(String arg[])
				                     {
										Linkedlist li =new Linkedlist();
										
                                      //  li.addNode("amit");
                                       // li.addNode("divik");
									//	li.addNode("pankaj");
									//	li.addNode("divik");
									//	li.addNode("bhanu");
									      
                                   // 	li.show();
								//		li.checkPalendrom();
								    
                                       										
									 }			 
										 
										 
										 
		    }				 
	
	            
				   