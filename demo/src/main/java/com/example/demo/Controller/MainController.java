package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//this annotation allows us to create routes
//basically allowing restfull endpoints
@RestController
public class MainController {

    //this is an endpoint
    //we can access this resource on this endpoint
    //all that we get back is a string
    @RequestMapping("/")
    public String home(){
        return "Hello World";
    }
    //going to an endpoint will resolve the method.
    //meaning that any algorithms will also resolve.
//    @GetMapping("/pmath/{x}/{y}")
//    public Integer doMath(@PathVariable int x , @PathVariable int y){
//        return x + y;
//    }

//    @GetMapping("/hello/{name}")
//    public String homeWith(@PathVariable String name){
//
//        return "Frankln"+name;
//    }

}
