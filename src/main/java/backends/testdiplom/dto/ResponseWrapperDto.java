package backends.testdiplom.dto;

import lombok.Data;

import java.util.List;

@Data
public class ResponseWrapperDto<T>{

    private Integer count;
    private List<T> list;
}
