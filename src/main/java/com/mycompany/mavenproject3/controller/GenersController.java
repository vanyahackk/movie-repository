
package com.mycompany.mavenproject3.controller;
import com.mycompany.mavenproject3.dao.type.Geners; 
import java.util.List; 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/getGeners") 
public class GenersController {
@RequestMapping(value="/", method = RequestMethod.GET) 
public List<Geners> getAll(){ 
return null; 
}
@RequestMapping
        (value="getGenersById/idFilms",method = RequestMethod.GET) 
public Geners getGenersById(
        @RequestParam(value = "idGeners",required = false,defaultValue = "0") int id){ 
return null; 
} 

@RequestMapping(path = "/insertGenersById/insertId",method = RequestMethod.POST) 
public Geners insertGenersById(@PathVariable("insertId") 
        Integer insertId){ 
return null; 
} 

@RequestMapping(path = "/updateGenersById/updateId",method = RequestMethod.PUT) 
public Geners updateGenersById(@PathVariable("updateId") 
        Integer updateId){ 
return null; 
} 

@RequestMapping(path="/deleteGenersById/deleteId" , method = RequestMethod.DELETE) 
public Geners GenersById( @PathVariable("deleteId") Integer deleteId ){ 
return null; 
}
}

    

