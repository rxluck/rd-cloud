package com.rx.common.sdk.repsentation;

public class ResponseJson<T> {
    private int code;
    private T content;

    public ResponseJson(int code, T content) {
        this.code = code;
        this.content = content;
    }

    public static ResponseJson success() {
        return new ResponseJson(200, "ok");
    }

    public static ResponseJson success(Object data) {
        return new ResponseJson(200, data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
