package day13;
// polymorphism concept is single reference name vachii neraya objectta values use pannalaam that is pholymorpism
//parent class
class shape{
	void draw()
	{
		System.out.println("Draw the shape");
	}
	
	
}
//child class1 or sub class1 u can do extend the parent class
class circle extends shape{
	void draw()
	{
		System.out.println(" I draw a circle");
	}
}
// this is child class2 or subclass2 u can do extends childclass1
class rectangle extends shape{
	void draw()
	{
		System.out.println("I draw a rectancle");
	}
	
}

public class polymorphism {
public static void main(String[] args) {
	
	
	// create obj same refrence name to all obj;
	
	shape s1=new shape();
	
	s1.draw();
	
	shape s2=new circle();
	s2.draw();
	shape s3=new rectangle();
	s3.draw();
	
}
}
