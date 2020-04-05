class Outerclass
{
	
 class Innerclass
	      {    public void innerMethod()
		                    {
			                  System.out.println("This is innerclass method");
		                    }
		  }
}			
			
			
public  class Nestedclassexample
{			
	public static void main(String arg[])
	 {
	   	 Outerclass out= new Outerclass();
		 Outerclass.Innerclass inn= out.new Innerclass();
		 inn.innerMethod();
	 }		
			
}