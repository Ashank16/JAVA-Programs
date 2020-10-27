class Wrapper { 
    public static void main(String args[]) { 
	int b = 16; 
	Integer intobj = new Integer(b); 
	float c = 30.5f; 
	Float floatobj = new Float(c); 
	double d = 160.7; 
	Double doubleobj = new Double(d); 
        
	// printing the values from objects 
	System.out.println("Values of Wrapper objects (printing as objects): "); 
	System.out.println("Integer object intobj: " + intobj); 
	System.out.println("Float object floatobj: " + floatobj); 
	System.out.println("Double object doubleobj: " + doubleobj); 
                
	// unwrapping objects to primitive data types 
	int iv = intobj; 
	float fv = floatobj; 
	double dv = doubleobj; 
        
	// printing the values from data types 
	System.out.println("Unwrapped values (printing as data types): "); 
	System.out.println("int value, iv: " + iv); 
	System.out.println("float value, fv: " + fv); 
	System.out.println("double value, dv: " + dv); 
        System.out.println("Ashank Juyal\n45-IT-18");
    } 
} 
    