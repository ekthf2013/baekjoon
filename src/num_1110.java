import java.util.Scanner;
public class num_1110 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[2];
        int arr2[] = new int[2];
        int M = 0;
        int num = 0; // 사이클 횟수

        if(N < 10)
            N *= 10;
        int a = N;
        while(true){
            arr[0] = N / 10;
            arr[1] = N % 10;
            M = arr[0]+arr[1];
            if(M < 10)
                arr2[1] = M;
            else {
                arr2[0] = M / 10;
                arr2[1] = M % 10;
            }
            N = arr[1]*10 + M % 10;
            num++;
            if(a == N)
                break;
        }
        System.out.println(num);
    }
}

