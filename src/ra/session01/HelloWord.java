package ra.session01;

public class HelloWord {
    public static void main(String[] args) {
        System.out.println("Hello Word");
        int a = 10;
        float b = 6.7F;
        HelloWord hw = new HelloWord();//object
        System.out.println("Tổng 2 số là: " + hw.sumTwoNumber(5, 10));
    }

    public int sumTwoNumber(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum;
    }
}
