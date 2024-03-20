import java.util.HashMap;
import java.util.Map;

public class solve3 {
    public static void main(String[] args) {
        int [] nums = {3,3,3,2,2,4};

        System.out.println(solution(nums));
    }

    public static int solution(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums) {
            map.put(i,0); //중복 없이 들어감. 새로운 값으로 대치
        }

        int checkSize = nums.length / 2;
            //중복없이 들어간 맵의 사이즈가 /2한 값보다 작으면 다 가져갈 수 있다.
        if(map.size() <= checkSize) {
            return map.size();
        } else{
            return checkSize;
        }
    }
}

