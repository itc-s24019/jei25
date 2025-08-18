// D53Q5kadai.java
public class D53Q5kadai {
    // 税率 (8%, 10%)
    private static int[] taxes = {8, 10};
    // taxes配列のインデックス定数
    private static int FOODS = 0; // 食品等
    private static int OTHER = 1; // その他

    public static void main(String[] args) {
        // (28) 最初の引数から商品データ数を取得
        int dataSize = Integer.parseInt(args[0]);

        // 各データを格納する配列を初期化
        String[] names = new String[dataSize]; // 商品名
        int[] prices = new int[dataSize];      // 単価
        int[] nums = new int[dataSize];        // 数量
        char[] types = new char[dataSize];     // タイプ (f: 食品等, o: その他)

        // 引数リストの読み取り開始位置
        int argsIdx = 1;
        // (29) ループで引数を配列に格納
        for (int i = 0; i < dataSize; i++) {
            // (30) インデックスを1つずつ進めながらデータを読み込む
            names[i] = args[argsIdx++];
            prices[i] = Integer.parseInt(args[argsIdx++]);
            nums[i] = Integer.parseInt(args[argsIdx++]);
            types[i] = args[argsIdx++].charAt(0);
        }

        // ヘッダーを出力
        System.out.println("商品名\t\t税抜\t\t税込\t\tタイプ");

        // 合計金額を計算するための変数を初期化
        int totalZeinuki = 0;
        int totalZeikomi = 0;

        // (29) ループで各商品の価格を計算・出力
        for (int i = 0; i < dataSize; i++) {
            // 税抜価格を計算
            int zeinuki = prices[i] * nums[i];

            // タイプに応じて適用する税率を決定
            int taxType = (types[i] == 'f') ? FOODS : OTHER;

            // (31) 税抜価格と税率から税込価格を計算 (消費税額の端数は切り捨て)
            int taxAmount = (int)(zeinuki * taxes[taxType] / 100.0);
            int zeikomi = zeinuki + taxAmount;

            // 合計金額に加算
            totalZeinuki += zeinuki;
            totalZeikomi += zeikomi;

            // 商品ごとの情報を出力
            System.out.print(names[i] + "\t\t" + zeinuki + "円\t\t");
            System.out.println(zeikomi + "円\t\t" + viewType(types[i]));
        }

        // 最後に合計金額の行を出力
        System.out.println("合計\t\t" + totalZeinuki + "円\t\t" + totalZeikomi + "円");
    }

    /**
     * タイプを表す文字 ('f' または 'o') を対応する文字列に変換するメソッド
     * @param c タイプの文字
     * @return "食品等" または "その他"
     */
    private static String viewType(char c) {
        // (32) 三項演算子で分岐
        return (c == 'f') ? "食品等" : "その他";
    }
}