package ifsum;
//multilevel inheritance;
interface  engine{
	
}
interface musicplay{
	
}

//parent class;

class vehicale{
	
	void fuelup()
	{
		System.out.println("vechicle diseal is full ");
	}
	}
//child class if u call parent class and interfaces because java cannot access multiple classes so u use interface
class car extends vehicale implements engine,musicplay{
	
	void engine()
	{
		System.out.println("Engine is started  ");
	}
	void musicplay()
	{
		
		System.out.println("music is playing ");
	}
	
	
}


public class multilevel {
	public static void main(String[] args) {
		
		
		// create obj to child class;
		
		car obj=new car();
		
		{
			obj.fuelup();
			obj.engine();
			obj.musicplay();
			
		}
		
	}
	
	
	

}
