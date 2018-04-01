
package com.mycompany.mavenproject3.service.impl;
import com.mycompany.mavenproject3.mappers.yearMappers;
import com.mycompany.mavenproject3.dao.type.Year;
import com.mycompany.mavenproject3.service.interfaces.YearService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional

public class YearServiceimpl implements YearService {
    
      @Autowired
     yearMappers www;
      
     @Override
    public Year getid_year(Long id) {
      return  www.getid_year(id);
    }
    
    

    @Override
    public void update(Year year) {
            try{ 
                www.update(year); 
                } 
                catch(Exception exception){ 
                System.out.println("error : " + exception); 
                } 
        
    }

    @Override
    public void deleteid_year(Year id) {
            try{ 
                www.deleteid_year(id); 
                } 
                catch(Exception exception){ 
                System.out.println("error : " + exception); 
} 
       
    }

    @Override
    public List<Year> getAll() {
        return www.getAll(); 
} 
    
     @Override
     public Year insert(Year year){
        return www.insert(year); 
       
    }
}


