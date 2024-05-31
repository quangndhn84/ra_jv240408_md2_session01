package ra.session01;

public class CastingDemo {
    public static void main(String[] args) {
        //Implicit: Ngầm định, ép kiểu dữ liệu từ thấp lên cao
        float number = 10;//int -> float
        //Explicit: Tường minh, ép kiểu dữ liệu từ cao xuống thấp (Người lập trình phải ép kiểu)
        float firstNumber = 8.9F;//double --> float
        int secondNumber = (int)8.9;
    }
}
