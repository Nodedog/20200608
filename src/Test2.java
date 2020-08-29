
/*
*               斐波那契数列
*
* */
public class Test2 {
    public static int  Fibonacci(int n) {
        if (n < 1 && n >1000000){
            return 0;
        }

        int a = 0;
        int b = 1;
        int c = 1;
        while(c < n){
            a = b;
            b = c;
            c = a + b;
        }
        int n1 = n - b;
        int n2 = c - n;
        return n1 < n2 ? n1 : n2;
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(Fibonacci(n));
    }
}
