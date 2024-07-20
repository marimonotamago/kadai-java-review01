
public class Triangle {

    public static void main(String[] args) {
        // 三角形の各辺の長さをa,b,c
        //　代入する数値は自由に変更可能
        int a = 6;
        int b = 6;
        int c = 8;
        
        if (a == b && b == c ) {
            System.out.println("正三角形");
        } else if (a == b || b == c || a == c) {
            System.out.println("二等辺三角形");
        } else {
            System.out.println("不等辺三角形");
        }

    }

}
