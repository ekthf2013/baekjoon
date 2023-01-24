import java.util.Scanner;
public class num_1159 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 선수의 수
        int a = 0;
        char[] arr = new char[N];
        int[] ch = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //26개
        char al;
        int count = 0;
        for(int i = 0; i<N; i++) {
            al = 'a';
            String name = scanner.next();
            arr[i] = name.charAt(0); //배열에 첫글자 입력
            for(int j = 0; j<26; j++){
                if(arr[i]==al)
                    ch[j] += 1;
                al++;
            }
        }
        for(int i = 0; i<26; i++){
            if(ch[i]>=5)
                count++;
        }
        char[] ans = new char[count];
        for(int i = 0; i<26; i++){
            if (ch[i] >= 5) {
                ans[a] = (char) (i + 97);
                a++;
            }
        }
        if(count==0)
            System.out.println("PREDAJA");
        else
            System.out.println(ans);
    }
}
