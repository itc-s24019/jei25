public class D51Q21kadai {

    public static void main(String[] args) {
        // 2つの異なる奇数を定義
        int odd1 = 7;
        int odd2 = 3;

        // 奇数であることの確認（念のため）
        if (odd1 % 2 == 0 || odd2 % 2 == 0 || odd1 == odd2) {
            System.out.println("2つの数は異なる奇数である必要があります。");
            return;
        }

        // 加算（2つの奇数を足す）
        int sum = odd1 + odd2;
        System.out.println(odd1 + " + " + odd2 + " = " + sum + " （ + ）");

        // 減算（大きい方から小さい方を引く）
        int diff = odd1 - odd2;
        System.out.println(odd1 + " - " + odd2 + " = " + diff + " （ - ）");

        // 乗算（2つの奇数を掛け算する）
        int product = odd1 * odd2;
        System.out.println(odd1 + " × " + odd2 + " = " + product + " （ * ）");

        // 除算（割り切れない場合は小数になるので結果はdouble型で表示）
        double division = (double) odd1 / odd2;
        System.out.println(odd1 + " ÷ " + odd2 + " = " + division + " （ / ）");
    }
}
