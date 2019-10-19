package com.e.faiagenda;

public class Contact {

    private String birth, telephone, name;

    public Contact(String birth, String telephone, String name) {
        this.birth = birth;
        this.telephone = telephone;
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {



        return  "Nombre: " + name + " - "
                +"Telefono: "+ telephone + "\n"
                +"Cumpleaños: " + birth;
    }
}
