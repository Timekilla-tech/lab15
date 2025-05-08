package labxx.sict.must.edu.mn;

public class Calculator {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
    public int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("0-д хувааж болохгүй.");
        return a / b;
    }
}
