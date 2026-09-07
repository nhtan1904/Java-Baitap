
package VoLamNhatTan_7374.Lec07_String;

public class Ex3 {
    public static void main(String[] args) {

        String first = "Duy";
        String second = "Tan";
        String university = "University";

        String result1 = first + " " + second + " " + university;
        System.out.println("Using +: " + result1);

        String result2 = first.concat(" ")
                              .concat(second)
                              .concat(" ")
                              .concat(university);
        System.out.println("Using concat: " + result2);

        String firstAfterConcat = first.concat(" Tan");

        System.out.println("first after concat without reassignment: " + first);
    }
}
