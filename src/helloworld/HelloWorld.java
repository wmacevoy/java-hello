/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import static kiss.API.*;


public class HelloWorld {    
    void testRun() {
        outExpect("Hello!");
        run();
        outClose();
    }
    
    void run() {
        println("Hello World!");
        
        println("How are you?");
    }
}
