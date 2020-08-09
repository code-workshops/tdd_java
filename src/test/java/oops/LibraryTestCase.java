package oops;

import oops.library.Author;
import oops.library.Book;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;

import static org.junit.Assert.*;

public class LibraryTestCase {

    @Test
    public void testCreateAuthorSuccess() {
        Author author = new Author("Testy McTest");
        assertNotNull(author);
    }

    @Test
    public void testSetAuthorBirthday() {
        // TODO: Doesn't feel like a good test here even though its goal is met (practice SEAT and making up test expectations)
        Author author = new Author("Testy McTest");
        int age = 40;
        author.setBirthday("1980-02-14");
        assertEquals(age, author.age);
    }

    @Test
    public void testBookHasAuthor() {
        Author author = new Author("Testy McTest");
        Book book = new Book("A Test", author);
        assertEquals("A Test", book.title);
        assertEquals("Testy McTest", book.author.name);
    }
}
