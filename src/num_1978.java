//소수 찾기
import java.util.Scanner;

public class num_1978 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); //개수
        int arr[] = new int[N];
        int count = 0; //소수의 개수를 세는 변수

        for (int i = 0; i< arr.length; i++) {
            arr[i] = scanner.nextInt(); //배열에 입력한 숫자 값을 받음
        }

        for (int i = 0; i<arr.length; i++){
            if(arr[i]==1){
                count++;
            }
            for(int j = 2; j < arr[i]; j++){
                if(arr[i] % j == 0) { //나누어 떨어진다는 것은 소수는 아님
                    count++;
                    break;
                }
            }
        }
        System.out.println(N-count);
    }
}
