 import java.util.*;
class ary
{
Scanner n=new Scanner(System.in);
int b[]=new int[5];
int c;
public void get()
{

for(int i=0;i<=5;i++)
	
try{


                       { System.out.print("\nEnter "+i+"value\t\t");
                            b[i]=n.nextInt();  c=b[i];
                          }
}
catch(Exception e){System.out.println("Enter tym Exception");}
}
public void show()
                     {
                          System.out.print("\nAAry Value\t");
		try{
                       for(int i=0;i<=5;i++)
                            {
                              System.out.print("\nvalue"+b[i]);
                                if(i==5)
                                            {
                                              c=b[i];System.out.println("\n\n\tnow this is if part");
                                                        break;
                                              }
                            }
                      }
					  catch(Exception e){System.out.println("Out of bond bhaiya\t"+c);}
}
}
public class Arry
{
public static void main(String arg[])
{

ary a=new ary();
a.get();
a.show();
}
}
