package practiceSetNumber;



public class KthPrimeNumber {

    public static void main(String[] args) {
        System.out.println(kthPrime(5)); // 11
    }

    public static int kthPrime(int k) {
        int count = 0;
        int num = 2;

        while (true) {
            if (isPrime(num)) {
                count++;
                if (count == k) {
                    return num;
                }
            }
            num++;
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

