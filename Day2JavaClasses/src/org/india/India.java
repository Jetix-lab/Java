package org.india;

import org.tamilnadu.TamilNadu;

//child

public class India  extends TamilNadu{
	public void southLanguages() {
		System.out.println("Refer Below");
	}
	public static void main(String[] args) {
		India ind = new India();
		ind.southLanguages();
		ind.Tamil();
		ind.malayalam();
		ind.telugu();
	}

}
