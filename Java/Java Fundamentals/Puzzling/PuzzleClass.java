import java.util.ArrayList;
import java.util.Random;

public class PuzzleClass {

public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> rolls = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            rolls.add(rand.nextInt(20) + 1); 
        }
        return rolls;
    }

    public char getRandomLetter() {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Random rand = new Random();
        int index = rand.nextInt(26); 
        return alphabet[index];
    }

    public String generatePassword() {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            password.append(getRandomLetter());
        }
        return password.toString();
    }

    public String[] getNewPasswordSet(int length) {
        String[] passwordSet = new String[length];
        for (int i = 0; i < length; i++) {
            passwordSet[i] = generatePassword();
        }
        return passwordSet;
    }
}