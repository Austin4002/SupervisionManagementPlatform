package pojo;

import lombok.Data;

@Data
public class Result<T> {
    private int code;
    private String msg;
    public T data;

    public Result() {
        code = 0;
    }

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(T data) {
        this.data = data;
    }
}
