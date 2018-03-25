package xml.manytomany;

import xml.manytomany.dao.impl.EntityDAOImpl;
import xml.manytomany.entity.Author;
import xml.manytomany.entity.Book;

public class ManyToManyApp {

    public static void main(String[] args) {
        EntityDAOImpl<Book> bookDAO = new EntityDAOImpl<Book>(Book.class);
        EntityDAOImpl<Author> authorDAO = new EntityDAOImpl<Author>(Author.class);

        Author a1 = authorDAO.getById(2L);

        System.out.println(a1.getBooks());

    }
}
