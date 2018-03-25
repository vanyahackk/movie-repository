package com.mycompany.mavenproject3.dao.type;
public class Reviews {
    private int id_reviews;
    private int id_films;
    private boolean bad_good;

    /**
     *
     * @return
     */
    public boolean isbad_good() {
        return bad_good;
    }

    /**
     *
     * @param bad_good
     */
    public void setbad_good(boolean bad_good) {
        this.bad_good = bad_good;
    }
   
    /**
     *
     * @param id_reviews
     */
    public void setid_reviews(int id_reviews){
        this.id_reviews=id_reviews;
    }
   
    /**
     *
     * @return
     */
    public int getid_reviews(){
    return id_reviews;    
    }
    
    /**
     *
     * @param id_films
     */
    public void setid_films(int id_films) {
        this.id_films = id_films;
    }

    /**
     *
     * @return
     */
    public int getid_films() {
        return id_films;
    }
 
     
}
