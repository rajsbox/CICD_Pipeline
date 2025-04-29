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
                "<style>" +
                "body {" +
                "    background: linear-gradient(to bottom, lightgray, white);" +
                "    background-size: cover;" +
                "    background-repeat: no-repeat;" +
                "    background-position: center;" +
                "    margin-left: 20px;" +
                "    text-align: justify;" +
                "}" +
                "h1 {" +
                "    text-align: center;" +
                "}" +
                ".image-container {" +
                "    display: flex;" +
                "    flex-direction: column;" +
                "    align-items: flex-start;" +
                "    margin-right: 20px;" +
                "    margin-top: 60px;" +
                "}" +
                ".image-container img {" +
                "    border: 5px solid white;" +
                "    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);" +
                "}" +
                ".content {" +
                "    display: flex;" +
                "    flex-direction: row-reverse;" +
                "    align-items: flex-start;" +
                "}" +
                ".content div:last-child {" +
                "    margin-right: 50px;" +
                "}" +
                "footer, .date-time {" +
                "    text-align: left;" +
                "    margin-left: 20px;" +
                "}" +
                "</style>" +
            "</head>" +
            "<body>" +
                "<div class=\"content\">" +
                "    <div class=\"image-container\">" +
                "        <img src=\"/images/image1.jpg\" alt=\"Image 1\" style=\"width:270px;height:auto;\">" +
                "        <img src=\"/images/image2.jpg\" alt=\"Image 2\" style=\"width:270px;height:auto;\">" +
                "        <img src=\"/images/image3.jpg\" alt=\"Image 3\" style=\"width:270px;height:auto;\">" +
                "    </div>" +
                "    <div>" +
                "        <h1>Welcome to CICD Pipeline</h1>" +
                "        <p>Continuous Integration and Continuous Deployment (CICD) are essential practices in modern software development. They enable teams to deliver code changes more frequently and reliably.</p>" +
                "        <h2>Continuous Integration</h2>" +
                "        <p>Continuous Integration involves automatically integrating code changes from multiple contributors into a shared repository several times a day. It helps in identifying bugs early and ensures code quality.</p>" +
                "        <h2>Continuous Deployment</h2>" +
                "        <p>Continuous Deployment automates the release of code to production. It ensures that every change passes through automated tests and is deployed without manual intervention.</p>" +
                "        <h2>Benefits of CICD</h2>" +
                "        <p>CICD improves collaboration, reduces integration issues, and accelerates the delivery of features to end-users. It fosters a culture of agility and innovation.</p>" +
                "        <p>By automating repetitive tasks, CICD allows developers to focus on writing quality code. It also ensures faster feedback loops, enabling teams to address issues promptly.</p>" +
                "        <p>Moreover, CICD enhances the reliability of software releases, minimizes downtime, and supports scalability as the project grows.</p>" +
                "        <h2>Explore More</h2>" +
                "        <button onclick=\"alert('Learn about Continuous Integration!')\">Continuous Integration</button>" +
                "        <button onclick=\"alert('Discover Continuous Deployment!')\">Continuous Deployment</button>" +
                "        <button onclick=\"alert('Understand the Benefits of CICD!')\">Benefits</button>" +
                "    </div>" +
                "</div>" +
                "<div style=\"text-align: left; margin-top: 20px;\">" +
                "    <p>Current Date and Time: " + java.time.LocalDateTime.now() + "</p>" +
                "</div>" +
                "<footer>" +
                    "<p>&copy; 2025 CICD Web Application</p>" +
                "</footer>" +
            "</body>" +
            "</html>";
    }

    @GetMapping("/images")
    public String images() {
        return "<!DOCTYPE html>" +
            "<html lang=\"en\">" +
            "<head>" +
                "<meta charset=\"UTF-8\">" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">" +
                "<title>Images</title>" +
                "<style>" +
                "body {" +
                "    background: linear-gradient(to bottom, lightgray, white);" +
                "    background-size: cover;" +
                "    background-repeat: no-repeat;" +
                "    background-position: center;" +
                "    margin-left: 40px;" +
                "    text-align: justify;" +
                "}" +
                "h1 {" +
                "    text-align: center;" +
                "}" +
                ".image-container {" +
                "    display: flex;" +
                "    flex-direction: column;" +
                "    align-items: flex-start;" +
                "    margin-right: 20px;" +
                "}" +
                ".image-container img {" +
                "    border: 5px solid white;" +
                "    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);" +
                "}" +
                "footer, .date-time {" +
                "    text-align: left;" +
                "    margin-left: 20px;" +
                "}" +
                "</style>" +
            "</head>" +
            "<body>" +
                "<div class=\"image-container\">" +
                "    <img src=\"/images/image1.jpg\" alt=\"Image 1\" style=\"width:270px;height:auto;\">" +
                "    <img src=\"/images/image2.jpg\" alt=\"Image 2\" style=\"width:270px;height:auto;\">" +
                "    <img src=\"/images/image3.jpg\" alt=\"Image 3\" style=\"width:270px;height:auto;\">" +
                "</div>" +
                "<div style=\"text-align: left; margin-top: 20px;\">" +
                "    <p>Current Date and Time: " + java.time.LocalDateTime.now() + "</p>" +
                "</div>" +
                "<footer>" +
                    "<p>&copy; 2025 CICD Web Application</p>" +
                "</footer>" +
            "</body>" +
            "</html>";
    }
}
