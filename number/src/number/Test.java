package number;

import java.util.*;

public class Test {

	private static final int ONE = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] arr = {1, 2, 3, 4, 5};
//		for (int i : arr) {
//			System.out.println(i);
//		}
		 
		Collection<String> c = new ArrayList<String>();
		c.add(new String("aaa"));
		c.add(new String("bbb"));
		c.add(new String("ccc"));
		
		for (String o : c) {
			System.out.println(c);
		}
		
		//迭代器的用法
		Iterator<String> i = c.iterator();
		while (i.hasNext()) {
			String n = i.next();
			System.out.println(n);
		}
//		
//		Set s1 = new HashSet();
//		s1.add("a");
//		s1.add("c");
//		s1.add("b");
//		Set s2 = new HashSet();
//		s2.add("b");
//		s2.add("a");
//		s2.add("d");
//		
//		Set sn = new HashSet(s1);
//		sn.retainAll(s2);
//		
//		Set su = new HashSet(s1);
//		su.addAll(s2);
//		
//		System.out.println(sn);
//		System.out.println(su);
		
		//泛型的运用
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		Map<String, Integer> m2 = new HashMap<String, Integer>();
		
		m1.put("one", 1);
		m1.put("two", 2);
		m1.put("three", 3);
		
		m2.put("A", 1);
		m2.put("B", 2);
		
		System.out.println(m1.size());
		System.out.println(m1.containsKey("one"));
		System.out.println(m1.containsValue(1));
		System.out.println(m2.containsValue(1));
//		if (m1.containsKey("two")) {
//			int i = m1.get("two");
//			System.out.println(i);
//		}
//		
		Map<String, Integer> m3 = new HashMap<String, Integer>(m1);
		m3.putAll(m2);
		System.out.println(m3);

		//输出出现的值的次数
//		Scanner in = new Scanner(System.in);
//		int a = in.nextInt();
//		Map<String, Integer> m = new HashMap<String, Integer>();
//		for (int i = 0; i < args.length; i++) {
////			int a = in.nextInt();
//			int freq = m.get(in.nextLine());
//			m.put(args[i], freq == 0? ONE: freq + 1);
//		}
//
//		System.out.println(m.size() + " distinct words detected:");
//		System.out.println(m);
		
	}

}
