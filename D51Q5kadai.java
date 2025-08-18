// D51Q5kadai.java

public class D51Q5kadai {
    public static void main(String[] args) {
        // 各料金段階の上限値 (m^3)
        double[] level = {0.0, 24.0, 57.0, Double.MAX_VALUE};
        // 各料金段階の単位数 (m^3)
        double[] unit = {0.0, 2.0, 3.0, 5.0};
        // 各料金段階の従量料金単価 (円/単位数) ※1円ずつ値上げ
        int[] rate = {0, 20, 18, 15};

        // (28) 引数の個数が1でなければエラー
        if (args.length != 1) {
            System.out.println("引数の個数が不正");
            return;
        }

        // (29) コマンドライン引数をdouble型に変換
        double amount = Double.parseDouble(args[0]);

        // (30) 使用量が負の値ならエラー
        if (amount < 0.0) {
            System.out.println("0.0 以上の使用量を入力");
            return;
        }

        // (31) 料金の初期値として、値上げ後の基本料金を設定
        int price = 1300;
        int i; // forループの外で参照するため、ここで宣言

        // 使用量が含まれる範囲まで、各段階の料金を上限まで加算する
        for (i = 1; amount > level[i]; i++) {
            price += (int)(((level[i] - level[i - 1]) / unit[i]) * rate[i]);
        }

        // 使用量が含まれる最後の範囲（端数分）の料金を計算して加算
        // (32) Math.ceilを使用して単位数に変換し、単価を掛ける
        price += (int)(Math.ceil((amount - level[i - 1]) / unit[i]) * rate[i]);

        System.out.println("今月のガス料金 " + price + "円");
    }
}