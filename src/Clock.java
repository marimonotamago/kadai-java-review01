
public class Clock {

    public static void main(String[] args) {
        //時・分・秒を秒で統一して加算していく
        int hour = 1;
        int minute  = 1;
        int second = 1;
        int result;
        result = getSeconds(hour, minute, second);
        System.out.println(result + "秒");


    }
    public static int getSeconds(int hour, int minute, int second) {
        //3600*hour(時間)を計算する
        hour = 3600*hour;

        //60*b(分)を計算する
        minute = 60*minute;

        //c(秒)を計算する
        second = 1*second;

        //int型resultを宣言しa+b+cで秒単位に直したすべての値を加算する
        int result = hour + minute + second;

        return result;
    }

}
