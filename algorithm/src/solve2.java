public class solve2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hehe";

        System.out.println(solution(str1, str2));
    }
    public static int solution(String my_string, String is_prefix) {
        int answer = 1;

        //is_prefix만큼 반복을 돌며 해당 인덱스 값이 같은지 확인한다.
        if(my_string.length() < is_prefix.length()) {
            return 0;
        }


        for(int i = 0; i < my_string.length(); i++){
            if(is_prefix.length() <= i) {
                break;
            }

            if(my_string.charAt(i) != (is_prefix.charAt(i))){
                return 0;
            }
        }
        return answer;
    }
}
