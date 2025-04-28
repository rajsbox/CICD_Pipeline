package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

@RestController
class HelloController {
    @GetMapping("/")
    public String hello() {
        return "<!DOCTYPE html>" +
            "<html lang=\"en\">" +
            "<head>" +
                "<meta charset=\"UTF-8\">" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">" +
                "<title>About India</title>" +
            "</head>" +
            "<body>" +
                "<h1>Welcome to India Inc100</h1>" +
                "<p>India, officially the Republic of India, is a country in South Asia. It is the seventh-largest country by land area, the second-most populous country, and the most populous democracy in the world.</p>" +
                "<h2>Culture</h2>" +
                "<p>India is known for its rich cultural heritage, including art, music, dance, and festivals. It is the birthplace of major religions such as Hinduism, Buddhism, Jainism, and Sikhism.</p>" +
                "<h2>Geography</h2>" +
                "<p>India is bounded by the Indian Ocean to the south, the Arabian Sea to the southwest, and the Bay of Bengal to the southeast. It shares land borders with Pakistan, China, Nepal, Bhutan, Bangladesh, and Myanmar.</p>" +
                "<h2>Tourism</h2>" +
                "<p>India is home to numerous UNESCO World Heritage Sites, including the Taj Mahal, Jaipur City, and the Qutub Minar. It offers diverse landscapes ranging from the Himalayas to the Thar Desert and tropical beaches.</p>" +
                "<h2>Explore More</h2>" +
                "<button onclick=\"alert('Learn about Indian Culture!')\">Culture</button>" +
                "<button onclick=\"alert('Discover Indian Geography!')\">Geography</button>" +
                "<button onclick=\"alert('Plan your visit to India!')\">Tourism</button>" +
                "<footer>" +
                    "<p>&copy; 2025 India Web Application</p>" +
                "</footer>" +
            "</body>" +
            "</html>";
    }
}
