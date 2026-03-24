package capgi.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Controller {

    // why we need requestmapping - used to differentiate between controller
    // there will be multiple controller - so to differentiate - we need and need to give unique keyword
    // getmapping - diffrentiate between methods

    @GetMapping("/hi")
    public String hello()
    {
        return "hello folks";
    }
    @GetMapping("/bye")
    public String give()
    {
        return "Bye";
    }
}
