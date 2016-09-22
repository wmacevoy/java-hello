/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import static kiss.API.*;

public class HelloWorld {    
    void testClock() {
        Clock clock = test(new Clock());
    }
    
    void testTimezoneClock() {
        TimezoneClock tzClock = testAlways(new TimezoneClock());
    }
}
