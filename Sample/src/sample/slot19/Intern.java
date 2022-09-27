/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.slot19;

import sample.slot10.*;
import sample.ultis.NghiaptUtils;

/**
 *
 * @author Nghia
 */
public class Intern extends Candidate {

    //3 thuoc tinh rieng: major, semester, universityname
    // constuctors
    // getter/ setter
    //3 methods
    private String major;
    private int semester;
    private String univerName;

    public Intern() {
    }

    public Intern(String major, int semester, String univerName) {
        this.major = major;
        this.semester = semester;
        this.univerName = univerName;
    }

    public Intern(String major, int semester, String univerName, String id, String firstName, String lastName, String birthDate, String address, String phone, String email, int type) {
        super(id, firstName, lastName, birthDate, address, phone, email, type);
        this.major = major;
        this.semester = semester;
        this.univerName = univerName;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(", major: " + major + ", semester: " + semester + ", univerName: " + univerName);
    }

    @Override
    public void update() {
        super.update();
        this.major = NghiaptUtils.getString("Input your major: ", major);
        this.semester = NghiaptUtils.getInt("Input your semester: ", 0, 100, semester);
        this.univerName = NghiaptUtils.getString("Input your univerName: ", univerName);
    }

    @Override
    public void create() {
        super.create();
        this.major = NghiaptUtils.getString("Input your major: ");
        this.semester = NghiaptUtils.getInt("Input your semester: ", 0, 100);
        this.univerName = NghiaptUtils.getString("Input your univerName: ");
        super.setType(2);
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniverName() {
        return univerName;
    }

    public void setUniverName(String univerName) {
        this.univerName = univerName;
    }

}
