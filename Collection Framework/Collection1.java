
//  import java.util.*;
//
//  class Collection1
//  {
//  public static void main(String [] args)
//  {
//
//  ArrayList l1 = new ArrayList(5);
//  l1.add("A");
//  l1.add("B");
//  l1.add("C");
//  l1.add(2,"G");
//
//  Iterator g1= l1.iterator();
//while(g1.hasNext())
//  {
//  System.out.println(g1.next());	
//  }
//  }
//  }

// =============================================================

//import java.util.*;
//
//class Collection1
//{
//public static void main(String [] args)
//{
//
//ArrayList l1 = new ArrayList(5);
//l1.add("A");
//l1.add("B");
//l1.add("C");
//l1.add(2,"G");
//
//System.out.println("Initial Array: "+l1);
//
//Iterator g1= l1.iterator();
//while(g1.hasNext())
//{
//	String s1 = (String)g1.next();
//	if(s1 != "G")
//	{
//    System.out.println(s1);
//	}	
//}
//}
//}


// =============================================================


import java.util.*;

class Collection1
{
public static void main(String [] args)
{

ArrayList l1 = new ArrayList(5);
l1.add("A");
l1.add("B");
l1.add("C");
l1.add(2,"G");

System.out.println("Initial Array: "+l1);

Iterator g1= l1.iterator();
while(g1.hasNext())
{
	String s1 = (String)g1.next();
	if(s1.equals("G"))
	{
    g1.remove(); // Removes "G" safely
	}	
}
System.out.println("Final Array: " + l1); // [A, B, C]
}
}