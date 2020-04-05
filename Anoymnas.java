class Outer
{
	public void show()
	           {
				   System.out.println("Namste g");
				   
				}
				
				class Inner
				{Inner in =new Inner(){public void show(){System.out.println("HELLO");}};}
  

}
	   
	   
public  class Anoymnas
{   
	  public static void main(String arg[])
	                     {
						   	Outer out=new Outer();
							Outer.Inner ir=out.new Inner();
							//ir.show();
						 } 
	   
	   }