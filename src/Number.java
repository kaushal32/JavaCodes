public class Number {
    private int a;

    Number(int a) {
        this.a = a;
    }

    public boolean isZero(int b) {
        if (b == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPositive(int b) {
        if (b > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isNegative(int b) {
        if (b < 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOdd(int b) {
        if (b % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEven(int b) {
        if (b % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPrime(int b) {
        int c = 0;
        for (int i = 2; i < b; i++) {
            if (b % i == 0) {
                c = c + 1;
            }
        }
        if (c == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isArmstrong(int b) {
        int d = b;
        int e;
        int f = 0;
        while (b >= 1) {
            e = b % 10;
            b = b / 10;
            f += e * e * e;
        }
        if (f == d) {
            return true;
        } else {
            return false;
        }
    }

    public int getFactorial(int b) {
        int d = 1;
        int e = 0;
        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= i; j++) {
                d *= j;
            }
            e += d;
        }
        return e;
    }

    public int getSqrt(int b) {
        return (int) Math.sqrt(b);
    }
    public int gerSqr(int b){
        return b*b;
    }
    public int sumDigits(int a, int b, int c){
        return a+b+c;
    }
    public String dispBinary(int b){
        return Integer.toBinaryString(b);
    }
    public String dispOctal(int b){
        return Integer.toOctalString(b);
    }
    public String dispHexa(int b){
        return Integer.toHexString(b);
    }

    public static void main(String[] args) {
        Number obj = new Number(213);
        System.out.println(obj.dispBinary(2));
        System.out.println(obj.dispHexa(obj.a));
        System.out.println(obj.dispOctal(obj.a));
        System.out.println(obj.gerSqr(4));
        System.out.println(obj.getFactorial(5));
        System.out.println(obj.getSqrt(25));
        System.out.println(obj.isArmstrong(370));
        System.out.println(obj.isEven(obj.a));
        System.out.println(obj.isNegative(-2));
        System.out.println(obj.isOdd(1));
        System.out.println(obj.isPositive(4));
        System.out.println(obj.isPrime(5));
        System.out.println(obj.isZero(0));
        System.out.println(obj.sumDigits(3, 4, 3));
    }
}
