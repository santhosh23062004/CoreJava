package day9;

public class CharArray {
	public static void main(String[] args) {
		
	String s="WWE or World Wrestling Entertainment was originally founded by Jess McMahon in 1952. It was then known as the Capitol Wrestling Corporation (CWF). Upon his death, his second son, Vincent J. McMahon. inherited the business and renamed it as World Wide Wrestling Federation (WWWF) in 1963. His son Vincent K. McMahon assumed control in 1971. In March 1979, he renames the organization as the World Wrestling Federation (WWF). Vincent K. McMahon founded Titan Sports in 1980 and applied the trademark of the WWF. The company changed their name to World Wrestling Entertainment (WWE) after they lost a lawsuit brought by the World Wildlife Foundation over the initials of WWF in 2002. The name change became official on May 06, 2002.\r\n"
			;
	char[] let=s.toCharArray();
	int count=0;
	for(char dd:let)
	{
		if(dd=='i')
		{
			count++;
		}
	}
	System.out.println(count );
		
	
	}
}
