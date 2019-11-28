package com.ustglobal.google;

public class GMail extends Google {

	@Override
	void shareDocuments() {
		System.out.println("Can share only 25MB of data.");
	}
	
}
