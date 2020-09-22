package org.perscholas.inheritance.interfaces;

import org.perscholas.inheritance.models.Course;

public class CourseServiceImpl implements CourseService {

    @Override
    public Course returnCourse() {
        //how do I create a course obj here?
        Course course = new Course();
        return course;
    }

    @Override
    public void changeCourse(Course course) {

    }
}
