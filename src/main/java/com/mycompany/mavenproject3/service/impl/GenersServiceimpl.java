
package com.mycompany.mavenproject3.service.impl;

import com.mycompany.mavenproject3.dao.type.Geners;
import com.mycompany.mavenproject3.mappers.genersMappers;
import com.mycompany.mavenproject3.service.interfaces.GenersService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class GenersServiceimpl implements GenersService{
              @Autowired
    genersMappers xxx;
                            
    @Override
    public Geners getid_geners(Long id)  {
         return xxx.getid_geners(id); 
          
    }
      @Override 
public Geners insert(Geners geners) { 
return xxx.insert(geners);      
}
    @Override
    public void update(Geners geners) {
         try{ 
xxx.update(geners); 
} 
catch(Exception exception){ 
System.out.println("error : " + exception); 
}    
    }

    @Override
    public void deleteid_geners(Geners id) {
                 try{ 
xxx.deleteid_geners(id); 
} 
catch(Exception exception){ 
System.out.println("error : " + exception); 
} 
    }

    @Override
    public List<Geners> getAll() {
    return xxx.getAll(); 
} 
    
    
    }
    

    

