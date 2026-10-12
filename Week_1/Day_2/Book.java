//day2 exercise 11
package com.example.week_1.day_2;
import java.util.Objects;
public class Book {

    private String title;
    private String author;
    private String isbn;
    private Genre genre;
    private boolean available;

    public Book(String title,
                String author,
                String isbn,
                Genre genre,
                boolean available) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.genre = genre;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public Genre getGenre() {
        return genre;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }

        Book other = (Book) obj;
        return Objects.equals(isbn,other.isbn);
    }

    @Override
    public int hashCode(){
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", genre=" + genre +
                ", available=" + available +
                '}';
    }

}