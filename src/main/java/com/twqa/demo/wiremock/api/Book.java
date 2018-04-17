package com.twqa.demo.wiremock.api;

public class Book {
    private String publisher;
    private String price;
    private String title;
    private String pages;
    private String id;

    public Book() {}

    public Book(String publisher, String price, String title, String pages, String id) {
        this.publisher = publisher;
        this.price = price;
        this.title = title;
        this.pages = pages;
        this.id = id;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
