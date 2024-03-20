import java.util.Arrays;

public class solve4 {
    public static void main(String[] args) {
        String [] arr1 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String [] arr2 = {"marina", "josipa", "nikola", "vinko"};

        System.out.println(solution(arr1, arr2));
    }
    public static String solution(String[] participant, String[] completion) {
            String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i=0; i<completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[participant.length-1];
    }
}

