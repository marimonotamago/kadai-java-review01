
public class Review01 {

    public static void main(String[] args) {
        //商品価格
        int kakaku = 1500;
        double zeiritu = 0.1;
        //税額は戻り値で、整数値のためint型
        int zeigaku = tax(kakaku, zeiritu);

        int zeikomi = kakaku + zeigaku;
        System.out.println(kakaku + "円の商品の税込み価格は" + zeikomi + "円（消費税は" + zeigaku +"円）です。");

    }
    public static int tax(int kakaku, double zeiritu ) {
        //税込み価格＝商品価格+消費税となる計算の内、税額を戻り値とする
        //小数点以下を切り捨てのint型にしたい　消費税10％
        double zeigaku2 = kakaku * zeiritu;

        return (int)zeigaku2;
    }
}
