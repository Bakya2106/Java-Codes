//inner class
//static class
//member class- nonstatic
//anonymous class


class Outer
{
	class Inner //Outer$Inner.class
	{
		
		Inner() {
			System.out.println("In Inner constructor");
		}
		//innerclass
		
		public  void display() {
			System.out.println("In Inner");
		}
	}
}
public class InnerClass 

{
 public static void main(String[] args) {
	
	 Outer obj=new Outer();
	 
	 Outer.Inner obj1 = obj.new Inner(); //syntax for obj- inner class [Member class]
	 
	// Outer.Inner obj2= new Outer.Inner(); //syntax for [Static class] no need obj name
	 
			
			
			 obj1.display();
	 
}
}
