
public class SevenNumber {

    public static void main(String[] args) {
        // 1から100までの数値を順番に出力
        for(int i = 1; i <= 100; i++ ) {
            if(i % 7 == 0 || i % 10 == 7 || i / 10 == 7 ) {
                System.out.println("Clap!");
            }else {
                //iの値を表示
                System.out.println("i = " + i ); 
            }
           
        }

    }

}
