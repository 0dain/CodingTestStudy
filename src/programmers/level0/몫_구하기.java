package programmers.level0;

public class 몫_구하기 {
    public static void main(String[] args) {
        //문제 설명
        //정수 num1, num2가 매개변수로 주어질 때,
        //num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.

        //제한사항
        //0 < num1 ≤ 100
        //0 < num2 ≤ 100

        //입출력 예
        //num1	num2	result
        //10	5	    2
        //7	    2	    3

    }

    public static int solution(int num1, int num2) {
        int answer = num1/num2;
        return answer;
    }

}
