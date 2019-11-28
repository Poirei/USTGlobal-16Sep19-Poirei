package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByMicr implements Comparator<Bank>{

	@Override
	public int compare(Bank o1, Bank o2) {
		return ((Integer)o1.micr).compareTo(o2.micr);
	}
	
}
