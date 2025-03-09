// 3. Program to convert double to int with typecasting
public class DoubleToInt {
    public static void main(String[] args) {
        double num = 99.99;
        int converted = (int) num; // Data loss occurs as decimal part is truncated
        System.out.println("Double value: " + num);
        System.out.println("Converted int value: " + converted);
    }
}