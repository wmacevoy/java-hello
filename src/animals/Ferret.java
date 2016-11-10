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
public class Ferret extends Animal {
    Ferret(String name) {
        super(name);
    }
    void scurry() {
        println("scurry!!!");
    }
}
