public class D50Q23 {

    String code;

    public static void main(String[] args) {
        D50Q23 obj = new D50Q23();
        obj.setCode("Code");

        // 出力はここで行う
        System.out.println(obj.code);
    }

    void setCode(String c) {
        code = c;
    }
}
