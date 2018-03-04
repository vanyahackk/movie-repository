package com.mycompany.mavenproject3.mappers;

import com.mycompany.mavenproject3.dao.type.Geners;
import java.util.List;

public interface genersMappers {
/** Возвращает объект соответствующий записи с первичным ключом key или null 
* @param id 
* @return */ 
public Geners getid_geners(Long id); 

/** Сохраняет состояние объекта group в базе данных 
* @param id */ 
public void update(Geners id); 

/** Удаляет запись об объекте из базы данных 
* @param id */ 
public void deleteid_geners(Geners id); 

/** Возвращает список объектов соответствующих всем записям в базе данных 
* @return */ 
public List<Geners> getAll();    
}
