
package com.mycompany.mavenproject3.controller;
import com.mycompany.mavenproject3.dao.type.Description; 
import com.mycompany.mavenproject3.service.interfaces.DescriptionService;
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/getDescription") 
public class DescriptionController { 
     @Autowired
    DescriptionService rrr;
@RequestMapping(value="/", method = RequestMethod.GET) 
public List<Description> getAll(){ 
return rrr.getAll(); 
}
@RequestMapping
        (value="getid/idDescription",method = RequestMethod.GET) 
public void getid(
        @RequestParam(value = "idDescription",required = false,defaultValue = "0") Long id){ 
 rrr.getid(id);
} 

@RequestMapping(path = "/insert/insertId",method = RequestMethod.POST) 
public Description insert(@RequestBody Description description) 
        { 
return rrr.insert(description); 
} 

@RequestMapping(path = "/update/updateid",method = RequestMethod.PUT) 
public void update(@RequestBody Description description) 
        { 
rrr.update(description);
} 

@RequestMapping(path="/deleteid/deleteId" , method = RequestMethod.DELETE) 
public void deleteid( @PathVariable("deleteId") Description id){ 
 rrr.deleteid(id); 
         

}
}