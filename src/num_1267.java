import java.util.Scanner;

//class Phone{
//    private int time;
//    Phone(int time){
//        this.time = time;
//    }
//    public int getTime() {return time;}
//}
//public class num_1267 {
//    Scanner scanner = new Scanner(System.in);
//    Phone phonetime[];
//    String name;
//    int Y_money = 0 , M_money = 0, print_time = 0;
//
//    void create(){
//        System.out.print("통화 횟수를 입력하시오. (20보다 작거나 같은 자연수)");
//        int n = scanner.nextInt(); //동호가 저번달에 사용한 통화 횟수
//        phonetime = new Phone[n];
//    }
//    void set(){
//        System.out.print("통화 시간을 입력하시오. (10,000보다 작거나 같은 자연수)");
//        int time = scanner.nextInt();
//        for(int i = 0; i<phonetime.length; i++){
//            phonetime[i] = new Phone(time); //phonetime에 배열로 시간 입력
//        }
//    }
//    void Y(){ //영식 요금제
//        for(int i = 0; i< phonetime.length; i++){
//            int n = 0;
//            n = phonetime[i].getTime()/30;
//            Y_money += (n+1) * 10;
//            System.out.println("영식>>" + Y_money);
//        }
//    }
//    void M(){ //민식 요금제
//        for(int i = 0; i< phonetime.length; i++){
//            int n = 0;
//            n = phonetime[i].getTime()/60;
//            M_money += (n+1) * 15;
//            System.out.println("민식>>" + M_money);
//
//        }
//    }
//    void run(){
//        Y();
//        M();
//        if(Y_money<M_money){
//            name = "Y";
//            print_time = Y_money;
//        } else if (Y_money>M_money) {
//            name = "M";
//            print_time = M_money;
//        } else {
//          name = "Y M";
//          print_time = Y_money;
//        }
//        System.out.println(name + " " + print_time);
//    }
//    public static void main(String args[]){
//        num_1267 a = new num_1267();
//        a.create();
//        a.set();
//        a.run();
//    }
//}

public class num_1267{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); //횟수
        int Y_money = 0;
        int M_money = 0;

        for(int i = 0; i<num; i++){
            int time = scanner.nextInt();
            int Y_time = time/30;
            int M_time = time/60;
            Y_money += (Y_time+1) * 10;
            M_money += (M_time+1) * 15;
        }
        if(Y_money>M_money) System.out.println("M " + M_money);
        else if(Y_money<M_money) System.out.println("Y " + Y_money);
        else System.out.println("Y M " + Y_money);
    }
}
