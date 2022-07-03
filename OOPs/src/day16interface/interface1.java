package day16interface;

interface i1{
		//variable ---> by default ----> public static final
		//method ---> by default ----> public abstract
		//no complete methods/non-abstract
		//no constructor
}
interface drawable {
	int salary=25000; 	//by default---> public static final int salary=25000;
	void draw();		//by default---->public abstract void draw();
}
class rectangle1 implements drawable{
	public void draw() {
		System.out.println("drawing rectagle");
	}
}
class circle implements drawable{
	public void draw() {
		System.out.println("drawing circle");
	}
}
 class interface1 {
	public static void main(String[] args) {
		System.out.println("interface variable salary: "+drawable.salary);
		rectangle1 r1=new rectangle1();
		r1.draw();
		drawable d1=new circle();
		d1.draw();
	}
}

/**
 * Interface--> used to achieve abstraction in java
 * 		--> as we know java doesn't support mutliple inheritance using classes to overcome this 
 * 		java provides interface to support this 
 * 		--> its 100% abstract, no non-abstract method
 * 		--> inside interface will have-(no constractor)
 * 			- variable ---> public static final
 * 			- methods  ---> public abstract
 * 		--> wheneven a sub class inherits the interface they use implements keyword
 * 			class childclass implements interfacename{
 * 
 * 		}
 * 		--> As we are not allowed to create an instance of abstract class simillarly we are not allowed to create
 * 			instance of interface(because its also incomplete)
 * 		--> when a interface is getting inherited by a sub class, dn there will a contract between these classes thats
 *  			subclass needs to override all the abstract method of interface otherwise subclass becomes abstract class
 * 		--> between 
 * 			1. two classes we use 'extends'
 * 			2. two interface we use 'extends' 
 * 			3. class and interface use 'implements' 
 */
