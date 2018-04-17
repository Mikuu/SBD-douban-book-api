package com.twqa.demo.wiremock.api;

import java.util.List;

public class Books {

    private int count;
    private int start;
    private int total;

    public Books() {}

    public Books(int count, int start, int total, List<Book> books) {
        this.count = count;
        this.start = start;
        this.total = total;
        this.books = books;
    }

    private List<Book> books;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
