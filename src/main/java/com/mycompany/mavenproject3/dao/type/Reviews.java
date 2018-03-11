package com.mycompany.mavenproject3.dao.type;
public class Reviews {
    private int id_reviews;
    private int id_films;
    private boolean bad_good;

    public boolean isBad_good() {
        return bad_good;
    }

    public void setBad_good(boolean bad_good) {
        this.bad_good = bad_good;
    }
   
    public void setid_reviews(int id_reviews){
        this.id_reviews=id_reviews;
    }
   
    public int getid_reviews(){
    return id_reviews;    
    }
    
 public void setId_films(int id_films) {
        this.id_films = id_films;
    }

    public int getId_films() {
        return id_films;
    }
 
     
}
