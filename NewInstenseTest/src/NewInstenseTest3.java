

import java.lang.reflect.Constructor;

public class NewInstenseTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class c1=null;
		Object obj=null;
		
		try {
			// load the class 
			c1=Class.forName(args[0]);
			// get access the all constractor of the loaded class 
			Constructor cons[]=c1.getDeclaredConstructors();
			
			// initiating the class using 2-param constructor
			
			obj=cons[0].newInstance(10,20);
			
			System.out.println(obj);
			
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
