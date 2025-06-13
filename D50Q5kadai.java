public class D50Q5kadai {
    public static void main(String[] args) {
        // コマンドライン引数から数値を取得
        int[] data = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            data[i] = Integer.parseInt(args[i]);
        }


        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;

                    System.out.print("ソート途中:");
                    for (int k = 0; k < n; k++) {
                        System.out.print(data[k] + " ");
                    }
                    System.out.println();
                }
            }
        }

        System.out.println("-------------------");
        System.out.print("ソート結果:");
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
