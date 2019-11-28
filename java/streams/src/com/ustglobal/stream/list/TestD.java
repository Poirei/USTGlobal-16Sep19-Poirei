package com.ustglobal.stream.list;

import java.util.ArrayList;
import java.util.Comparator;

public class TestD {
	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		
		marks.add(70);
		marks.add(67);
		marks.add(68);
		marks.add(96);
		marks.add(56);
		marks.add(84);
		marks.add(77);
		
		Comparator<Integer> cmp = (m1, m2) -> {
			if (m1 > m2)
				return 1;
			else if (m1 < m2)
				return -1;
			return 0;
		};
		
		long l = marks.stream().filter(m -> m < 30).count();
		System.out.println("No. of failed students : "+l);
		
		System.out.println("============================");
		
		int min = marks.stream().min(cmp).get();
		System.out.println("Min marks : "+min);
		
		int max = marks.stream().max(cmp).get();
		System.out.println("Maximum marks : "+max);
	}
}
