public class D52Q5kadai {
    public static void main(String[] args) {
        final int LIMIT = 400;
        if (args.length == 0) return;

        int[] data = new int[args.length];
        int max = 0;


        for (int i = 0; i < args.length; i++) {
            data[i] = Integer.parseInt(args[i]);
            if (data[i] <= 0 || data[i] >= LIMIT) return;
            if (max < data[i]) {
                max = data[i];
            }
        }


        int starsMax = (max - 1) / 10 + 1;  // 必要な*の最大数
        System.out.print("     ");  // 数値表示分のスペース
        for (int i = 0; i < starsMax; i++) {
            System.out.print("+----");
        }
        System.out.println("+");


        for (int value : data) {
            System.out.printf("%3d : ", value); // 数値表示（右寄せ3桁）
            int starCount = (value - 1) / 10 + 1;
            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
