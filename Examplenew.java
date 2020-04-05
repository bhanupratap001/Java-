import java.util.Scanner;
public class Examplenew
{
public  int no;
protected static int n2;
public void fun()
                  {
					        Scanner in = new Scanner(System.in);
							
					   no = in.nextInt();
					  //System.out.println(no);
					  n2 = in.nextInt();
					  //System.out.println(no);
					  
					  
				  }
				  public void show()
				  {
					  System.out.println(no);
					  System.out.println(n2);
					  
				  }
				  public static void main(String[] arg)
				  {
					  
					  Examplenew n=new Examplenew();
					  n.fun();
					   Examplenew n2=new Examplenew();
					   n2.show();
				  }

}
