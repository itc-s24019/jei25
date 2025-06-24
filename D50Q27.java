public class D50Q27 {
    public static void main(String[] args) {

        int control = 3;  // ← ここを 1 や 2 に変えると出力も変わる
        String mode;

        switch (control) {
            case 1:
                mode = "Warm";
                break;
            case 2:
                mode = "Cool";
                break;
            case 3:
                mode = "Wind";
                break;
            default:
                mode = "Unknown";
                break;
        }

        System.out.println(mode);
    }
}
