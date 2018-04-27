package priv.module2.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/")
public class HelloController {
    
    public String index1() {
        return "123";
    }
    
    @GetMapping(value = "/abc")
    public String index()
    {
        return "hello";
    }
    
    @GetMapping(value = "/hello")
    public String sayHello()
    {
        return LocalDate.now().toString();
    }
}
