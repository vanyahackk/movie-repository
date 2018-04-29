package com.mycompany.mavenproject3.controller;
import com.mycompany.mavenproject3.dao.type.Reviews; 
import com.mycompany.mavenproject3.service.interfaces.ReviewsService;
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/getReviews") 
public class ReviewsController {
     @Autowired
     ReviewsService revcont;
@RequestMapping(value="/", method = RequestMethod.GET) 
public List<Reviews> getAll(){ 
return null; 
}
@RequestMapping
        (value="getid_reviews/idReviews",method = RequestMethod.GET) 
public Reviews getid_reviews(
        @RequestParam(value = "idReviews",required = false,defaultValue = "0") Long id){ 
return revcont.getid_reviews(id); 
} 

@RequestMapping(path = "/insert/insertId",method = RequestMethod.POST) 
public Reviews insert(@RequestBody 
        Reviews rewiews){ 
return revcont.insert(rewiews); 
} 

@RequestMapping(path = "/update/updateId",method = RequestMethod.PUT) 
public void update(@RequestBody 
        Reviews rewiews
        ){ 
 revcont.update(rewiews); 
} 

@RequestMapping(path="/deleteid_reviews/deleteId" , method = RequestMethod.DELETE) 
public void deleteid_reviews( @PathVariable("deleteId") Reviews id ){ 
revcont.deleteid_reviews(id); 
}
}