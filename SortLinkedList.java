class Node 
{
int data;
Node next; 	
}

          class Linkedlist
                {
                 Node head;
				 int flag;
              public  void addNode(int value)
				            {
								  
								Node n=new Node();
                                n.data=value;
                                if(head==null)								
								        {
									      head=n;
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
											}								  
							}	



                      public void show()
					                {
								      if(head==null)
									        {
												
												System.out.println("LinkedList is Empty");
												
											}		
										
										
                                       else
									   {Node temp=head;
                                        while(temp!=null)
										        {
												System.out.println("the value Before sort is="+temp.data);
												 temp=temp.next;
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
				
				
				
				
				
            public class SortLinkedList
			{
                 public static void main(String arg[])
				                     {
										Linkedlist li =new Linkedlist();
                                        li.addNode(15);
                                        li.addNode(20);
										li.addNode(40);
										li.addNode(90);
										li.addNode(80);
										li.addNode(10);
                                        li.show();
                                        li.sort();
										li.afterSort();
                                       										
									 }			 
										 
										 
										 
		    }				 
	
	            
				   