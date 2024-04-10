package webCalendarSpring;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@Validated
public class WebCalendarController {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> returnBadRequestCode(MethodArgumentNotValidException ex) {
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/event/today")
    public ResponseEntity<List<Object>> handleGetRequest() {
        return ResponseEntity.ok(Collections.emptyList());
    }

    @PostMapping("/event")
    public ResponseEntity<Event> addEvent(@Valid @RequestBody Event event) {
        return ResponseEntity.ok(event);
    }
}
