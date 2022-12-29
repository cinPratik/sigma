/*14) Write a program on LinkedList and implement following tasks
• Add objects
• Add objects at specific location
• Remove by value
• Return the size of LinkedList
Write a program on ArrayList and implement following tasks
• Add objects
• Add objects at specific location
• Remove by value
• Check if the array is empty
*/
import java.util.*;
public class LinkedListDemo
{
	public static void main(String args[])
	{
		LinkedList<Integer> obj=new LinkedList<>();
		//• Add objects
		obj.add(6);
		obj.add(8);
		obj.add(9);
		obj.add(11);
		System.out.println("Add objects :"+obj);
		
		//• Add objects at specific location
		obj.add(0,3);
		obj.add(1,4);
		obj.add(2,5);
		obj.add(3,7);
		System.out.println("Add objects at specific location:"+obj);

		//• Remove by value
		obj.remove(0);
		System.out.println("Remove by index value:"+obj);

		//• Return the size of LinkedList
		
		System.out.println("Return the size of LinkedList:"+obj.size());

	}
}