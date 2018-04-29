
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
    genersHasFilmMappers gnrhasflm;
      
    @Override
    public Geners_has_film getid_films(Long id) {
         return  gnrhasflm.getid_gener(id); 
          
    }

    @Override
    public Geners_has_film getid_gener(Long id) {
         return  gnrhasflm.getid_gener(id); 
          
    }

    
    
    
    @Override
    public void update(Geners_has_film geners_has_film) {
         try{ 
gnrhasflm.update(geners_has_film); 
} 
catch(Exception exception){ 
System.out.println("error : " + exception); 
}    
    }
        @Override
    public void update(Films films) {
         try{ 
gnrhasflm.update(films); 
} 
catch(Exception exception){ 
System.out.println("error : " + exception); 
}  
    }  
    
    
    @Override
    public void deleteid_films(Films id) {
          try{ 
gnrhasflm.deleteid_films(id); 
} 
catch(Exception exception){ 
System.out.println("error : " + exception); 
} 
    }
        @Override
    public void deleteid_gener(Geners_has_film id) {
          try{ 
gnrhasflm.deleteid_gener(id); 
}   
catch(Exception exception){ 
System.out.println("error : " + exception); 
} 
    }

    @Override
    public  Geners_has_film insert(Geners_has_film geners_has_film) {
        return gnrhasflm.insert(geners_has_film);    
    }
    
            @Override
    public  Geners_has_film insert(Films films) {
        return gnrhasflm.insert(films);    
    }
    @Override 
public List<Geners_has_film> getAll() { 
return gnrhasflm.getAll(); 
} 

  
    }
    



    

