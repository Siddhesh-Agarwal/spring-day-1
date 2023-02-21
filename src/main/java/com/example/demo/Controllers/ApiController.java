package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome String Boot!";
    }

    @GetMapping("/")
    public String getName(String studentName) {
        return "Hello " + studentName + "!";
    }

    @GetMapping("/color")
    public String getMyFav(String myFavColor) {
        return "Your favorite color is " + myFavColor + "!";
    }
}
