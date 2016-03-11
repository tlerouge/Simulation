/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;

/**
 *
 * @author hubanato
 */
public abstract class Person {
    private int idPerson;
    private int idFunction;
    private Address adresse;
    private String firstName;
    private String name;
    private String sex;
    private String birthDate;
    private String birthPlace;
    private String nationality;
    private String phoneHome;
    private String phoneNumber;
    private String phoneBusiness;
    private String email;
    private String job;
    
    /**
     * This method is used to create a person
     */  
    public abstract void CreatePerson();
    /**
     * This method permit to update the information about one person using his id (idPerson)
     * @param id
     */
    public abstract void UpdatePerson(int id);
    /**
     * This method is used to delete a person using his id (idPerson)
     * @param id
     */
    public abstract void DeletePerson(int id);
}
