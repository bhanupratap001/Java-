      //Circular Linked List
class Node//node class declartion
{
int data;//contain the data
Node next=null;//contain the next node address	
}
  
  
  class Linkedlist//Liked List class declartion
{
	  int size=0;
	  Node head;//it contain only starting node of class
	  Node temp;//it will contain tempory addrs of next node in traverseing 
	  
	  public void addNode(int val)
	   {
		      
	if(size<5)//size is defined because it is a linkedList and temp.next can never find a NULL value
  {
			  
			  
			  
			Node newnode=new Node();//create a node in linked list
			newnode.data=val;//assign a value in data part of node
			if(head==null)//here check LinkedList is alredy exist or not
			  
					{
							head=newnode;//assign starting node address to head
							size=1;
							System.out.println(size+"th Node is Inserted succesFully\n"+newnode.data);
					}
						else//if head is not null than execute this part
							{
								 temp=head;//temp is equal to head to traverse
								while(temp.next!=null)//check while temp not equals to null
								{  
								temp=temp.next; 
								}//terminate loop when temp found temp.next=null
						
						
					                temp.next=newnode;//this line is execute when text.next is reched on null
									size++;
								    System.out.println(size+"th Node is Inserted succesFully\n"+newnode.data);
									if(size==5){
										newnode.next=head;
										//System.out.println("newnode next"+newnode.next);
										//System.out.println("head node"+head);
										
										
										}//to make cicular List
					 	    }
	   }
	   
	   else System.out.println("\n\nInsertion is not Posiible");
	 }  
		
		
public void traverse()//traverse method is acces the every node of LinkedList
            
			{size=0;
				if(head==null)
			   {
				   System.out.println("LinkedList not have any Node to travese");
			   }
			   else{
				
				
			             temp=head;//assign the head node to temp that is also a node type
				        while(temp!=null&&size<5)//because it a Circular linkedList so temp pointer never found null
				           {                
							
					          System.out.println("\nYour  Node  Data is\t"+temp.data);
					           temp=temp.next;
							   size++;
						   }
					}
			}
			
 			
			
public void checklistsize()//defination of checklistsize method
           {size=0;//size is set to zero because traverse method set it 5
			   if(head==null)
			   {
				   System.out.println("Linked List is empty");
				   
			  }
			       else{
			              temp=head;//assign the head address to temp that is also node type
				          while(temp!=null&&size<5)//this loop is execute till size not reched last  node of List
				         {
					
					         temp=temp.next;//assign the next node to pre node
					         size++;//calculate size
				         } 
				           System.out.println("\n\nYour List size is=\t"+size);
						   
		                }	
		   }
		   
		   
public void checkCircular()
        {
			size=1;//size is set to zero because traverse method set it 5
			   if(head==null)
			   {
				   System.out.println("Linked List is empty");
				   
			  }
			       else{
			              temp=head;//assign the head address to temp that is also node type
				          while(temp.next!=null&&size<5)//this loop is execute till size not reched last  node of List
				         {
					
					         temp=temp.next;//assign the next node to pre node
					         size++;//calculate size
						 } 
				          if(temp.next==head){System.out.println("\n\nYour LinkedList is a Circular List\t");}
						  else System.out.println("LinkedList is NOT CIRCULAR");
						   
		           }
			
		}		   
		   
			
			
	}
//LikedList class is closed here





  public class Practice
{
public static void main(String arg[])
                  {  
				     Linkedlist li=new Linkedlist();//create a new instance of LinkedList
					
					 li.addNode(10);//addNode method is called to insert a node into list
                     li.addNode(20);
					 li.addNode(50);
				     li.addNode(70);	
                     //li.addNode(40);
                     //li.addNode(90);//this node can be inserted because size is alredy defined that is 5
					 //li.addNode(80);//this node can be inserted because size is alredy defined that is 5
                     li.traverse();//traverse method is called to acces data and each node
					 li.checklistsize();//find the how many node is exist in LinkedList
                     li.checkCircular();//check LinkedList is Cicular or not 					 
				  }
}