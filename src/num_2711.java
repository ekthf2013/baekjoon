import java.util.Scanner;

public class num_2711 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt(); //케이스의 횟수
        for (int i = 0; i<time; i++){
            int a = scanner.nextInt(); //오타가 난 위치
            String word = scanner.next(); //문자열 받기
            char answer2[] = new char[word.length()-1]; //초기화
            char[] answer = word.toCharArray(); //문자열을 배열에 한 글자 씩 저장
            for(int j = 0; j<word.length()-1; j++) {//문자열의 길이만큼 반복
                if(a-1 <= j){ // 틀린 위치와 순서가 같을 때
                    answer2[j] = answer[j+1];
                }
                else answer2[j] = answer[j];
            }
            System.out.println(answer2);
        }
    }
}
