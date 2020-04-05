class Node 
{
int data;
Node next; 	
}

          class Linkedlist
                {
                 Node head;
				 int flag;
				 int i;
              public  void addNode(int value)
				            {
								  
								Node n=new Node();
                                n.data=value;
                                if(head==null)								
								        {
									      head=n;
										  arr[i]=head;
										  i++;
									    }
										
                                       else
									       {
											 Node temp;
								 			 temp=head;
											        while(temp.next!=null)
											                {
														       temp=temp.next;
													        }
											temp.next=n;	
											arr[i]=temp;
											i++;
                                            
											  
                                                										   
											}			
                                      this.sort();											
							}	



                      public void show()
					                { 
								      if(head==null)
									        {
												
												System.out.println("LinkedList is Empty");
												
											}		
										
										
                                       else
									   {Node temp=head;
								        //arr[i]=head;
							
                                        while(temp!=null)
										        {//arr[i]=temp;
												System.out.println("the value Before sort is="+temp.data);
												 //temp=temp.next;
												 //i++;
												}
												
                                         
                                   for(;i>0;i--)
								   {
									   temp=arr[i];
									   
									   
									   System.out.println("the value after reverse  is="+temp.data);
							       }

									    }										
									}

					public void sort()
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
                                }									
                                    								  
//-----------------------------------------------------------------------------------------------------//
                      public void afterSort()
					  {
						Node temp=head;		
									while(temp!=null)
										        {
													
													
												System.out.println("\nAfter sort is="+temp.data);
												 temp=temp.next;
												}
					  }	
                
				}
				
				
				
				
				
            public class ReverseLinkedList
			{
                 public static void main(String arg[])
				                     {
										Linkedlist li =new Linkedlist();
                                        li.addNode(90);
                                        li.addNode(9);
										li.addNode(70);
										li.addNode(60);
										li.addNode(50);
										li.addNode(90);
										li.addNode(200);
                                        li.show();
                                        //li.sort();
										//li.afterSort();
										 
                                       										
									 }			 
										 
										 
										 
		    }				 
	
	            
				   