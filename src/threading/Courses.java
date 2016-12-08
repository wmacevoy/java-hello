/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threading;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author wmacevoy
 */
public class Courses {
    private LinkedList<String> data = new LinkedList<String>();
    
    public synchronized void addCourse(String course) {
        data.add(course);
    }
    
    public synchronized List<String> getCourses() {
        return new ArrayList<String>(data);
    }
}
