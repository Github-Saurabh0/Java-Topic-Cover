import java.util.*;
class Collection2
{
public static void main(String [] args)
{

LinkedList l1 = new LinkedList();
l1.addFirst("Saurabhh");
l1.addLast("Java");
l1.add(1, "Collection => LinkedList");

System.out.println(l1.get(1));
System.out.println("First Element of LinkedList: " +l1.getFirst());
System.out.println("Last Element of LinkedList: "+ l1.getLast());

}
}