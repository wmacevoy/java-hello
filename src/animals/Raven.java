/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author wmacevoy
 */

import static kiss.API.*;

public class Raven extends Bird {
    Raven(String name) {
        super(name);
    }
    void quoth() {
        println("nevemore...");
    }
    
    @Override
    void fly() {
        super.fly();
        println("(quietly)");
    }
}
