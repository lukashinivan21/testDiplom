package backends.testdiplom.dto;

import lombok.Data;

@Data
public class CreateAdsDto {

    private Integer pk;
    private Integer price;
    private String title;
    private String description;
    private String image;
}
