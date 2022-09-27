/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.slot10;

import sample.ultis.NghiaptUtils;

/**
 *
 * @author Nghia
 */
public class Fresher extends Candidate {

    //3 thuoc tinh rieng: graduation date, graduation rank, education(university)
    // constuctors
    // getter/ setter
    //3 methods: create(), update(), display()
    private int graduDate;
    private String graduRank;
    private String graduUni;

    public Fresher() {
    }

    public Fresher(int graduDate, String graduRank, String graduUni) {
        this.graduDate = graduDate;
        this.graduRank = graduRank;
        this.graduUni = graduUni;
    }

    public Fresher(int graduDate, String graduRank, String graduUni, String id, String firstName, String lastName, String birthDate, String address, String phone, String email, int type) {
        super(id, firstName, lastName, birthDate, address, phone, email, type);
        this.graduDate = graduDate;
        this.graduRank = graduRank;
        this.graduUni = graduUni;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(", graduDate: " + graduDate + ", graduRank: " + graduRank + ", graduUni: " + graduUni);
    }

    @Override
    public void update() {
        super.update();
        this.graduDate = NghiaptUtils.getInt("Input your graduDate: ", 0, 100, graduDate);
        this.graduRank = NghiaptUtils.getString("Input your graduRank: ", graduRank);
        this.graduUni = NghiaptUtils.getString("Input your graduUni: ", graduUni);
    }

    @Override
    public void create() {
        super.create();
        this.graduDate = NghiaptUtils.getInt("Input your graduDate: ", 0, 100);
        this.graduRank = NghiaptUtils.getString("Input your graduRank: ");
        this.graduUni = NghiaptUtils.getString("Input your graduUni: ");
        super.setType(1);
    }

    public int getGraduDate() {
        return graduDate;
    }

    public void setGraduDate(int graduDate) {
        this.graduDate = graduDate;
    }

    public String getGraduRank() {
        return graduRank;
    }

    public void setGraduRank(String graduRank) {
        this.graduRank = graduRank;
    }

    public String getGraduUni() {
        return graduUni;
    }

    public void setGraduUni(String graduUni) {
        this.graduUni = graduUni;
    }

}
