package org.perscholas.inheritance.interfaces;

import org.perscholas.inheritance.models.Course;

public interface CourseService {
    //want a method that returns/creates a Course object
    public Course returnCourse();
    //and a method that takes in an object from Course as a param and has a return type of void
    public void changeCourse(Course course);
}
