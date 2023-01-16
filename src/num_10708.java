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

























//
//import java.util.Scanner;
//
//public class Main { //10708 : 크리스마스 파티(bronze2)
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt(); // 친구 수
//        int m = s.nextInt(); // 게임 횟수
//        int[] a = new int[m]; //라운드별 타겟 지정
//        int[][] b = new int[m][n]; //라운드 별 각각의 정수 입력
//        int target = 0; //타겟
//        int[] c = new int[n]; //라운드별로 점수 출력 용도
//        for(int i = 0; i < m; i++)
//        {
//            a[i] = s.nextInt(); //i라운드별 타겟 입력
//        }
//        for(int i = 0; i < m; i++)
//        {
//            target = a[i]; //i 라운드 타겟 : a[i]
//            for(int j = 0; j < n; j++)
//            {
//                b[i][j] = s.nextInt(); // i라운드 중 각각 정수 입력
//                if(b[i][j] == target) // 타겟을 맞추면 +1
//                    c[j] +=1;
//                else if (b[i][j] != target)
//                {
//                    c[target-1] +=1; // 타겟이 1인 경우, 인덱스 값은 0이므로 target = 1
//                }
//            }
//        }
//        for(int i = 0; i < n; i++)
//            System.out.println(c[i]);
//    }
//}
//[출처] [백준] 10708 - 크리스마스 파티|작성자 job e


