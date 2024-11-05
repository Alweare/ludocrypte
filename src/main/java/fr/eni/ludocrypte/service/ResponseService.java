package fr.eni.ludocrypte.service;

import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class ResponseService<T> {
private String code;
private String message;
private T data;

public static <T> ResponseService <T> buildResponse(String code, String message, T data) {
    ResponseService<T> res = new ResponseService<>();
    res.code = code;
    res.message = message;
    res.data = data;
    return res;
}

}
