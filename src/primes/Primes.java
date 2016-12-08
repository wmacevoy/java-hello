/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primes;

import java.util.Scanner;
import static kiss.API.*;

/**
 *
 * @author wmacevoy
 */
public class Primes {


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
