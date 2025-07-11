public class D51Ensyu {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("使用法: java D51Ensyu 学生番号 氏名");
            return;
        }

        String studentId = args[0];
        String name = args[1];

        // 学生インスタンス
        D51Student student = new D51Student(studentId, name);


        System.out.println("学生番号: " + student.getStudentId());
        System.out.println("氏名: " + student.getName());
    }
}

// D51Student クラス
class D51Student {
    private String studentId;
    private String name;

    public D51Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}
