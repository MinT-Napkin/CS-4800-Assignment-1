package com.company.course;

public class Textbook {
    private String title;
    private String authorName;
    private String publisher;

    public Textbook()
    {
        this("N/A", "N/A", "N/A");
    }

    public Textbook(String title, String author, String publisher) {
        this.title = title;
        this.authorName = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
