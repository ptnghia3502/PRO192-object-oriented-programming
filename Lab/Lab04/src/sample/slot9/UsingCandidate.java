/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.slot9;

/**
 *
 * @author Nghia
 */
public class UsingCandidate {
    public static void main(String[] args){
        Experience expCandidate = new Experience();
        expCandidate.create();
       // System.out.println("ID:"+ expCandidate.getId()+",firstName="+ expCandidate.getFirstName()+....);
        expCandidate.display();
        expCandidate.update();
        expCandidate.display();
    }
}
