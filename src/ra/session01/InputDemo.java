package ra.session01;


import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        /*
         * 1. Bước 1: Khởi tạo đối tượng scanner từ lớp java.util.Scanner
         * 2. Bước 2: Thông báo nhập dữ liệu
         * 3. Bước 3: Sử dụng các phương thức của lớp Scanner lấy dữ liệu
         * nhập từ bàn phím lưu vào biến
         * */
        //1. Nhập vào mã sinh viên
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã sinh viên:");
        String studentId = scanner.nextLine();
        //2. Nhập vào tên sinh viên
        System.out.println("Nhập vào tên sinh viên:");
        String studentName = scanner.nextLine();
        //3. Nhập vào tuổi sinh viên
        /*
        * String --> int: Interger.parseInt("String")
        * String --> float: Float.parseFloat("String")
        * String --> double: Double.parseDouble("String")
        * String --> boolean: Boolean.parseBoolean("String")
        * */
        System.out.println("Nhập vào tuổi sinh viên:");
//        int age = scanner.nextInt();
//        scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        //4. Nhập vào địa chỉ sinh viên
        System.out.println("Nhập vào địa chỉ sinh viên:");
        String address = scanner.nextLine();
        //5. Nhập vào giới tính sinh viên (F-Female, M-Male)
        System.out.println("Nhập vào giới tính sinh viên:");
        char sex = scanner.nextLine().charAt(0);

        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Tên sinh viên: " + studentName);
        System.out.println("Tuổi: " + age);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Giới tính: " + sex);
    }
}
