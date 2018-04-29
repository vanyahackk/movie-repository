
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
    genersMappers gnrsrv;
                            
    @Override
    public Geners getid_geners(Long id)  {
         return gnrsrv.getid_geners(id); 
          
    }
      @Override 
public Geners insert(Geners geners) { 
return gnrsrv.insert(geners);      
}
    @Override
    public void update(Geners geners) {
         try{ 
gnrsrv.update(geners); 
} 
catch(Exception exception){ 
System.out.println("error : " + exception); 
}    
    }

    @Override
    public void deleteid_geners(Geners id) {
                 try{ 
gnrsrv.deleteid_geners(id); 
} 
catch(Exception exception){ 
System.out.println("error : " + exception); 
} 
    }

    @Override
    public List<Geners> getAll() {
    return gnrsrv.getAll(); 
} 
    
    
    }
    

    

