/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;
import static kiss.API.*;


/**
 *
 * @author wmacevoy
 */
public class Bird extends Animal {
    Bird(String name) {
        super(name);
        // make the bird part of animal here
    }
    void fly() {
        println("flying...");
    }
}
