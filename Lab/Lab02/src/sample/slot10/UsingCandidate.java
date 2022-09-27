/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.slot10;

/**
 *
 * @author Nghia
 */
public class UsingCandidate {

    public static void main(String[] args) {
        Experience expCandidate = new Experience();
        expCandidate.create();
        expCandidate.display();
        expCandidate.update();
        expCandidate.display();

        Fresher expFresher = new Fresher();
        expFresher.create();
        expFresher.display();
        expFresher.update();
        expFresher.display();

        Intern expIntern = new Intern();
        expIntern.create();
        expIntern.display();
        expIntern.update();
        expIntern.display();
    }
}
