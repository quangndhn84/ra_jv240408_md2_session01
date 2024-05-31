package ra.session01;

public class VariableDemo {
    public static void main(String[] args) {
        //Syntax khai báo biến: Datatype variableName
        //1. Khai báo biến lưu trữ mã sinh viên, tên sinh viên, tuổi, điểm sinh viên
        String studentId;
        String studentName;
        int age;
        float mark;
        //2. Khởi tạo giá trị cho các biến mã sinh viên, tên sinh viên, tuổi, điểm
        studentId = "SV001";
        studentName = "Nguyễn Văn A";
        age = 20;
        mark = 9.5F;
        //Wrapper Class: Float --> float
        //Syntax khai báo và khởi tạo giá trị biến: Datatype variableName = value
        //3. Khai báo và khởi tạo giá trị cho biến địa chỉ, số điện thoại, giới tính sinh viên
        String address = "Hà Nội";
        String phone = "0912345678";
        boolean sex = true;//Nam
        //4. Khai báo và khởi tạo cho nhiều biến cùng kiểu dữ liệu
        int firstNumber = 5,secondNumber = 10;
        //Syntax khai báo biến hắng số: final Datatype constantName = Value
        //Quy tắc đặt tên hằng số: viết hoa + Snake
        final float MARK_PASS = 50;
    }
}
