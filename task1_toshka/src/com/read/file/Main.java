package com.read.file;
import sample.PointConverter;
import sample.PointConverterImpl;

import java.io.File;
import java.io.IOException;




public class Main {
	static PointConverter men = new PointConverterImpl();
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C://Java/GIT/Toshka/root/sample.wpt");
		System.out.println(men.convertFromFile(f));
		
	}

}

