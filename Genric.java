public class Genric
{
	
public void arr(String s[])
                 {
					for(int i=0;i<s.length;i++)
					{
					   System.out.println(s[i]);
				    }				
				 }


public static void main(String arg[])
                  {
               String s[]= new String[]{"bhanu","divik","govind"};	
                     Genric gn=new Genric();		   
					 gn.arr(s);
                  }
	
}