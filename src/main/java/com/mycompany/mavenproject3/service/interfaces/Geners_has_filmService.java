/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3.service.interfaces;

import com.mycompany.mavenproject3.dao.type.Films;
import com.mycompany.mavenproject3.dao.type.Geners_has_film;
import java.util.List;

/**
 *
 * @author PC
 */
public interface Geners_has_filmService {
         /** Возвращает объект соответствующий записи с первичным ключом key или null 
* @param id 
* @return */ 
public Geners_has_film  getid_gener( Long id); 

/** Сохраняет состояние объекта group в базе данных 
* @param geners_has_film */ 
public void update(Geners_has_film geners_has_film); 

/** Удаляет запись об объекте из базы данных 
* @param id */ 
public void deleteid_gener(Geners_has_film id); 

 


    /** Возвращает объект соответствующий записи с первичным ключом key или null 
* @param id 
* @return */ 
    public Geners_has_film getid_films(Long id); 

    /** Сохраняет состояние объекта group в базе данных 
    * @param films */ 
        public void update(Films films); 

        /** Удаляет запись об объекте из базы данных 
        * @param id */ 
        
              /**
* @param geners_has_film 
* @return */ 
public Geners_has_film insert(Geners_has_film geners_has_film);

    /**
     *
     * @param id
     */
    public void deleteid_films(Films id); 
            /** Возвращает список объектов соответствующих всем записям в базе данных 
            * @return */ 
                public List<Geners_has_film> getAll();  

    /**
     *
     * @param films
     * @return
     */
    public Geners_has_film insert(Films films);
}
    

