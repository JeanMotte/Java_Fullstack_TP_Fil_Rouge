package tp_group.tp_fil_rouge.controller;

import lombok.Data;

@Data
public class Programmer {
    private Integer id;
    private String lastName;
    private String firstName;
    private String adress;
    private String languageExpertise;
    private String favBook;


    public Programmer(Integer id, String lastName, String firstName, String adress, String languageExpertise, String favBook, Double wage) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.adress = adress;
        this.languageExpertise = languageExpertise;
        this.favBook = favBook;
        this.wage = wage;
    }

    public Double getWage() {
        return wage;
    }

    public void setWage(Double wage) {
        this.wage = wage;
    }

    public String getFavBook() {
        return favBook;
    }

    public void setFavBook(String favBook) {
        this.favBook = favBook;
    }

    public String getLanguageExpertise() {
        return languageExpertise;
    }

    public void setLanguageExpertise(String languageExpertise) {
        this.languageExpertise = languageExpertise;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private Double wage;

    public Programmer() {
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "id:" + id +
                "name:" + firstName +
                "}";
    }

}
