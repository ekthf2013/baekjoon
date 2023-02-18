import java.util.Scanner;

public class num_2490 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[4];
        int sum;
        for(int i = 0; i<3; i++){
            sum = 0;
            for(int j = 0; j<4; j++){
                arr[j] = scanner.nextInt();
                sum += arr[j];
            }
            if(sum == 0)
                System.out.println("D"); //윷
            else if(sum == 1)
                System.out.println("C"); //걸
            else if(sum == 2)
                System.out.println("B");
            else if (sum == 3)
                System.out.println("A");
            else System.out.println("E");
        }
    }
}
