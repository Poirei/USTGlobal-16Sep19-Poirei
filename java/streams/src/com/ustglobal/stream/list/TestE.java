package com.ustglobal.stream.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestE {
	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<Integer>();

		marks.add(70);
		marks.add(67);
		marks.add(68);
		marks.add(96);
		marks.add(56);
		marks.add(84);
		marks.add(77);
		
		Comparator<Integer> c = (m1, m2) -> {
			if (m1 > m2)
				return -1;
			else if (m1 < m2)
				return 1;
			return 0;
		};
		
		List<Integer> l = marks.stream().sorted(c).collect(Collectors.toList());
		Iterator<Integer> itr = l.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
