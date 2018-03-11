
package com.mycompany.mavenproject3.controller;
import com.mycompany.mavenproject3.dao.type.Geners; 
import java.util.List; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/") 
public class GenersController {
@RequestMapping(value="getGeners", method = RequestMethod.GET) 
public List<Geners> getAll(){ 
return null; 
}
}
    

