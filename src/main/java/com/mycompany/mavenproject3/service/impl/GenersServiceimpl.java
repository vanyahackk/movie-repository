
package com.mycompany.mavenproject3.service.impl;

import com.mycompany.mavenproject3.dao.type.Geners;
import com.mycompany.mavenproject3.service.interfaces.GenersService;
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
public Geners insert(Geners id) { 
return xxx.insert(id);      
}
    @Override
    public void update(Geners id) {
         try{ 
xxx.update(id); 
} 
catch(Exception exception){ 
System.out.println("error : " + exception); 
}    
    }
    

    
}
