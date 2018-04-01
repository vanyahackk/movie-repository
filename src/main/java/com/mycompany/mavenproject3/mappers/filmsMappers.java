package com.mycompany.mavenproject3.mappers;

import com.mycompany.mavenproject3.dao.type.Films;
import java.util.List;

public interface filmsMappers {
    /** Возвращает объект соответствующий записи с первичным ключом key или null 
* @param id 
* @return */ 
public Films getid_films(Long id); 

/** Сохраняет состояние объекта group в базе данных 
* @param films */ 
public void update(Films films); 

/** Удаляет запись об объекте из базы данных 
* @param id */ 
public void deleteid_films(Films id); 
       /**
* @param films 
* @return */ 
public Films insert(Films films);


/** Возвращает список объектов соответствующих всем записям в базе данных 
* @return */ 
public List<Films> getAll();
}
