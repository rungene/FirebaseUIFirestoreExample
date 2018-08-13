package com.rungenes.firebaseui_firestoreexample;

public class Note {

    private String title;
    private String description;
    private int  priority;

    public Note(){

//empty constructor needed
    }

    public Note(String title, int priority, String description) {
        this.title = title;
        this.priority = priority;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public int getPriority() {
        return priority;
    }


    public String getDescription() {
        return description;
    }

}
