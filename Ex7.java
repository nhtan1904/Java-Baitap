
package VoLamNhatTan_7374.Lec07_String;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        StringBuilder sb = new StringBuilder(original);
        String reversed = sb.reverse().toString();

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        sc.close();
    }
}
