package Function;

import java.util.Arrays;

public class prime {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 5;
	        System.out.println("Number of ways to partition " + n + " into sum of prime numbers: " + countWays(n));
	}
	public static int countWays(int n) {
        // Sieve of Eratosthenes to generate primes up to n
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * 2; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i; j <= n; j++) {
                    dp[j] += dp[j - i];
                }
            }
        }

        return dp[n];

	}}
