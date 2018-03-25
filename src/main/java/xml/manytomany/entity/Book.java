package xml.manytomany.entity;

import java.util.List;

public class Book {

    private Long id;
    private String title;
    private List<Author> authors;

    public Book() {
    }

    public Book(String title, List<Author> authors) {
        this.title = title;
        this.authors = authors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (Author author: authors) {
            sb.append(author.getName() + " ");
        }
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authors=" + authors +
                '}';
    }
}
