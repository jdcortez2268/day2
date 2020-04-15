
public class CommandLineArgs {

	public static void main(String[] args) {
		
		int sum = 0;
		for (String str : args) {
			
			try {
				int i = Integer.parseInt(str);
				sum += i;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Please enter valid integers for command line arguments");
			}
		}
	System.out.println("Your total sum was: " + sum);
	
	
	}
}
