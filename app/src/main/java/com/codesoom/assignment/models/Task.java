package com.codesoom.assignment.models;

public class Task {

    private Long id;

    private String title;

    public Task() {
    }

    public Task(String title) {
        this.title = title;
    }

    public Task(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void update(Task task) {
        this.title = task.getTitle();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = (prime * hashCode) + ((id == null) ? 0 : id.hashCode());
        hashCode = (prime * hashCode) + ((title == null) ? 0 : title.hashCode());

        return hashCode;
    }

    @Override
    public String toString() {
        return String.format("{ id = %s, title = %s }", id, title);
    }

}