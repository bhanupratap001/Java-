import java.util.*;
class Example
{
int roll_no;
String stu_name;
public void putData(int no,String y)
            {
				roll_no=no;
				stu_name=y;
				System.out.println(stu_name+roll_no);
			}	
	
	
	
	
}










//MAIN CLASS IS START FROM HERE

 public class Colection
 {   ArrayList arr1 = new ArrayList(4);
	 ArrayList  arr2 =new  ArrayList(4);
	 int lastindex;
	public void firstList()
	            {  				 	
					 arr1.add("bhanu");
					 arr1.add("Divik");
					 arr1.add("Govind");
					 arr1.add("Harsh");
					 arr1.add("sumit");
			    }
	public void secondList()
	             {
					 
					 arr2.add("PRATAP");
					 arr2.add("GOEL");
					 arr2.add("BNASAL");
					 arr2.add("TYAGI");
					 arr2.add("LATYAIN");
				 }			
	public void conCatinateList()
	             {    arr1.addAll(arr2);  
					  arr1.removeAll(arr1);
					
			     }	
	public void showList()
	             {
					 
					 System.out.println("Your List is ="+arr1);
					 
				 }
 
 public static void main(String arg[])
                    {
						//Example ex=new Example();
						 //ex.putData(5,"bhanu");
						//ArrayList temp=new ArrayList();//create a new list
						//temp.add(ex);//add a object in list
						//System.out.println(temp);//print the cotent of list not object
					Colection cl=new Colection();
				   
					cl.firstList();
					cl.secondList();
					cl.conCatinateList();
					cl.showList();
				
					}
} 