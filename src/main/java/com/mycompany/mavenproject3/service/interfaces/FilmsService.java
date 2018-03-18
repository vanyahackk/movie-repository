/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3.service.interfaces;

import com.mycompany.mavenproject3.dao.type.Films;
import java.util.List;

/**
 *
 * @author PC
 */
public interface FilmsService {
        /** Возвращает объект соответствующий записи с первичным ключом key или null 
* @param id 
* @return */ 
public Films getid_films(Long id); 

/** Сохраняет состояние объекта group в базе данных 
* @param id */ 
public void update(Films id); 

/** Удаляет запись об объекте из базы данных 
* @param id */ 
public void deleteid_films(Films id); 
       /**
* @param id 
* @return */ 
public Films insert(Films id);

/** Возвращает список объектов соответствующих всем записям в базе данных 
* @return */ 
public List<Films> getAll();
}
    

