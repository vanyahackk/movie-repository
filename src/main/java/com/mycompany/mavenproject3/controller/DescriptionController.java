
package com.mycompany.mavenproject3.controller;
import com.mycompany.mavenproject3.dao.type.Description; 
import java.util.List; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/") 
public class DescriptionController { 
@RequestMapping(value="getDescription", method = RequestMethod.GET) 
public List<Description> getAll(){ 
return null; 
}
}