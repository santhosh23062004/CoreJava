package day9;

public class RepalceArray {
	public static void main(String[] args) {

		String[] ch = new String[5];

		ch[0] = "santhosh";
		ch[1] = "surya";
		ch[2] = "vijay";
		ch[3] = "kumar";
		ch[4] = "gowtham";   

		for (int i = 0; i < ch.length; i++) {
			if (ch[i].equals("vijay"))

			{
				ch[i] = "kanna";
			}

		}
		System.out.println("replace word\t\t");

		for (String rep : ch) {
			System.out.println(rep);
		}
	}
}
