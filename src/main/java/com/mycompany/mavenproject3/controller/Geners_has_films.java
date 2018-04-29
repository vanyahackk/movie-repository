package com.mycompany.mavenproject3.controller;
import com.mycompany.mavenproject3.dao.type.Films;
import com.mycompany.mavenproject3.dao.type.Geners_has_film; 
import com.mycompany.mavenproject3.service.interfaces.Geners_has_filmService;
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/getGeners_has_films") 
public class Geners_has_films {
    @Autowired
    Geners_has_filmService gnrflm;
@RequestMapping(value="/", method = RequestMethod.GET) 
public List<Geners_has_film> getAll(){ 
return null; 
}
@RequestMapping
        (value="getid_gener/idFilms",method = RequestMethod.GET) 
public Geners_has_film  getid_gener(
        @RequestParam(value = "idFilms",required = false,defaultValue = "0") Long id){ 
return gnrflm.getid_gener(id); 
} 

@RequestMapping
        (value="getid_films/idFilms",method = RequestMethod.GET) 
public Geners_has_film getid_films(
        @RequestParam(value = "idFilms",required = false,defaultValue = "0") Long id){ 
return gnrflm.getid_films(id); 
} 

@RequestMapping(path = "/insert/insertId",method = RequestMethod.POST) 
public Geners_has_film insert(@RequestBody  
        Films films){ 
return gnrflm.insert(films); 
} 

@RequestMapping(path = "/insert/insertId",method = RequestMethod.POST) 
public Geners_has_film insert(@RequestBody Geners_has_film geners_has_film){ 
return gnrflm.insert(geners_has_film); 
} 

@RequestMapping(path = "/update/updateId",method = RequestMethod.PUT) 
public void update(@RequestBody Films films){ 
gnrflm.update(films); 
} 

@RequestMapping(path = "/update/updateId",method = RequestMethod.PUT) 
public void update(@RequestBody Geners_has_film geners_has_film
        ){ 
gnrflm.update(geners_has_film); 
} 


@RequestMapping(path="/deleteid_gener/deleteId" , method = RequestMethod.DELETE) 
public void deleteid_gener( @PathVariable("deleteId")Geners_has_film id  ){ 
gnrflm.deleteid_gener(id); 
}

@RequestMapping(path="/deleteid_films/deleteId" , method = RequestMethod.DELETE) 
public void deleteid_films( @PathVariable("deleteId")Films id  ){ 
gnrflm.deleteid_films(id); 
}
}
    

