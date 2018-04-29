package com.mycompany.mavenproject3.service.impl;

import com.mycompany.mavenproject3.dao.type.Reviews;
import com.mycompany.mavenproject3.mappers.reviewsMappers;
import com.mycompany.mavenproject3.service.interfaces.ReviewsService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional

public class ReviewsServiceimpl implements ReviewsService{
    
      @Autowired
    reviewsMappers reviesrv;

    @Override
    public Reviews getid_reviews(Long id) {
      return reviesrv.getid_reviews(id);
          
    }
    
    

    @Override
    public void update(Reviews reviews) {
            try{ 
                reviesrv.update(reviews); 
                } 
                catch(Exception exception){ 
                System.out.println("error : " + exception); 
                } 
        
    }

    @Override
    public void deleteid_reviews(Reviews id) {
            try{ 
                reviesrv.deleteid_reviews(id); 
                } 
                catch(Exception exception){ 
                System.out.println("error : " + exception); 
} 
       
    }

    @Override
    public List<Reviews> getAll() {
        return reviesrv.getAll(); 
} 
    
     @Override
    public Reviews insert(Reviews reviews) {
        return reviesrv.insert(reviews); 
       
    }
    }

   
    

