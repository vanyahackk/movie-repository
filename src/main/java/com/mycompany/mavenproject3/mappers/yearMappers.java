package com.mycompany.mavenproject3.mappers;

import com.mycompany.mavenproject3.dao.type.Year;
import java.util.List;

public interface yearMappers {
 /** Возвращает объект соответствующий записи с первичным ключом key или null 
* @param id 
* @return */ 
public Year getid_year(Long id); 

/** Сохраняет состояние объекта group в базе данных 
* @param id */ 
public void update(Year id); 

/** Удаляет запись об объекте из базы данных 
* @param id */ 
public void deleteid_year(Year id); 

/** Возвращает список объектов соответствующих всем записям в базе данных 
* @return */ 
public List<Year> getAll();   
}
