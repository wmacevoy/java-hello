/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threading;

import static kiss.API.*;

/**
 *
 * @author wmacevoy
 */
public class App {
    void testCourses() {
        Courses courses = new Courses();
        courses.addCourse("web 1");
        courses.addCourse("java");
        courses.addCourse("fitness walking");
        Student alice = new Student("alice",courses);
        Student charlie = new Student("charlie",courses);
        Student bob = new Student("bob",courses); 
        Chair morgan = new Chair("morgan", courses);
        Chair payne = new Chair("payne", courses);
        pause(10);
        alice.graduate();
        charlie.graduate();
        bob.graduate();
        morgan.retire();
        payne.retire();
    }
    class Worker implements Runnable {

        @Override
        public void run() {
            println("started.");
            pause(3);
            println("done.");
        }
        
    }
    void run() {
        new Thread(()->{ pause(2); println("hi!"); }).start();
        Worker worker = new Worker();
        Thread workerThread = new Thread(worker);
        workerThread.start();
//        new Thread(new Worker()).start();
        ConsoleClock clock = new ConsoleClock();
        clock.start();
        pause(4.5);
        clock.close();
        println("done.");
    }
    
}
