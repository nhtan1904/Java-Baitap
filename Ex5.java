
package VoLamNhatTan_7374.Lec07_String;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        boolean starts = fileName.startsWith("report");
        boolean ends = fileName.endsWith(".pdf");

        char first = fileName.charAt(0);
        char last = fileName.charAt(fileName.length() - 1);

        System.out.println("Starts with report: " + starts);
        System.out.println("Ends with .pdf: " + ends);
        System.out.println("First character = " + first);
        System.out.println("Last character = " + last);
    }
}
