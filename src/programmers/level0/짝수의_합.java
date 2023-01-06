package programmers.level0;

public class 짝수의_합 {
    public static void main(String[] args) {

        //문제 설명
        //정수 n이 주어질 때,
        //n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.

        //제한사항
        //0 < n ≤ 1000

        //입출력 예
        //n 	result
        //10	30
        //4	    6

        System.out.println(10);

    }

    public static int solution(int n) {
        int answer = 0;

        //n이하의 짝수를 모두 더하기(누적합)
        //n을 2로 나눴을 때 나머지가 0이면 짝수
        for (int i=n; i<=n;i--){
            if(i%2==0){
                answer+=i;
            }
        }

        return answer;
    }


}
