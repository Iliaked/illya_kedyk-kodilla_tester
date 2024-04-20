package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BookControllerTest {

    @Test
    void shouldAddBooks() {
        //Given
        BookDto bookDto = new BookDto("Foundation", "Isaac Asimov");
        BookService bookService = new BookService();
        BookController bookController = new BookController(bookService);
        bookService.addBook(bookDto);

        //When
        List<BookDto> books = bookController.getBooks();
        int size = books.size();

        //Then
        Assertions.assertEquals(1, size);
    }
}