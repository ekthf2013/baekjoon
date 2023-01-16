import java.util.Scanner;

public class num_10708 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int friend = scanner.nextInt();
        int game_time = scanner.nextInt();
        int arr[][] = new int[game_time][friend]; //[친구 수][게임 횟수]
        int answer[] = new int[game_time]; //JOI가 고른 게임 횟수마다 타겟인 친구의 배열
        int score[] = new int[friend]; //점수 출력하는 함수

        for(int i = 0; i<arr.length; i++) { //i=3
            answer[i] = scanner.nextInt(); //배열에 타겟인 친구를 넣음 4번
        }
        for(int i = 0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = scanner.nextInt(); //친구들이 작성한 타겟일 것 같은 친구
                if(arr[i][j] == answer[i]) //작성한 쪽지와 타겟이 같다면
                    score[j] ++;
                else {
                    score[answer[i]-1] ++;
                }
            }
        }
        for(int i = 0; i<score.length; i++) {
            System.out.println(score[i]); //점수를 출력
        }
    }
}



