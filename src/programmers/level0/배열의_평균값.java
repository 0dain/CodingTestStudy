package programmers.level0;

public class 배열의_평균값 {
    public static void main(String[] args) {
        //문제 설명
        //정수 배열 numbers가 매개변수로 주어집니다.
        //numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.

        //제한사항
        //0 ≤ numbers의 원소 ≤ 1,000
        //1 ≤ numbers의 길이 ≤ 100
        //정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.

        //입출력 예
        //numbers	                                    result
        //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]	            5.5
        //[89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99]	94.0

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};

        System.out.println(solution(arr2));

    }

    public static double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        for (int i=0; i<numbers.length; i++){
            System.out.println("for문 돌아가는지 확인"+numbers[i]);

            sum += numbers[i];
        }
        answer = (double) sum/numbers.length;

        return answer;
    }
}
