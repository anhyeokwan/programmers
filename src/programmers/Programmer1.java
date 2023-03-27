package programmers;

public class Programmer1 {

    // 어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
    // 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.
    public int solution(int n, int t) {

        for (int i = 0; i < t; i++) {
            n *= 2;
        }
        ;

        return n;
    }

    //어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다.
    // 정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.
    public int square(int n) {

        int answer = 0;
        double pow = Math.sqrt(n);
        String format = String.format("%.2f", pow);
        int idx = format.indexOf(".") + 1;
        char ch = format.charAt(idx);

        if (ch == '0') {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;
    }

    //문자열 str1, str2가 매개변수로 주어집니다.
    // str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.
    public int contain(String str1, String str2) {
        int answer = 0;

        if (str1.contains(str2)) {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;
    }

    //덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다.
    // 수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.
    public String[] quiz(String[] quiz) {
        String[] answer = {};


        return answer;
    }
}
