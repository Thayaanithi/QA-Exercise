package org;

import java.io.FileReader;

public class LogException {
	public void divbyZero() {
		System.out.println(10 / 0);

	}

	public void arrayBound() {
		int[] x = new int[5];
		System.out.println(x[6]);
	}

	public void fileNotfound() throws Exception {
		FileReader fr = new FileReader("x.txt");
	}

}