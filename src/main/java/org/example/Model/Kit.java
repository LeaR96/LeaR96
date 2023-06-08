package org.example.Model;

public class Kit {
    private static Integer CONT = 0;
    private Integer id;

    public Kit (){
        CONT ++;
        id = CONT;
    }

    public Integer getId() {
        return id;
    }
}
