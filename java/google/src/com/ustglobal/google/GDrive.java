package com.ustglobal.google;

public class GDrive extends Google {

	@Override
	void shareDocuments() {
		System.out.println("Can share only 15GB of data.");
	}
	
}
