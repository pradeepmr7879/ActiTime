package Collection;

import java.util.ArrayList;

import org.apache.xerces.util.SynchronizedSymbolTable;

public class Arra2
{
	public static void main(String[] args)
	{
		System.out.println("hi");
		ArrayList l1 = new ArrayList();
		l1.add("hi");
		l1.add("hello");
		l1.add("");
		l1.add(13);
		l1.add(null);
		
		int size = l1.size();
		
		for(int i=0; i<size;i++)
		{
			System.out.println(l1.get(i));
		
		}
	    
		
	}

}
