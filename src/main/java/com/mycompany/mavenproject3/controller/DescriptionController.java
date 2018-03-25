
package com.mycompany.mavenproject3.controller;
import com.mycompany.mavenproject3.dao.type.Description; 
import com.mycompany.mavenproject3.mappers.descriptionMappers;
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/getDescription") 
public class DescriptionController { 
     @Autowired
    descriptionMappers rrr;
@RequestMapping(value="/", method = RequestMethod.GET) 
public List<Description> getAll(){ 
return rrr.getAll(); 
}
@RequestMapping
        (value="getid/idDescription",method = RequestMethod.GET) 
public void getid(
        @RequestParam(value = "idDescription",required = false,defaultValue = "0") Description id){ 
 rrr.update(id);
} 

@RequestMapping(path = "/insert/insertId",method = RequestMethod.POST) 
public Description insert(@PathVariable("insert") 
        Description id){ 
return rrr.insert(id); 
} 

@RequestMapping(path = "/update/updateId",method = RequestMethod.PUT) 
public void update(@PathVariable("updateid") 
        Description id){ 
rrr.update(id);
} 

@RequestMapping(path="/deleteid/deleteId" , method = RequestMethod.DELETE) 
public void deleteid( @PathVariable("deleteId") Description id){ 
 rrr.deleteid(id); 
         

}
}