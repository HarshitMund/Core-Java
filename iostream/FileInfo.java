package com.rays.iostream;

import java.io.File;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) {

//		Create object of "a.txt" file
		File f = new File("D:/IOStream Files/a.txt");

//		Check if file exists
		if (f.exists()) {

//			Name of file
			System.out.println("Name: " + f.getName());

//			Path of File
			System.out.println("Path: " + f.getAbsolutePath());
			
//			Check access permission
			System.out.println("Access permission");
			System.out.println("Writable: " + f.canWrite());
			System.out.println("Readable: " + f.canRead());
			
//			Check if it is a directory or a file
			System.out.println("Is File: " + f.isFile());
			System.out.println("Is Dir: " + f.isDirectory());
			
//			Last modified date of file/directory
			Date d = new Date(f.lastModified());
			System.out.println("Date Modified: " + d);
			
//			Length of file
			long length = f.length();
			System.out.println("Length: " + length + " bytes");
			
		} else {
			System.out.println("File doesn't exists");
		}

	}

}
