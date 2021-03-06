
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
    filmsMappers filmsrv;
      


    @Override
    public Films getid_films(Long id) {
         return  filmsrv.getid_films(id); 
          
    }

    @Override
    public void update(Films films) {
         try{ 
filmsrv.update(films); 
} 
catch(Exception exception){ 
System.out.println("error : " + exception); 
}    
    }

    @Override
    public void deleteid_films(Films id) {
          try{ 
filmsrv.deleteid_films(id); 
} 
catch(Exception exception){ 
System.out.println("error : " + exception); 
} 
    }

    @Override
    public Films insert(Films films) {
        return filmsrv.insert(films);    
    }
    @Override 
public List<Films> getAll() { 
return filmsrv.getAll(); 
} 

    
 
    
}
