package programmers.level0;

public class 문자열_뒤집기 {
    public static void main(String[] args) {
        //문제 설명
        //문자열 my_string이 매개변수로 주어집니다.
        // my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.

        //제한사항
        //1 ≤ my_string의 길이 ≤ 1,000

        //입출력 예
        //my_string	    return
        //"jaron"	    "noraj"
        //"bread"	    "daerb"


        System.out.println(solution("jaron"));

    }


    public static String solution(String my_string) {
        int strCnt = my_string.length();

        String answer = "";

        for(int i = 0; i<strCnt; i++){
         answer += my_string.charAt(my_string.length()-i-1);
        }

        /* ↙ 정답 맞춰버렸죠 ? */
        return answer;
    }

}












//        for(int i=0;i<my_string.length();i++){
//          answer+=my_string.charAt(my_string.length()-i-1);
//        }