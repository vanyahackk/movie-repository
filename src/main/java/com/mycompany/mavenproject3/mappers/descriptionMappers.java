package com.mycompany.mavenproject3.mappers;

import com.mycompany.mavenproject3.dao.type.Description;
import java.util.List;

public interface descriptionMappers {
    /** Возвращает объект соответствующий записи с первичным ключом key или null 
* @param id */ 
public  void getid(Long id); 

/** Сохраняет состояние объекта group в базе данных 
* @param description */ 
public void update(Description description); 

/** Удаляет запись об объекте из базы данных 
* @param id */ 
public void deleteid(Description id); 

/** Возвращает список объектов соответствующих всем записям в базе данных 
* @return */ 
public List<Description> getAll();

    
    /**
     *
     * @param description
     * @return
     */
    public Description insert(Description description);

  

    

  
    
}
