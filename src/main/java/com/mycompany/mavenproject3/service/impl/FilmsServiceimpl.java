
package com.mycompany.mavenproject3.service.impl;

import com.mycompany.mavenproject3.dao.type.Films;
import com.mycompany.mavenproject3.mappers.filmsMappers;
import com.mycompany.mavenproject3.service.interfaces.FilmsService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional

/**
 *
 * @author PC
 */
public  class FilmsServiceimpl implements FilmsService {
      @Autowired
    filmsMappers ggg;
      


    @Override
    public Films getid_films(Long id) {
         return  ggg.getid_films(id); 
          
    }

    @Override
    public void update(Films id) {
         try{ 
ggg.update(id); 
} 
catch(Exception exception){ 
System.out.println("error : " + exception); 
}    
    }

    @Override
    public void deleteid_films(Films id) {
          try{ 
ggg.deleteid_films(id); 
} 
catch(Exception exception){ 
System.out.println("error : " + exception); 
} 
    }

    @Override
    public Films insert(Films id) {
        return ggg.insert(id);    
    }
    @Override 
public List<Films> getAll() { 
return ggg.getAll(); 
} 

    
 
    
}
