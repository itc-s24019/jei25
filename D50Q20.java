public class D50Q20 {
    public static void main(String[] args) {
        int num = 999;  // 1000以下に変更
        String scale = num > 1000 ? "Wide" : "Narrow";

        System.out.println(scale);  // → Narrow と表示される
    }
}
