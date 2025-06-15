public class D49Q24kadai {
    public static void main(String[] args) {

        int[] numbers = {25, 25, 30, 20};


        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }


        System.out.println("配列の合計: " + sum);
        System.out.println("配列の要素数: " + numbers.length);
    }
}
