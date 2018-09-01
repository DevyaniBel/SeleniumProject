package com.demo.io;
import java.io.File;

public class CreateDirectory{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createADirectory("testdir1");

	}
	public static void createADirectory(String DirectoryName) {
		// TODO Auto-generated constructor stub
		String workingDirectory = System.getProperty("user.dir");
		String dir = workingDirectory + File.separator + DirectoryName;

		System.out.println("Final file directory " + dir);

		File file = new File(dir);
		if (!file.exists())	{
			file.mkdir();
			System.out.println("Directory is Created");
		}
		else {
			System.out.println("Directory is already existed");

		}
	}
}

