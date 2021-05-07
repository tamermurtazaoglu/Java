package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		String[] credits = {
			"A", "B", "C", "D"	
		};
		
		for(String credit : credits)
		{
			System.out.println(credit);
		}
		
		for(int i = 0; i < credits.length; i++)
		{
			System.out.println(credits[i]);
		}
	}

} 
