
package com.mycompany.mavenproject3.service.interfaces;

import com.mycompany.mavenproject3.dao.type.Description;
import java.util.List;

public interface DescriptionService {

 /* @param id */ 
 public  void getid(Long id); 

/** Сохраняет состояние объекта group в базе данных 
* @param id */ 
public void update(Description id); 

/** Удаляет запись об объекте из базы данных 
* @param id */ 
public void deleteid(Description id); 

/** Возвращает список объектов соответствующих всем записям в базе данных 
* @return */ 
public List<Description> getAll();

    /**
     *
     * @param id
     * @return
     */
    public Description insert(Description id);
}
    
