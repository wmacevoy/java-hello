/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threading;

/**
 *
 * @author wmacevoy
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import static kiss.API.*;

public class Student {
    String name;
    Courses courses;
    volatile boolean matriculated = false;
    
    class Action extends Thread {
        public void run() {
            while (!matriculated) {
                pause(random(0,3000)*0.001);
                println(name,"got",courses.getCourses());
            }
            
        }
    }
    Action action;
    void graduate() {
        matriculated = true; 
        try { 
            action.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    Student(String _name, Courses _courses) {
        name=_name;
        courses=_courses;
        action = new Action();
        action.start();
    }
}
