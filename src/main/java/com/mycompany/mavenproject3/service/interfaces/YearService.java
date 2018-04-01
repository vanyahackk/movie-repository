/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3.service.interfaces;

import com.mycompany.mavenproject3.dao.type.Year;
import java.util.List;

/**
 *
 * @author PC
 */
public interface YearService {
  
 /** Возвращает объект соответствующий записи с первичным ключом key или null 
* @param id 
     * @return  */ 
public Year getid_year(Long id); 

/** Сохраняет состояние объекта group в базе данных 
* @param year */ 
public void update(Year year); 

/** Удаляет запись об объекте из базы данных 
* @param id */ 
public void deleteid_year(Year id); 

/** Возвращает список объектов соответствующих всем записям в базе данных 
* @return */ 
public List<Year> getAll(); 

    /**
     *
     * @param year
     * @return
     */
    public Year insert(Year year);
    }
    

