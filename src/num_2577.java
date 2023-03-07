import java.util.Scanner;
public class num_2577 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int num = A*B*C;
        int num2 = 0;
        int arr[] = new int[] {0,0,0,0,0,0,0,0,0,0};
        while (num > 0) {
            num2 = num % 10;
            for(int i = 0; i < 10; i++) {
                if (num2 == i)
                    arr[i]++;
            }
            num = num / 10;
        }
        for(int i = 0; i < 10; i++)
            System.out.println(arr[i]);
    }
}
