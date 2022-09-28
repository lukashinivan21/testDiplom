package backends.testdiplom.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AdsCommentDto {

    private Integer author;
    private Integer pk;
    private String text;
    private LocalDateTime createdAt;
}
