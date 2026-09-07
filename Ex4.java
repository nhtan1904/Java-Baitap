
package VoLamNhatTan_7374.Lec07_String;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student ID, for example SE123456: ");
        String studentID = sc.nextLine();

        String majorCode = studentID.substring(0, 2);

        String numericPart = studentID.substring(2);

        System.out.println("Major code = " + majorCode);
        System.out.println("Numeric part = " + numericPart);

        sc.close();
    }
}

