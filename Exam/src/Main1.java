import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
public class Main1
{
	public static void main(String[] args)
	{		
		HashMap<Mamal,String> f = new HashMap<Mamal,String>();
		Mamal a = new Mamal("sa",1,1);
		Mamal b = new Mamal("sb",2,1);
		Mamal c = new Mamal("sc",3,1);
		Mamal d = new Mamal("sd",1,1);
		f.put(a, "carlos");
		f.put(b, "luis");
		f.put(c, "carlosd");
		f.put(d, "ultimoluis");
		System.out.println(f.size());
		System.out.println(f.keySet());
		System.out.println(f.get(a));
		HashSet<Mamal> set = new HashSet<Mamal>();
		set.add(a);
		set.add(b);
		set.add(c);
		set.add(d);
		System.out.println(set);
		//showHashSet();
		//showHashMap1();
		/*
		Animal s;
		s = new Mamal("perro", 1, 4);
		System.out.println(s);

		ArrayList<Mamal> list = new ArrayList<Mamal>();
		list.add((Mamal)s);
		list.add( new Mamal("gato",2,3));
		list.add( new Mamal("delfín",3,3));
		list.add( new Mamal("ana",-1,3));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		ByName cmp = new ByName();
		Collections.sort(list,cmp);
		System.out.println(list);
		*/
	}
	private static void showHashMap1() {
		HashMap<String,Integer> f;
		f = new HashMap<String,Integer>();
		f.put("rafael", 12);
		f.put("jose", 10);
		f.put("diego", 81);//borrado
		f.put("diego", 8);
		f.put("carlos",10);
		System.out.println(f.size());
		System.out.println(f.get("jose"));
		System.out.println(f.containsKey("ana"));
		System.out.println(f.containsKey("carlos"));
		System.out.println(f.containsValue(1));
		System.out.println(f.containsValue(12));
		f.remove("carlos");
		System.out.println(f.size());
		System.out.println(f.containsKey("carlos"));
		System.out.println(f.get("luisa"));
		ArrayList<String> keyList =
				new ArrayList<String>(f.keySet());
		
		for (String k : f.keySet())
		{
			System.out.println(k);
		}
	}
	private static void showHashSet()
	{
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(9);
		set.add(3);
		set.add(13);
		set.add(3);
		System.out.println(set.size());
		System.out.println(set.contains(9));
		set.remove(9);
		System.out.println(set.contains(9));
		System.out.println(set.size());
		ArrayList<Integer> list;
		list = new ArrayList<Integer>(set);
		for (Integer i : set) {
			System.out.println(i);
		}
	}
}

