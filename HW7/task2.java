package HW7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class task2 {

	public static void main(String[] args) {
		Map<String,String> personMap =new HashMap<String,String>();
		personMap.put("L", "Sasha");
		personMap.put("J", "Lila");
		personMap.put("K", "Sasha");
		personMap.put("P", "Sasha");
		personMap.put("M", "Povla");
		personMap.put("I", "Kolya");
		personMap.put("O", "Misha");
		personMap.put("N", "Nika");
		personMap.put("B", "Viktor");
		personMap.put("V", "Ostap");
		System.out.println(personMap);
		String fname;
		String lname;
		int n=0;
		for (Iterator i = personMap.entrySet().iterator(); i.hasNext();)
		{
			   Map.Entry entry = (Map.Entry) i.next();
			   fname=(String)entry.getValue();
			   lname=(String)entry.getKey();
			      for (Iterator j = personMap.entrySet().iterator(); j.hasNext();)
			      {
					   Map.Entry entry1 = (Map.Entry) j.next();
					   if(fname==(String)entry1.getValue()&&lname!=(String)entry1.getKey())
					   {
						   n++;
						   

					   }
						   
				}
			   
			  
			}
		if(n>0)
		{
			System.out.println("There are at less two persons with the same ");
		}
		else
		{
			System.out.println("There aren't  two persons with the same ");
        }
		for (Iterator i = personMap.entrySet().iterator(); i.hasNext();)
		{
			   Map.Entry entry = (Map.Entry) i.next();
			   if("Ostap"==(String)entry.getValue())
				   i.remove();
		}
		System.out.println(personMap);
	
	}

}
