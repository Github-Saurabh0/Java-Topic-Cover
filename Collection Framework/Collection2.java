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

Stack s1 = new Stack();
s1.push(10);
s1.push(20);
s1.push(30);
s1.push(40);
s1.push(50);
System.out.println(s1.search(30));

}
}