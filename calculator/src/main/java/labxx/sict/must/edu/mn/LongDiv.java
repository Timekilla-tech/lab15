package labxx.sict.must.edu.mn;


public class LongDiv {
    public long divide(long a, long b) {
        if (b == 0) throw new IllegalArgumentException("0-д хувааж болохгүй.");
        return a / b;
    }
}
