
package com.mycompany.mavenproject3.controller;
import com.mycompany.mavenproject3.dao.type.Description; 
import java.util.List; 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/getDescription") 
public class DescriptionController { 
@RequestMapping(value="/", method = RequestMethod.GET) 
public List<Description> getAll(){ 
return null; 
}
@RequestMapping
        (value="getById/idDescription",method = RequestMethod.GET) 
public Description getDescriptionById(
        @RequestParam(value = "idDescription",required = false,defaultValue = "0") int id){ 
return null; 
} 

@RequestMapping(path = "/insertDescriptionById/insertId",method = RequestMethod.POST) 
public Description insertDescriptionById(@PathVariable("insertId") 
        Integer insertId){ 
return null; 
} 

@RequestMapping(path = "/updateDescriptionById/updateId",method = RequestMethod.PUT) 
public Description updateDescriptionById(@PathVariable("updateId") 
        Integer updateId){ 
return null; 
} 

@RequestMapping(path="/deleteDescriptionById/deleteId" , method = RequestMethod.DELETE) 
public Description DescriptionById( @PathVariable("deleteId") Integer deleteId ){ 
return null; 
}
}