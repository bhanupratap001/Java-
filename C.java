class A
{
public int max(int x,int y){if(x>y)return x;else return y;}
}
class B extends A
{
public int max(int x,int y)
             {
			 return super.max(y,x)-10;
			 }
}
public  class C extends B
{
public int max(int x,int y)
           {
		   return super.max(x+10,y+10);
		   }
		   
		public static void main(String arg[])
		{
			C obj=new C();
			System.out.println(obj.max(13,19));
			
		}   
		   
}