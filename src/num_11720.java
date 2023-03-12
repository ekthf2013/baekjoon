import java.util.Scanner;
public class num_11720 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String a = scanner.next();
        String num[];
        int arr[] = new int[N];
        int sum = 0;
        num = a.split("");
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(num[i]);
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
