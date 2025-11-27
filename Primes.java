public class Primes {
    public Primes() {

    }

    public static void main(String[] var0) {
        // Replace this statement with your code
        if (var0.length != 0) {
            int var1 = Integer.parseInt(var0[0]);
            printPrimesUpTo(var1);
        }

    }

    public static void printPrimesUpTo(int var0) {
        if (var0 < 2) {
            System.out.println("אין מספרים ראשוניים");
        } else {
            System.out.println(" Prime numbers up to " + var0 + ":");
            int var1 = 0;

            for (int var2 = 2; var2 <= var0; ++var2) {
                if (isPrime(var2)) {
                    System.out.println(var2);
                    ++var1;
                }
            }
            double var5 = (double) var1 / (double) var0 * 100.0;
            int var4 = (int) Math.round(var5);
            System.out.println(" There are " + var1 + " primes between 2 and " + var0 + " (" + var4 + " are primes");

        }
    }

    public static boolean isPrime(int var0) {
        for (int var1 = 2; var1 * var1 <= var0; ++var1) {
            if (var0 % var1 == 0) {
                return false;
            }
        }
        return true;
    }
}