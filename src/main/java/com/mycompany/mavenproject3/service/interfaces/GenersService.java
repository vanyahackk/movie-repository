package com.mycompany.mavenproject3.service.interfaces;

import com.mycompany.mavenproject3.dao.type.Geners;
import java.util.List;

public interface GenersService {

  
    
/** Возвращает объект соответствующий записи с первичным ключом key или null 
* @param id 
* @return */ 
public Geners getid_geners(Long id); 

/** Сохраняет состояние объекта group в базе данных 
* @param geners */ 
public void update(Geners geners); 

/** Удаляет запись об объекте из базы данных 
* @param id */ 
public void deleteid_geners(Geners id); 

        /**
         *
         * @param geners
         * @return
         */
        public Geners insert(Geners geners);

/** Возвращает список объектов соответствующих всем записям в базе данных 
* @return */ 
public List<Geners> getAll();    
    }
    

