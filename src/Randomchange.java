import java.util.Random;
public class Randomchange {

	public static void main(String[] args) {
		
		
		 output("Generate 10 random integers between 5 and 95");

		        Random rnd = new Random();
		        
		        for (int i = 1; i <= 10; ++i)
		        {
		          int randomInt = 1 + rnd.nextInt(95-5);
		          System.out.println("Generated number: " + randomInt);
		        }
		    
		        System.out.println("Done.");
		    }

	private static void output(String string) {
			
	}
		}