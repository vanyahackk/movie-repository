
package com.mycompany.mavenproject3.service.impl;

import com.mycompany.mavenproject3.dao.type.Films;
import com.mycompany.mavenproject3.dao.type.Geners_has_film;
import com.mycompany.mavenproject3.mappers.genersHasFilmMappers;
import com.mycompany.mavenproject3.service.interfaces.Geners_has_filmService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional

public  class Geners_has_filmServiceimpl implements Geners_has_filmService {
          @Autowired
    genersHasFilmMappers eee;
      
    @Override
    public Geners_has_film getid_films(Long id) {
         return  eee.getid_gener(id); 
          
    }

    @Override
    public Geners_has_film getid_gener(Long id) {
         return  eee.getid_gener(id); 
          
    }

    
    
    
    @Override
    public void update(Geners_has_film geners_has_film) {
         try{ 
eee.update(geners_has_film); 
} 
catch(Exception exception){ 
System.out.println("error : " + exception); 
}    
    }
        @Override
    public void update(Films films) {
         try{ 
eee.update(films); 
} 
catch(Exception exception){ 
System.out.println("error : " + exception); 
}  
    }  
    
    
    @Override
    public void deleteid_films(Films id) {
          try{ 
eee.deleteid_films(id); 
} 
catch(Exception exception){ 
System.out.println("error : " + exception); 
} 
    }
        @Override
    public void deleteid_gener(Geners_has_film id) {
          try{ 
eee.deleteid_gener(id); 
}   
catch(Exception exception){ 
System.out.println("error : " + exception); 
} 
    }

    @Override
    public  Geners_has_film insert(Geners_has_film geners_has_film) {
        return eee.insert(geners_has_film);    
    }
    
            @Override
    public  Geners_has_film insert(Films films) {
        return eee.insert(films);    
    }
    @Override 
public List<Geners_has_film> getAll() { 
return eee.getAll(); 
} 

  
    }
    



    

