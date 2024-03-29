package com.in28minutes.learnspringframework.singlerestapp.domain;


public class Course {
    private Long id;
    private String name;
    private String authorName;

    public Course() {
    }

    public Course(Long id, String name, String authorName) {
        this.id = id;
        this.name = name;
        this.authorName = authorName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
