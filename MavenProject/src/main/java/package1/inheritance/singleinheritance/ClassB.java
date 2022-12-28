package package1.inheritance.singleinheritance;

public class ClassB extends ClassA {
	public void printA()
	{
		System.out.println("everywhere");
	}
	public static void main(String args[])
	{
		ClassB obj=new ClassB();
		obj.print();
		obj.printA();
	}
}
