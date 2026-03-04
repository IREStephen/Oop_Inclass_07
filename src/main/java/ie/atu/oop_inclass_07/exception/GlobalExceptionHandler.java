package ie.atu.oop_inclass_07.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

public class GlobalExceptionHandler {
    @RestController
    public class GlobalExceptionHandler {
        @ExceptionHandler(value = {MethodArgumentNotValidException.class})
        public ResponseEntity<Loan> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
            Map<String, String> errors = new HashMap<>();
            for (FieldError fieldError : ex.getBindingResult().getFieldErrors()) {
                String field = fieldError.getField();
                String message = fieldError.getDefaultMessage();
                errors.put(fieldName, errorMessage);
            }
        }return ResponseEntity.badRequest().body(errors);
    }
}
