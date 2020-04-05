 class Node 
{
String data;
Node next; 	
}

          class Linkedlist
                {
                 Node head;
				 int flag;
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
                      public Node returnLastNode()
					  {
						
						temp=head;		
									while(temp!=null)
										        {
													
												//System.out.println("\nAfter sort is="+temp.data);
												if(temp.next==null)
												{return temp;}
												 temp=temp.next;
												 
												}
									return temp;			
					  }	
                
				}
				
				
				
				
				
            public class MergeLinkedList
			{
                 public static void main(String arg[])
				                     {
										Linkedlist li =new Linkedlist();
										Linkedlist l2 =new Linkedlist();
										
                                        li.addNode("bhanu");
                                        li.addNode("divik");
										li.addNode("panakj");
										li.addNode("Govind");
										li.addNode("Harshit");
										li.addNode("Shivam");
                                        //li.show();
										l2.addNode("ankush");
										l2.addNode("Vishal");
									
									     Node t2=li.returnLastNode();
                                          t2.next=l2.head;									 
									
									li.show();
                                       										
									 }			 
										 
										 
										 
		    }				 
	
	            
				   