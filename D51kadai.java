public class D51kadai {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("引数が足りません。少なくとも2つの引数が必要です。");
            return;
        }

        try {

            double value = Double.parseDouble(args[1]);

            double result = Math.ceil(value);

            System.out.println(result);

        } catch (NumberFormatException e) {
            System.out.println("引数が不正です。2番目の引数は数値である必要があります。");
        }
    }
}