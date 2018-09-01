import com.demo.variables.StaticVariables;


public class Implementation {
	
 	public static void main (String[] args)
	{
 		String city = "Mumbai";
 		String newCollegename = StaticVariables.college + " "+ city;
 		
		//Test t1 = new Test(12 , "Merry");  //Creation of object and Calling Constructor
		//t1.m1();
		//Test1 t = new Test1();
		//System.out.println(Test1.college); // called from classname. do not require object for static
		//System.out.println(Test1.college + " Mumbai"); 
		StaticVariables s1 = new StaticVariables(12, "Devyani");
		s1.display(newCollegename);
		
				
		
	}		
	
}