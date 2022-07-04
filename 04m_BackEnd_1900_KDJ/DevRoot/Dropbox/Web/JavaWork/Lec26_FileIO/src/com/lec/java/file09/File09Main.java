package com.lec.java.file09;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

// Object Filter Stream + Collection

// Program <=== ObjectInputStream <=== FileInputStream <=== File
// Program ===> ObjectOutputStream ===> FileOutputStream ===> File

// ArrayList<> 와 같은 Collection 에서,
// 모든 데이터들이 Serializable 되어 있으면 ObjectInputStream / ObjectOutputStream 으로
// read/write 가능.

public class File09Main {
	
	public static final String FILEPATH  = "temp/member2.dat";

	public static void main(String[] args) {
		System.out.println("Object Filter Stream");

		// TODO
		
		
		System.out.println("\n프로그램 종료");
		
	} // end main()

} // end class File08Main
















