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
    reviewsMappers ert;

    @Override
    public void getid_reviews(Long id) {
        ert.getid_reviews(id);
    }
    
    

    @Override
    public void update(Reviews id) {
            try{ 
                ert.update(id); 
                } 
                catch(Exception exception){ 
                System.out.println("error : " + exception); 
                } 
        
    }

    @Override
    public void deleteid_reviews(Reviews id) {
            try{ 
                ert.deleteid_reviews(id); 
                } 
                catch(Exception exception){ 
                System.out.println("error : " + exception); 
} 
       
    }

    @Override
    public List<Reviews> getAll() {
        return ert.getAll(); 
} 
    
     @Override
    public Reviews insert(Reviews id) {
        return ert.insert(id); 
       
    }
    }

   
    

