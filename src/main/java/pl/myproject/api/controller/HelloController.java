package pl.myproject.api.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.myproject.api.service.HelloService;

@RestController
@RequiredArgsConstructor
public class HelloController {



    private final HelloService helloService;


    @GetMapping("/")
    public String hello(){
        return  helloService.Hello();
    }
}
