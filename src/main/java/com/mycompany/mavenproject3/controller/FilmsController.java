package com.mycompany.mavenproject3.controller;
import com.mycompany.mavenproject3.dao.type.Films; 
import java.util.List; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/")    
public class FilmsController {
    @RequestMapping(value="getFilms", method = RequestMethod.GET) 
public List<Films> getAll(){ 
return null; 
}
}

