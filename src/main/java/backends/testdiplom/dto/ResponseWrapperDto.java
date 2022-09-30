package backends.testdiplom.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class ResponseWrapperDto<T>{

    private Integer count;
    private List<T> list;

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
