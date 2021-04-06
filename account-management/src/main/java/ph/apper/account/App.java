package ph.apper.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @RequestController
    @RequestParam("account")
    public static class AccountController {

        @PostMapping
        public ResponseEntity create(@RequestBody Request request) {
            System.out.println(request);

            return ResponseEntity.ok().build();
        }

    }

    @Data
    public static class Request {
        private String action;
        private String identifier;
    }
}
