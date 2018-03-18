package com.mycompany.mavenproject3.controller;
import com.mycompany.mavenproject3.dao.type.Films; 
import java.util.List; 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/getFilms")    
public class FilmsController {
    @RequestMapping(value="/", method = RequestMethod.GET) 
public List<Films> getAll(){ 
return null; 
}
@RequestMapping
        (value="getFilmsById/idFilms",method = RequestMethod.GET) 
public Films getFilmsById(
        @RequestParam(value = "idFilms",required = false,defaultValue = "0") int id){ 
return null; 
} 

@RequestMapping(path = "/insertFilmsById/insertId",method = RequestMethod.POST) 
public Films insertFilmsById(@PathVariable("insertId") 
        Integer insertId){ 
return null; 
} 

@RequestMapping(path = "/updateFilmsById/updateId",method = RequestMethod.PUT) 
public Films updateFilmsById(@PathVariable("updateId") 
        Integer updateId){ 
return null; 
} 

@RequestMapping(path="/deleteFilmsById/deleteId" , method = RequestMethod.DELETE) 
public Films FilmsById( @PathVariable("deleteId") Integer deleteId ){ 
return null; 
}
}

