import java.util.*;
import java.lang.*;

interface intr
{
//int num=3,res=4,mul=5;  
 void createTable();
}

   class Table implements intr 
  {  
              

                   public void creatTable()
    {int num,res,mul;

System.out.print("Enter a num to genrate table\t");
Scanner s=new Scanner(System.in);
num=s.nextInt();
System.out.print("Table of =\t"+num);

for(int i=1;i<=10;i++)
{
res=num*i;
System.out.print( "\n"+num+"*"+i+"="+res+"\n");
}
   

     }
}


	   public class Mainclass 
  	{ 


 	public static void main( String args[])
 	{
                  
                 Table t=new Table();  
            	      intr r=t;
          r.createTable();
                                   
 	//t.creatTable();

	 }
 	}


