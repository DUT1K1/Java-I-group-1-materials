package ge.mziuri.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {
    @GetMapping
    public String home() {
        return "Hello World!";
    }

    @GetMapping("/{name}")
    public String getMessage(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
}
