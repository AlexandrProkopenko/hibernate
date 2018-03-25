package xml.manytomany.entity;

import java.util.List;

public class Author {

    private Long id;
    private String name;
    private List<Book> books;

    public Author() {
    }

    public Author(String name, List<Book> books) {
        this.name = name;
        this.books = books;
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

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        for (Book book: books) {
//            sb.append(book.getTitle() + " ");
//        }

        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}
