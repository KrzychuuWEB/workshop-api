package pl.krzychuuweb.workshop;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    Map<String, String> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }

//    @ExceptionHandler(CarNotFoundException.class)
//    ResponseEntity<ExceptionResponseTemplate> carNotFoundException(CarNotFoundException exception, ServletWebRequest request) {
//        ExceptionResponseTemplate exceptionResponseTemplate = new ExceptionResponseTemplate(HttpStatus.BAD_REQUEST, exception.getLocalizedMessage(), request.getRequest().getRequestURI());
//
//        return new ResponseEntity<>(exceptionResponseTemplate, HttpStatus.BAD_REQUEST);
//    }

    private static class ExceptionResponseTemplate {
        private final LocalDateTime time;
        private final HttpStatus code;
        private final String message;
        private final String path;

        ExceptionResponseTemplate(HttpStatus code, String message, String path) {
            this.time = LocalDateTime.now();
            this.code = code;
            this.message = message;
            this.path = path;
        }

        public LocalDateTime getTime() {
            return time;
        }

        public HttpStatus getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }

        public String getPath() {
            return path;
        }
    }
}
