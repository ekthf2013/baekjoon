import java.util.Scanner;
public class num_2562 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[9];
        int num = 0;
        int max = 0;
        for(int i = 0; i < 9 ; i++){
            arr[i] = scanner.nextInt();
            if (max < arr[i]) {
                num = 0;
                max = arr[i];
                num = i+1;
            }
        }
        System.out.println(max);
        System.out.println(num);
    }
}
