public class D51Q26Kadai {
    public static void main(String[] args) {
        int n = 1;
        String s = "";

        // switch文は、変数nの値に基づいて実行する処理を分ける
        switch (n) {
            case 1:
                s += "one";  // nが1のとき"one"を追加

                // breakを使わないと次のcaseにも処理が流れる（fall-through現象が起こる）
                break;

            case 2:
                s += "two";  // nが2のとき"two"を追加
                break;

            default:
                s += "?";    // nがどのcaseにも当てはまらないとき"?"を追加
        }

        System.out.println(s); // 結果を出力 → "one"
    }
}
