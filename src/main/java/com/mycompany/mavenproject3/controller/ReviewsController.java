package com.mycompany.mavenproject3.controller;
import com.mycompany.mavenproject3.dao.type.Reviews; 
import java.util.List; 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/getReviews") 
public class ReviewsController {
@RequestMapping(value="/", method = RequestMethod.GET) 
public List<Reviews> getAll(){ 
return null; 
}
@RequestMapping
        (value="getReviewsById/idFilms",method = RequestMethod.GET) 
public Reviews getReviewsById(
        @RequestParam(value = "idReviews",required = false,defaultValue = "0") int id){ 
return null; 
} 

@RequestMapping(path = "/insertReviewsById/insertId",method = RequestMethod.POST) 
public Reviews insertReviewsById(@PathVariable("insertId") 
        Integer insertId){ 
return null; 
} 

@RequestMapping(path = "/updateReviewsById/updateId",method = RequestMethod.PUT) 
public Reviews updateReviewsById(@PathVariable("updateId") 
        Integer updateId){ 
return null; 
} 

@RequestMapping(path="/deleteReviewsById/deleteId" , method = RequestMethod.DELETE) 
public Reviews ReviewsId( @PathVariable("deleteId") Integer deleteId ){ 
return null; 
}
}