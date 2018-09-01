public class Test {
	int rollno; // Instance variable Declaration
	String name; 
	
	public Test(int rollno1,String name1) {  //local variables & Constructor class
		//this.rollno = rollno; //this refer output of instance variables
		//this.name = name;
		rollno = rollno1;
		name = name1;
	}

	public void m1()	//void means it has no return value,
	{
		System.out.println("Roll No is " + rollno );
		System.out.println("Name is " + name);
	}
}
