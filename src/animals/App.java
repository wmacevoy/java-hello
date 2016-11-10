/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

import java.util.LinkedList;
import static kiss.API.*;

/**
 *
 * @author wmacevoy
 */
public class App {
   void testAnimals() {
       LinkedList<Animal> animals = new LinkedList<Animal>();
       animals.add(new Ferret("Slim"));
       animals.add(new Ferret("Tim"));
       animals.add(new Raven("Poe"));
       animals.add(new Bird("Dee"));
   }    
    
}
