
package com.mycompany.mavenproject3.controller;
import com.mycompany.mavenproject3.dao.type.Geners; 
import com.mycompany.mavenproject3.service.interfaces.GenersService;
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/getGeners") 
public class GenersController {
             @Autowired
    GenersService rrr;
@RequestMapping(value="/", method = RequestMethod.GET) 
public List<Geners> getAll(){ 
return null; 
}
@RequestMapping
        (value="getid_geners/idFilms",method = RequestMethod.GET) 
public Geners getid_geners(
        @RequestParam(value = "idFilms",required = false,defaultValue = "0") Long id){ 
return rrr.getid_geners(id); 
} 

@RequestMapping(path = "/insert/insertId",method = RequestMethod.POST) 
public Geners insert(@RequestBody Geners geners
        ){ 
return rrr.insert(geners); 
} 

@RequestMapping(path = "/update/updateId",method = RequestMethod.PUT) 
public void update(@RequestBody Geners geners 
        ){ 
 rrr.update(geners); 
} 

@RequestMapping(path="/deleteid_geners/deleteId" , method = RequestMethod.DELETE) 
public void deleteid_geners( @PathVariable("deleteId") Geners id ){ 
rrr.deleteid_geners(id); 
}
}

    

