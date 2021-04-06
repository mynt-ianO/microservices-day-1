package ph.apper.activity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @RequestController
    @RequestParam("activity")
    public static class ActivityController {

        @PostMapping
        public ResponseEntity create(@RequestBody Request request) {
            System.out.println(request);

            return ResponseEntity.ok(response);
        }

    }

    @Data
    public static class Request {
        private String firstName;
        private String lastName;
        private String Email;
        private String Password;
    }
}
