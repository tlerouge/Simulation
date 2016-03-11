/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hubanato
 */
public class ClientTest {
    
    public ClientTest() {
    }

    @Test
    public void testCreatePerson() {
        System.out.println("CreatePerson");
        Client instance = new Client();
        instance.CreatePerson();
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdatePerson() {
        System.out.println("UpdatePerson");
        int id = 0;
        Client instance = new Client();
        instance.UpdatePerson(id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDeletePerson() {
        System.out.println("DeletePerson");
        int id = 0;
        Client instance = new Client();
        instance.DeletePerson(id);
        fail("The test case is a prototype.");
    }
    
}
