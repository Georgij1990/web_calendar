package webCalendarSpring;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class WebCalendarController {
    @GetMapping("/event/today")
    public ResponseEntity<List<Object>> handleGetRequest() {
        return ResponseEntity.ok(Collections.emptyList());
    }
}
