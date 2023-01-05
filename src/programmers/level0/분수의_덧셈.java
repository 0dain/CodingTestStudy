package programmers.level0;

public class 분수의_덧셈 {
    public static void main(String[] args) {

        //문제 설명
        //첫 번째 분수의 분자와 분모를 뜻하는 denum1, num1, 두 번째 분수의 분자와 분모를 뜻하는 denum2, num2가 매개변수로 주어집니다.
        //두 분수를 더한 값을 기약 분수로 나타냈을 때
        //분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

        //제한사항
        //0 <denum1, num1, denum2, num2 < 1,000

        //입출력 예
        //denum1	num1	denum2	num2	result
        //1	        2	    3	    4	    [5, 4]
        //9	        2	    1	    3	    [29, 6]


    }

    //상민씨가 도와준 거
    public static int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        int max = 0;
        for(int i=1;i<=(denum1*num2+denum2*num1);i++){
            if(((denum1*num2)+denum2*num1)%i==0){
                if((num1*num2)%i==0){
                    max=i;
                }
            }
        }
        answer[0]=(denum1*num2+denum2*num1)/max;
        answer[1]=num1*num2/max;

        return answer;
    }

    //형주씨가 도와준 거
    public static int[] solution2(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        int denominator; // 분자
        int numerator; // 분모

        denominator = denum1 * num2 + num1 * denum2;
        numerator = num1 * num2;

        int min = Math.min(denominator, numerator);
        int max = 1;
        for (int i = 1; i <= min; i++) {
            if (denominator % i == 0 && numerator % i == 0) {
                max = i;
            }
        }
        denominator /= max;
        numerator /= max;

        answer[0]=denominator;
        answer[1]=numerator;

        return answer;
    }


}
