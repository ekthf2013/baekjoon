//import java.util.Arrays;
//import java.util.Scanner;
//
//public class num_6550 {
//    public static void main(String args[]) {
//        Scanner scanner = new Scanner(System.in);
//
//        String word = scanner.next();
//        char[] s = word.toCharArray(); //문자열을 배열에 한 글자 씩 저장
//        String word2 = scanner.next();
//        char[] t = word2.toCharArray(); //문자열을 배열에 한 글자 씩 저장
//        char[] answer = new char[word.length()];
//        int k= 0;
//        for (int i = 0; i < word2.length(); i++) { //t의 길이만큼 반복
//            for (int j = 0; j < word.length(); j++) { //s의 길이만큼 반복
//                answer[j] = t[i+j];
//                if ( answer[j] == s[j])
//                    System.out.println("Yes");
//
//            }
//        }
//
//    }
//}

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class num_6550 {
//    public static void main(String[] args) throws Exception {
//        String str;
//        int count = 0;
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//
//        while((str = br.readLine()) != null) {
//            st = new StringTokenizer(str);
//
//            String s = st.nextToken();
//            String t = st.nextToken();
//
//            for (int i = 0; i < t.length(); i++) {
//                if (s.charAt(count) == t.charAt(i))
//                    count++;
//                if (count == s.length())
//                    break;
//            }
//            if (count == s.length())
//                System.out.println("Yes");
//            else
//                System.out.println("No");
//        }
//    }
//}

import java.util.Scanner;

public class num_6550 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next(); //문자열 s
        String t = scanner.next(); //문자열 t

        int count = 0;

        for(int i = 0; i<t.length(); i++){
            if(s.charAt(count)==t.charAt(i)) //문자 하나씩 비교
                count++;
            if(count == s.length()) {
                System.out.println("Yes");
                break;
            }
        }

        if(count != s.length())
            System.out.println("No");
    }
}