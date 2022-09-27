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
public class Experience extends Candidate {

    private int year0fExp;
    private String proSkill;

    @Override
    public void display() {
        super.display();
        System.out.println(", year0fExp: " + year0fExp + ", proSkill: " + proSkill);
    }

    @Override
    public void update() {
        super.update();
        this.year0fExp = NghiaptUtils.getInt("Update year0fExp: ", 0, 100, year0fExp);
        this.proSkill = NghiaptUtils.getString("Update proSkill: ", proSkill);
    }

    @Override
    public void create() {
        super.create();
        this.year0fExp = NghiaptUtils.getInt("Input year0fExp: ", 0, 100);
        this.proSkill = NghiaptUtils.getString("Input proSkill: ");
        super.setType(0);
    }

    public Experience() {
    }

    public Experience(int year0fExp, String proSkill) {
        this.year0fExp = year0fExp;
        this.proSkill = proSkill;
    }

    public Experience(int year0fExp, String proSkill, String id, String firstName, String lastName, String birthDate, String address, String phone, String email, int type) {
        super(id, firstName, lastName, birthDate, address, phone, email, type);
        this.year0fExp = year0fExp;
        this.proSkill = proSkill;
    }

    public int getYear0fExp() {
        return year0fExp;
    }

    public void setYear0fExp(int year0fExp) {
        this.year0fExp = year0fExp;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

}
