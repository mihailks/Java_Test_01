import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // What data type to use???
        BigInteger T1 = scanner.nextBigInteger();
        BigInteger T2 = scanner.nextBigInteger();
        BigInteger T3 = scanner.nextBigInteger();
        int n = scanner.nextInt();
        BigInteger Tn;

        /*long T1 = scanner.nextLong();
        long T2 = scanner.nextLong();
        long T3 = scanner.nextLong();
        long n = scanner.nextLong();
        long Tn;
        */
        for(int i=4; i<=n; i++) {
            Tn = T1.add(T2).add(T3);
            T1 = T2;
            T2 = T3;
            T3 = Tn;
        }
        /*for(int i=4; i<=n; i++){
            Tn = T1 + T2 + T3;
            T1=T2;
            T2=T3;
            T3=Tn;
        }*/
        System.out.println(T3);
    }
}
/*
        int T4 = T1 + T2 + T3;
        int T5 = T2 + T3 + T4;
        int T6 = T3 + T4 + T5;
        int T7 = T4 + T5 + T6;
        int T8 = T5 + T6 + T7;
        int T9 = T6 + T7 + T8;
        int T10 = T7 + T8 + T9;
        int T11 = T8 + T9 + T10;
        */
