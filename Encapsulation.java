package day11;

//created class;
public class Encapsulation {
	// to inside private value and data type;

	private String name;
	private int age;
	private long phoneno;
	private double salary;
	private double dateofbirth;

	// create get value;

	public String getName() {
		return name;
	}

	// create set value;
	public void setName(String peru) {
		this.name = peru;
	}

	public int getage() {
		return age;
	}

	public void setage(int ag)

	{
		this.age = ag;
		if (age > 0)

		{

		}
	}
	// use get;
	public long getphone()
	{//return value ;
		return phoneno;
	}
	// use set;
	
	public void setphone(long number)
	
	{
	this.phoneno=number;
	}
	
	public double getsalary()
	
	{
		return salary;
	}
	public void setsal(double kasu)
	
	{
		this.salary=kasu;
	}
	
	public double getdate()
	
	{
		return dateofbirth;
	}
	
	public void setdate(double porendhanaal)
	{
		this.dateofbirth=porendhanaal;
	}
	
	public static void main(String[] args) {
		// object create ;
	Encapsulation person =new Encapsulation();
	
	person.name="surya";
	person.dateofbirth=23.062004;
	person.age=21;
	person.salary=50000;
	person.phoneno=8807689378l;
	
	
	System.out.println("your name is :"+person.name);
	System.out.println("your date of birt is  : "+ person.dateofbirth);
	System.out.println("your age is  :"+person.age);
	System.out.println("your phone number is  : "+person.phoneno);
	System.out.println("your salary is  :"+person.salary);
	}

}
