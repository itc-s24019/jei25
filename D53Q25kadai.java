// D53Q25kadai.java
public class D53Q25kadai {
    public static void main(String[] args) {
        char[] ch = {'A', 'B', 'C'};
        String s1 = new String("ABC");

        // ▼ここからコードを変更▼

        // 元のコード: String s2 = new String(ch);
        // 元のコードでは、s1とs2はそれぞれ `new` キーワードによって
        // メモリ上に別々のオブジェクトとして生成されます。
        // そのため、s1 == s2 (参照先アドレスの比較) は false となっていました。

        // 変更後のコード: 変数s2に、変数s1の参照を代入します。
        // これにより、s1とs2はメモリ上の「全く同じオブジェクト」を
        // 指し示すようになります。
        String s2 = s1;

        // ▲ここまでコードを変更▲


        // b1 の評価: s1 == s2
        // `==` 演算子は、二つの変数が同じオブジェクトを参照しているかを比較します。
        // 上記の変更により s1 と s2 は同じオブジェクトを参照しているため、b1は `true` となります。
        boolean b1 = s1 == s2;

        // b2 の評価: s1.equals(s2)
        // `.equals()` メソッドは、オブジェクトが持つ文字列の内容が等しいかを比較します。
        // s1とs2は同じオブジェクトであり、当然ながら文字列の内容("ABC")も等しいため、b2は `true` となります。
        boolean b2 = s1.equals(s2);

        // 結果として "true true" が表示されます。
        System.out.print(b1 + " " + b2);
    }
}