package ra.session01;

public class OperatorDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = a++;//b=10 va a=11
        System.out.printf("b=%d va a=%d\n", b, a);
        int c = ++b;//c=11 va b=11
        System.out.printf("c=%d va b=%d\n", c, b);
        String str1 = "abc";//String
        String str2 = new String("abc");//object
        //Format code: Ctrl + Alt + L
        System.out.println("Kết quả so sánh str1 và str2: " + str1 == str2);
    }
}
