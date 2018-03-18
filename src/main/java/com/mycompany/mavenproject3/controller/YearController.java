package com.mycompany.mavenproject3.controller;
import com.mycompany.mavenproject3.dao.type.Year; 
import java.util.List; 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/getYear") 
public class YearController {
@RequestMapping(value="/", method = RequestMethod.GET) 
public List<Year> getAll(){ 
return null; 
}
@RequestMapping
        (value="getYearById/idFilms",method = RequestMethod.GET) 
public Year getYearById(
        @RequestParam(value = "idYear",required = false,defaultValue = "0") int id){ 
return null; 
} 

@RequestMapping(path = "/insertYearById/insertId",method = RequestMethod.POST) 
public Year insertYearById(@PathVariable("insertId") 
        Integer insertId){ 
return null; 
} 

@RequestMapping(path = "/updateYearById/updateId",method = RequestMethod.PUT) 
public Year updateYearById(@PathVariable("updateId") 
        Integer updateId){ 
return null; 
} 

@RequestMapping(path="/deleteYearById/deleteId" , method = RequestMethod.DELETE) 
public Year YearId( @PathVariable("deleteId") Integer deleteId ){ 
return null; 
}
}
