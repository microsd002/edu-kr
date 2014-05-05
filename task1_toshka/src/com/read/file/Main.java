package com.read.file;
import sample.PointConverter;
import sample.PointConverterImpl;

import java.io.File;
import java.io.IOException;




public class Main {
    //todo: rename this to understand what is this
	static PointConverter men = new PointConverterImpl();
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("D://Depot//!education_krasnyanskiy//edu-kr//task1_toshka//root//sample.wpt");
		System.out.println(men.convertFromFile(f));
		
	}

}

