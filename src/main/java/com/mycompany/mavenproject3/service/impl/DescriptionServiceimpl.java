
package com.mycompany.mavenproject3.service.impl;
import com.mycompany.mavenproject3.dao.type.Description;
import com.mycompany.mavenproject3.mappers.descriptionMappers;
import com.mycompany.mavenproject3.service.interfaces.DescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional


public  class DescriptionServiceimpl implements DescriptionService{
   

      @Autowired
    descriptionMappers rrr;
      
    @Override
    public void getid(Long id) {
         rrr.getid(id); 
    }
    @Override 
public Description insert(Description description) { 
return rrr.insert(description);      
}

    @Override 
public void update(Description description) { 
    try{ 
rrr.update(description); 
} 
catch(Exception exception){ 
System.out.println("error : " + exception); 
} 
 

} 
@Override 
public void deleteid(Description id) { 
    try{ 
rrr.deleteid(id); 
} 
catch(Exception exception){ 
System.out.println("error : " + exception); 
} 

} 
@Override 
public List<Description> getAll() { 
return rrr.getAll(); 
} 

    
 

}   

