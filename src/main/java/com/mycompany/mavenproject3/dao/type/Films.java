/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3.dao.type;

/**
 *
 * @author PC
 */
public class Films {
 private int id_films;
 private String name_films;

    public int getid_films() {
        return id_films;
    }

    /**
     *
     * @param id
     * @return
     */
    public String getname_films(Films id) {
        return name_films;
    }

    public void setid_films(int id_films) {
        this.id_films = id_films;
    }

    public void setname_films(String name) {
        this.name_films = name;
    }
 
}
