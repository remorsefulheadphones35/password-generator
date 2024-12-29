import java.util.Scanner; 
import java.util.Random; 

public class passwordgenerator {
	
	public static void main(String[] args) {
		
		Random rng = new Random();
		Scanner scan = new Scanner(System.in); 
		
		String[] characters = {"!",",","$",",","%","^","d","@","s","J","K","2","1","*",
				"M","}","]","~","=","r","-","E","7","z","F",".","&","q","4","<",">","A",
				"a","/","[","|","3","X","+","(","G","I","l","o","U","V","t","Y","9","p",
				"#","e","x","H",":","O","0","C","b","?","}","n","`","_","v","6","N","T",
				"!","h","P","8","L","Q","k","*","w","5","i"}; 
		String password = ""; 
		boolean startProgram = true; 
		
		System.out.println("Password Generator");
		while(startProgram == true) {
			System.out.print("Enter the length of the password: "); 
			int passwordLength = scan.nextInt();
			for(int i = 1; i <= passwordLength; i++) {
				int randNumber = rng.nextInt(79);
				password = password + characters[randNumber]; 
			}
			System.out.println(password); 
			System.out.println("Generate another password (Y/N)"); 
			String continueProgram = scan.next(); 
			if(continueProgram.equalsIgnoreCase("Y")) {
				startProgram = true;
				password = ""; 
				System.out.println(); 
			}
			if(continueProgram.equalsIgnoreCase("N")) {
				System.out.println("Program terminated!"); 
				startProgram = false;
				scan.close(); 
			}
		}
			

	}

}
