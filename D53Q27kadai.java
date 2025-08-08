public class D53Q27kadai {
    enum Udon {
        KAKE("かけ", 290),
        KITSUNE("きつね", -380),
        CURRY("カレー", 490),
        TEMPURA("天ぷら", 550),
        WAKAME("わかめ", 320),
        BEEF("肉", 480);

        private String japaneseName;
        int price;

        Udon(String japaneseName, int price) {
            this.japaneseName = japaneseName;
            if(price <= 0) {
                this.price = price;
            } else {
                this.price = -1 * price;
            }
        }

        public String toString() {
            return japaneseName + " : " + price + "円";
        }
    }

    public static class Q27 {
        public static void main(String[] args) {
            System.out.println("=== うどんメニュー ===");
            System.out.println(Udon.KITSUNE);
            System.out.println(Udon.TEMPURA);
            System.out.println(Udon.WAKAME);
            System.out.println(Udon.BEEF);
            System.out.println(Udon.KAKE);
            System.out.println(Udon.CURRY);

            System.out.println("\n=== 全メニュー一覧 ===");
            for(Udon udon : Udon.values()) {
                System.out.println(udon);
            }
        }
    }
}