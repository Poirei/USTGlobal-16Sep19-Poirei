package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestJ {
	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue();
		pq.add(12);
		pq.add(24);
		pq.add(34);
		pq.add(98);
		
		System.out.println("Before poll : \n" + pq);
		Iterator<Integer> itr = pq.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(pq.poll());
		
		
	}
}
