
public class D51Q6 {
    public static void main(String[] args) {

        Item[] li = { new Item("AA", "魚類"), new Item("BB", "肉類") };


        Item[] si = {
                new Item("A1", "さば"), new Item("A2", "さんま"),
                new Item("B1", "牛肉"), new Item("B2", "鶏肉"),
                new Item("B3", "豚肉"), new Item("B4", "加工肉") // この項目を追加
        };

        ItemMaster im = new ItemMaster(li, si);


        String productCode = args[0];


        String lcode = productCode.substring(0, 2);    // 大分類コード (1-2桁目)
        String scode = productCode.substring(2, 4);    // 小分類コード (3-4桁目)
        String details = productCode.substring(4);     // (33) 詳細コード (5-8桁目)


        String lname = im.getItemName(ItemMaster.MAJOR, lcode);
        String sname = im.getItemName(ItemMaster.MINOR, scode);


        System.out.println("商品コード：" + productCode);
        System.out.println("大分類：" + lname);         // 出力形式を変更
        System.out.println("小分類：" + sname);         // 出力形式を変更
        System.out.println("詳細コード：" + details);
    }
}


class Item {
    private String code;
    private String name;

    Item(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() { return code; }
    public String getName() { return name; }
}


class ItemMaster {

    public static final int MAJOR = 0;
    public static final int MINOR = 1;

    private Item[][] items;

    ItemMaster(Item[] major, Item[] minor) {
        items = new Item[2][]; // (34)
        items[MAJOR] = major;
        items[MINOR] = minor;
    }

    public String getItemName(int codelevel, String code) {
        for (int i = 0; i < items[codelevel].length; i++) { // (35)
            if (code.equals(items[codelevel][i].getCode())) { // (36)
                return items[codelevel][i].getName();
            }
        }
        return "（不明）"; // (37) 見つからなかった場合
    }
}