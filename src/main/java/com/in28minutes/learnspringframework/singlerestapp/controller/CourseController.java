package com.in28minutes.learnspringframework.singlerestapp.controller;

import com.in28minutes.learnspringframework.singlerestapp.domain.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @RequestMapping(value = "/courses", method = RequestMethod.GET)
    public List<Course> getCourses() {
        return List.of(new Course(1L, "Learn in 28 minutes", "In 28 minutes"),
                new Course(2L, "Learn JavaScript and React", "Ivan Petrichenko"),
                new Course(3L, "Learn AWS", "In 28 minutes"));
    }
}
