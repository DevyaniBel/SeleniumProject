package com.demo.FlowControl;

public class ForLoop {

	public static void main(String[] args) {
		/*for (int i=0; i<=10; i++) {
			System.out.println("Line " + i);
		}*/

		/*int i = 0;
		for (System.out.println("Devyani");i<10; System.out.println("Belsare")) {
			System.out.println(i++);
		}*/

		String[] values = new String[4];//indexoutofbound if we try to add 5th element
		values[0] = "WebDriver";
		values[1] = "Grid";
		values[2] = "IDE";
		values[3] = "RC";

		for (String value: values) { //for each for loop when we do not know about size (localvar : collection)
			System.out.println(value);
		}

		//-------------------------------------------
		//for loop break
		for(int i=0; i<values.length;i++) {
			if(i==0)
				System.out.println("I am into break for loop"); 
			if(values[i]=="IDE") {
				break;
			}
			System.out.println(values[i]);

		}

		//for loop contionue
		for (String value : values) {
			if (value.startsWith("G")) {
				continue;
			}
			System.out.println(value);
		}
	}

}
