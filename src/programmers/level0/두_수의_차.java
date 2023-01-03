package programmers.level0;

public class 두_수의_차 {
    public static void main(String[] args) {
        //문제 설명
        //정수 num1과 num2가 주어질 때,
        // num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.

        //제한사항
        //-50000 ≤ num1 ≤ 50000
        //-50000 ≤ num2 ≤ 50000

        //num1	num2	result
        //  2	 3	    -1
        //  100	 2	    98

        System.out.println(solution(2, 3));

    }

    public static int solution(int num1, int num2) {
        int answer = num1-num2;
        return answer;
    }

}
