import programmers.Programmer1;

import java.util.Arrays;

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

        System.out.println();

        System.out.println("사칙연산");
        Programmer1 programmer13 = new Programmer1();
        System.out.println(Arrays.toString(programmer13.quiz(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"})));

        System.out.println();

        System.out.println("자릿수 더하기");
        Programmer1 programmer14 = new Programmer1();
        System.out.println(programmer14.placeSuM(1234));

        System.out.println();

        System.out.println("배수 구하기");
        Programmer1 programmer15 = new Programmer1();
        System.out.println(Arrays.toString(programmer15.multiple(5, new int[]{1, 9, 3, 10, 13, 5})));
    }
}