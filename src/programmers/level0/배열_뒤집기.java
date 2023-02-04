package programmers.level0;

public class 배열_뒤집기 {
    public static void main(String[] args) {

        //문제 설명
        //정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
        // num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.

        //제한사항
        //1 ≤ num_list의 길이 ≤ 1,000
        //0 ≤ num_list의 원소 ≤ 1,000

        //입출력 예
        //num_list	            result
        //[1, 2, 3, 4, 5]	    [5, 4, 3, 2, 1]
        //[1, 1, 1, 1, 1, 2]	[2, 1, 1, 1, 1, 1]
        //[1, 0, 1, 1, 1, 3, 5]	[5, 3, 1, 1, 1, 0, 1]

        int[] num_list = {1, 2, 3, 4, 5};
        int[] num_list2 = {1, 1, 1, 1, 1, 2};
        int[] num_list3 = {1, 0, 1, 1, 1, 3, 5};

        System.out.println(solution(num_list)[0]);
//        System.out.println(solution(num_list2)[0]);
//        System.out.println(solution(num_list3)[0]);

    }

    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int cnt=num_list.length-1;
        System.out.println("cnt인덱스"+cnt);

        for(int i=0; i<num_list.length; i++){
            System.out.println("넘버"+num_list[cnt]);
            answer[i]=num_list[cnt];
            System.out.println("대답"+answer[i]);
            cnt--;
        }

        return answer;
    }

}
