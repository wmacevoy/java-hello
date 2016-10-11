/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primes;

import static kiss.API.*;

/**
 *
 * @author wmacevoy
 */
public class Primes {

    void testSmallPrimes() {
        Primes primes = new Primes();
        assert primes.isPrime(2) == true;
        assert primes.isPrime(3) == true;
        assert primes.isPrime(5) == true;
    }

    void testSmallComposites() {
        Primes primes = new Primes();
        assert primes.isPrime(4) == false;
        assert primes.isPrime(6) == false;
    }

    void testBigPrimes() {
        Primes primes = new Primes();
        double trials = 1000;

        double t0 = time();
        for (int trial = 0; trial < trials; ++trial) {
            assert primes.isPrime(1_000_003) == true;
        }
        double smallTime = time() - t0;

        double t1 = time();
        for (int trial = 0; trial < trials; ++trial) {
            assert primes.isPrime(1_000_000_007) == true;
        }
        double bigTime = time() - t1;

        assert (bigTime < 100 * smallTime);
    }

    boolean isPrime(int x) {
        int y = min(x - 1, (int) (sqrt(x) + 1.0));
        for (int factor = 2; factor <= y; ++factor) {
            if (x % factor == 0) {
                return false;
            }
        }
        return true;
    }

    void testHi() {
        println("Hi");
    }

}
