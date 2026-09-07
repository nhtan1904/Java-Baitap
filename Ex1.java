
package VoLamNhatTan_7374.Lec07_String;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line: ");
        String original = sc.nextLine();

        String trimmed = original.trim();
        System.out.println("Original: [" + original + "]");
        System.out.println("Trimmed: [" + trimmed + "]");
        System.out.println("Upper:   " + trimmed.toUpperCase());
        System.out.println("Lower:   " + trimmed.toLowerCase());
        System.out.println("Original length = " + original.length());
        System.out.println("Length after trim = " + trimmed.length());

        sc.close();
    }
}
