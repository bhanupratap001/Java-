import java.util.*;
public class  Counter
{
	public static void main(String arg[])
	                   {
						   HashMap m=new HashMap();
						   HashMap temp=new HashMap();
						   String key;
						   int val,i;
						   for(i=0;i<arg.length;i++)
						      {
								key=arg[i];
                                
								//System.out.println(key);
		                       
                                  Object o=m.put(key,1);
								  
                                  //m.put(5,"bhanu");	
                                      if(o!=null){ int ip = (Integer) o;
										  m.put(key,ip+1);}
									   								  
								 
                               								
							  }System.out.println(m);
						  
					     }
	
	
}
