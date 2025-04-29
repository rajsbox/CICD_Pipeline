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
                "<title>About CICD</title>" +
            "</head>" +
            "<body>" +
                "<h1>Welcome to CICD Pipeline</h1>" +
                "<p>Continuous Integration and Continuous Deployment (CICD) are essential practices in modern software development. They enable teams to deliver code changes more frequently and reliably.</p>" +
                "<h2>Continuous Integration</h2>" +
                "<p>Continuous Integration involves automatically integrating code changes from multiple contributors into a shared repository several times a day. It helps in identifying bugs early and ensures code quality.</p>" +
                "<h2>Continuous Deployment</h2>" +
                "<p>Continuous Deployment automates the release of code to production. It ensures that every change passes through automated tests and is deployed without manual intervention.</p>" +
                "<h2>Benefits of CICD</h2>" +
                "<p>CICD improves collaboration, reduces integration issues, and accelerates the delivery of features to end-users. It fosters a culture of agility and innovation.</p>" +
                "<h2>Explore More</h2>" +
                "<button onclick=\"alert('Learn about Continuous Integration!')\">Continuous Integration</button>" +
                "<button onclick=\"alert('Discover Continuous Deployment!')\">Continuous Deployment</button>" +
                "<button onclick=\"alert('Understand the Benefits of CICD!')\">Benefits</button>" +
                "<footer>" +
                    "<p>&copy; 2025 CICD Web Application</p>" +
                "</footer>" +
            "</body>" +
            "</html>";
    }
}
