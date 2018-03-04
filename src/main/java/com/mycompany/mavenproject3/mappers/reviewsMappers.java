package com.mycompany.mavenproject3.mappers;

import com.mycompany.mavenproject3.dao.type.Reviews;
import java.util.List;

public interface reviewsMappers {
/** Возвращает объект соответствующий записи с первичным ключом key или null 
* @param id 
* @return */ 
public Reviews getid_reviews(Long id); 

/** Сохраняет состояние объекта group в базе данных 
* @param id */ 
public void update(Reviews id); 

/** Удаляет запись об объекте из базы данных 
* @param id */ 
public void deleteid_reviews(Reviews id); 

/** Возвращает список объектов соответствующих всем записям в базе данных 
* @return */ 
public List<Reviews> getAll();    
}
