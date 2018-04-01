package com.mycompany.mavenproject3.mappers;


import com.mycompany.mavenproject3.dao.type.Films;
import com.mycompany.mavenproject3.dao.type.Geners_has_film;
import java.util.List;

public interface genersHasFilmMappers {
     /** Возвращает объект соответствующий записи с первичным ключом key или null 
* @param id 
* @return */ 
public Geners_has_film  getid_gener(Long id); 

/** Сохраняет состояние объекта group в базе данных 
* @param geners_has_film 
* return */
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
* @param films 
* @return */ 
public Geners_has_film insert(Films films);


            public void deleteid_films(Films id); 
            /** Возвращает список объектов соответствующих всем записям в базе данных 
            * @return */ 
                public List<Geners_has_film> getAll();  

    /**
     *
     * @param geners_has_film
     * @return
     */
    public Geners_has_film insert(Geners_has_film geners_has_film);


}
