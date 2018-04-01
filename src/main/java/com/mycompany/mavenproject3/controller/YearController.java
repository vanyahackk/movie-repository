package com.mycompany.mavenproject3.controller;
import com.mycompany.mavenproject3.dao.type.Year; 
import com.mycompany.mavenproject3.service.interfaces.YearService;
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/getYear") 
public class YearController {
    @Autowired
    YearService qqq;
@RequestMapping(value="/", method = RequestMethod.GET) 
public List<Year> getAll(){ 
return null; 
}
@RequestMapping
        (value="getid_year/idYear",method = RequestMethod.GET) 
public Year getid_year(
        @RequestParam(value = "idYear",required = false,defaultValue = "0") Long id){ 
return qqq.getid_year(id); 
} 

@RequestMapping(path = "/insert/insertId",method = RequestMethod.POST) 
public Year insert(@RequestBody  
        Year year){ 
return qqq.insert(year); 
} 

@RequestMapping(path = "/update/updateId",method = RequestMethod.PUT) 
public void update(@RequestBody  
        Year year){ 
qqq.update(year); 
} 

@RequestMapping(path="/deleteid_year/deleteId" , method = RequestMethod.DELETE) 
public void deleteid_year( @PathVariable("deleteId") Year id ){ 
qqq.deleteid_year(id); 
}
}
