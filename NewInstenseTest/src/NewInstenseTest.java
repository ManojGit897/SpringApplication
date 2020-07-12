

public class NewInstenseTest {

	public static void main(String[] args) {
		
		Class c1=null;
		Object obj=null;
		
		// load the class
		
		try {
	c1=Class.forName("java.util.Date");  
	
	obj=c1.newInstance();
	System.out.println(obj);
		
		}
		catch(Exception e) {
			System.out.println(e);  
		}
	}

}
