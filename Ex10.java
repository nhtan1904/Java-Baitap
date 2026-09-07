
package VoLamNhatTan_7374.Lec07_String;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter word to censor: ");
        String word = sc.nextLine();

        String stars = "*".repeat(word.length());
        String censored = sentence.replace(word, stars);

        System.out.println("Censored: " + censored);

        sc.close();
    }
}
