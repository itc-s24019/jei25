/**
 * このファイルは D51Q6kadai.java です。
 * Drink2クラスとVendingMachine2クラスを含みます。
 */

// 実行用のメインクラス
public class D51Q6kadai {
    public static void main(String[] args) {

        VendingMachine2 vm = new VendingMachine2();


        String[] scenario = {
                "i 100",  // 100円
                "i 10",   // 10円
                "i 10",   // 10円
                "b 1",    // 1番の商品（コーラ）を購入
                "i 500",  // 500円
                "b 3",    // 3番の商品（水）を購入
                "b 3",    // 3番の商品（水）を再度購入（残高不足のはず）
                "r"       // おつりを返却
        };

        System.out.println("=== シナリオ実行開始 ===");


        for (String command : scenario) {
            vm.execCom(command);
        }

        System.out.println("=== シナリオ実行終了 ===");
    }
}


class Drink2 {
    private String name;
    private int price;


    public Drink2(String name, int price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return this.name;
    }


    public int getPrice() {
        return this.price;
    }
}


class VendingMachine2 {
    private Drink2[] drinks;
    private int total;

    // コンストラクタ
    public VendingMachine2() {
        // 販売する商品を初期化
        this.drinks = new Drink2[3];
        this.drinks[0] = new Drink2("コーラ", 120);
        this.drinks[1] = new Drink2("お茶", 130);
        this.drinks[2] = new Drink2("水", 100);

        this.total = 0; // 合計金額を0で初期化
    }


    public void execCom(String command) {
        System.out.println("> " + command);


        String[] parts = command.split(" ");
        String com = parts[0];


        if (com.equals("i")) {
            int money = Integer.parseInt(parts[1]);
            this.total += money;
            System.out.println("入金額: " + this.total + "円");
        } else if (com.equals("b")) {
            int drinkIndex = Integer.parseInt(parts[1]) - 1;

            if (drinkIndex >= 0 && drinkIndex < this.drinks.length) {
                Drink2 selectedDrink = this.drinks[drinkIndex];
                if (this.total >= selectedDrink.getPrice()) {
                    this.total -= selectedDrink.getPrice();
                    System.out.println(selectedDrink.getName() + " を購入しました。");
                    System.out.println("残金: " + this.total + "円");
                } else {
                    System.out.println("お金が足りません。");
                }
            } else {
                System.out.println("指定された商品はありません。");
            }
        } else if (com.equals("r")) {
            System.out.println("おつり: " + this.total + "円");
            this.total = 0;
        } else {
            System.out.println("不明なコマンドです。");
        }

        System.out.println("--------------------");
    }
}