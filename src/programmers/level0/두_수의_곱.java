package programmers.level0;

public class 두_수의_곱 {
    public static void main(String[] args) {
        //문제 설명
        //정수 num1, num2가 매개변수 주어집니다.
        //num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.

        //제한사항
        //0 ≤ num1 ≤ 100
        //0 ≤ num2 ≤ 100

        //입출력 예
        //num1	num2	result
        //3	    4	    12
        //27	19	    513
        System.out.println(solution(3,4));

    }

    public static int solution(int num1, int num2) {
        int answer = num1*num2;
        return answer;
    }
}
