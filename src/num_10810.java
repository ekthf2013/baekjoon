import java.util.Scanner;

public class num_10810 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); //바구니의 개수
        int M = scanner.nextInt(); //공을 넣는 횟수
        int ball[] = new int[N]; //바구니 배열

        for(int i = 0; i<M; i++){ //횟수만큼 반복
            int[] play = new int[3];
            play[0] = scanner.nextInt(); //몇 번 부터
            play[1] = scanner.nextInt(); //몇 번 까지
            play[2] = scanner.nextInt(); //몇 번 공을 넣을 것인지
            for (int j = 0; j<N; j++){ //바구니에 공을 넣는 행위
                if(play[0] <= (j+1) && (j+1) <= play[1]) {
                    ball[j] = play[2];
                }
                else continue;
            }
        }
        for(int i = 0; i<N; i++) {
            System.out.println(ball[i]);
        }

    }
}
