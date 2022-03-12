package uz.ahh.dto.book;

import lombok.*;
import uz.ahh.dto.file.ResourceDto;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookDto {
    private String id;
    private String name;
    private String author;
    private Integer pageCount;
    private ResourceDto resourceDto;
}
