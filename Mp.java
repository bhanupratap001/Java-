import java.util.*;
class Mp
{
String key;
int val=1;
public void frequency(r)
{
key=r;	
HashMap m=new HashMap();

m.put(key,val);
//m.put("sumit",400);
//m.put("divik",600);
//m.put("bhanu",100);
System.out.println(m);	
	
}
public static void main(String arg[])
{
String r=arg;	
Mp m=new Mp();
m.frequency(r);
}
}