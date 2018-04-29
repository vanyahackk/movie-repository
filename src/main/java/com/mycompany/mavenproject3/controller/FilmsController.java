package com.mycompany.mavenproject3.controller;
import com.mycompany.mavenproject3.dao.type.Films; 
import com.mycompany.mavenproject3.service.interfaces.FilmsService;
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/getFilms")    
public class FilmsController {
         @Autowired
    FilmsService filmcont;
    @RequestMapping(value="/", method = RequestMethod.GET) 
public List<Films> getAll(){ 
return null; 
}
@RequestMapping
        (value="getid_films/id_films",method = RequestMethod.GET) 
public Films getid_films(
        @RequestParam(value = "id_films",required = false,defaultValue = "0") Long id){ 
return filmcont.getid_films(id); 
} 

@RequestMapping(path = "/insert/insertId",method = RequestMethod.POST) 
public Films insert(@RequestBody Films films 
         ){ 
return filmcont.insert(films); 
             
             
} 

@RequestMapping(path = "/update/updateId",method = RequestMethod.PUT) 
public void update(@RequestBody Films films  
         ){ 
 filmcont.update(films); 
             
} 

@RequestMapping(path="/deleteid_films/deleteId" , method = RequestMethod.DELETE) 
public void deleteid_films( @PathVariable("deleteId") Films id ){ 
filmcont.deleteid_films(id); 
}
}

