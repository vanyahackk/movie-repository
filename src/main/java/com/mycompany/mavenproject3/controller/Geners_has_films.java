package com.mycompany.mavenproject3.controller;
import com.mycompany.mavenproject3.dao.type.Geners_has_film; 
import java.util.List; 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/getGeners_has_films") 
public class Geners_has_films {
@RequestMapping(value="/", method = RequestMethod.GET) 
public List<Geners_has_film> getAll(){ 
return null; 
}
@RequestMapping
        (value="getGeners_has_filmsById/idFilms",method = RequestMethod.GET) 
public Geners_has_films getGeners_has_filmsById(
        @RequestParam(value = "idGeners_has_films",required = false,defaultValue = "0") int id){ 
return null; 
} 

@RequestMapping(path = "/insertGeners_has_filmsById/insertId",method = RequestMethod.POST) 
public Geners_has_films insertGeners_has_filmsById(@PathVariable("insertId") 
        Integer insertId){ 
return null; 
} 

@RequestMapping(path = "/updateGeners_has_filmsById/updateId",method = RequestMethod.PUT) 
public Geners_has_films updateGeners_has_filmsById(@PathVariable("updateId") 
        Integer updateId){ 
return null; 
} 

@RequestMapping(path="/deleteGeners_has_filmsById/deleteId" , method = RequestMethod.DELETE) 
public Geners_has_films Geners_has_filmsById( @PathVariable("deleteId") Integer deleteId ){ 
return null; 
}
}
    

