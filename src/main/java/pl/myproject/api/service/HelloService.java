package pl.myproject.api.service;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String Hello(){
        return "Hello Service";
    }
}
