import java.util.ArrayList;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println("Random Rolls: " +randomRolls);
		
        System.out.println("Random Letter: " + generator.getRandomLetter());
        
        System.out.println("Generated Password: " + generator.generatePassword());
        
        int passwordSetLength = 5; 
        String[] newPasswordSet = generator.getNewPasswordSet(passwordSetLength);
        System.out.println("New Password Set:");
        for (String password : newPasswordSet) {
            System.out.println(password);
        }
	}
}