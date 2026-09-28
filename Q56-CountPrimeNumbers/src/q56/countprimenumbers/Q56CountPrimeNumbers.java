
package q56.countprimenumbers;

public class Q56CountPrimeNumbers {

    public static void main(String[] args) {
        int n = 1235;

        System.out.println("Input the number(n):");
        System.out.println(n);

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        System.out.println("Number of prime numbers which are less than or equal to n.:");
        System.out.println(count);
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
}
