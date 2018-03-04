package com.mycompany.mavenproject3.dao.type;
public class Reviews {
    private int id_reviews;
    private String bad;
    private String good;
    public void setid_reviews(int id_reviews){
        this.id_reviews=id_reviews;
    }
    public void setbad(String bad){
        this.bad = bad;
    }
    public void setgood(String good){
        this.good = good;
    }
    public int getid_reviews(){
    return id_reviews;    
    }
     public String getbad(){
         return bad;
     }

    public String getGood() {
        return good;
    }

 
     
}
