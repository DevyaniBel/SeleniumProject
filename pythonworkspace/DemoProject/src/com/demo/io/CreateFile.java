package com.demo.io;
import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateNewFile("temp.txt");
	}
	public static void CreateNewFile(String filename) {

		String filePath = System.getProperty("user.dir");


		File file = new File(filePath+ "\\"+ filename);
		System.out.println(filePath +"\\"+ filename);

		try {
			if (!file.exists())	{
				file.createNewFile();
				System.out.println("File is Created");
			}
			else {
				System.out.println("File already exists");
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}

