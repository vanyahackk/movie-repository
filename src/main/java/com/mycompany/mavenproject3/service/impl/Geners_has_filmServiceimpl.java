
package com.mycompany.mavenproject3.service.impl;

import com.mycompany.mavenproject3.dao.type.Films;
import com.mycompany.mavenproject3.mappers.genersHasFilmMappers;
import com.mycompany.mavenproject3.service.interfaces.Geners_has_filmService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class Geners_has_filmServiceimpl implements Geners_has_filmService {
          @Autowired
    genersHasFilmMappers eee;
      


    @Override
    public Films getid_geners(Long id) {
         return  eee.getid_geners(id); 
          
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
