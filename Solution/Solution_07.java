/*Write a program which accepts starting character and ending character. Display one by one 
character from starting character till the ending character at the interval of one second using 
thread.*/
import java.util.Scanner;

public class Solution_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting character: ");
        char startChar = scanner.nextLine().charAt(0);

        System.out.print("Enter the ending character: ");
        char endChar = scanner.nextLine().charAt(0);

        CharacterDisplayThread thread = new CharacterDisplayThread(startChar, endChar);
        thread.start();
    }
}

class CharacterDisplayThread extends Thread {
    private char startChar;
    private char endChar;
    public CharacterDisplayThread(char startChar, char endChar) {
        this.startChar = startChar;
        this.endChar = endChar;
    }
    public void run() {
        for (char ch = startChar; ch <= endChar; ch++) {
            System.out.print(ch);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
