import programmers.Programmer1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("세균증식");
        Programmer1 programmer1 = new Programmer1();
        System.out.println( programmer1.solution(7, 15));

        System.out.println();

        System.out.println("제곱근");
        Programmer1 programmer11 = new Programmer1();
        System.out.println(programmer11.square(500));

        System.out.println();

        System.out.println("문자열 포함");
        Programmer1 programmer12 = new Programmer1();
        System.out.println(programmer12.contain("ab6CDE443fgh22iJKlmn1o", "6CD"));

    }
}