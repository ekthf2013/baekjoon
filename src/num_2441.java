import java.util.Scanner;

public class num_2441 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i = 0; i < num; i++){
            int a = num-i;
            for(int k = 0; k<i; k++)
                System.out.print(" ");
            for(int j = 0; j<a; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
