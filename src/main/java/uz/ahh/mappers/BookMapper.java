package uz.ahh.mappers;

import org.springframework.stereotype.Component;
import uz.ahh.dto.book.BookCreateDto;
import uz.ahh.models.Book;

import java.util.UUID;

@Component
public class BookMapper {

    public Book toEntity(BookCreateDto dto) {
        Book book = new Book();
        book.setId(UUID.randomUUID().toString());
        book.setName(dto.getName());
        book.setAuthor(dto.getAuthor());
        book.setPageCount(dto.getPageCount());
        return book;
    }
}
