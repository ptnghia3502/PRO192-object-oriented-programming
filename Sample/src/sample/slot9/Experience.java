/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.slot9;

import sample.ultis.NghiaptUtils;

/**
 *
 * @author Nghia
 */
public class Experience {
    private String id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String address;
    private String phone;
    private String email;
    private int type;
    
    private int year0fExp;
    private String proSkill;
    
    //nhap thong tin cho nhung thuoc tinh
    public void create(){
        System.out.println("Input candidate information:");
        this.id= NghiaptUtils.getString("Input ID:");
        this.firstName= NghiaptUtils.getString("Input firstName:");
        this.lastName= NghiaptUtils.getString("Input lastName:");
        this.birthDate= NghiaptUtils.getString("Input birthDate:");
        this.address= NghiaptUtils.getString("Input address:");
        this.phone= NghiaptUtils.getString("Input phone:");
        this.email= NghiaptUtils.getString("Input email:");
        this.type= 0;
        
        this.year0fExp= NghiaptUtils.getInt("Input year0fExp:", 0, 100);
        this.proSkill= NghiaptUtils.getString("Input proSkill:");
    }
    // cap nhat gia tri cua thuoc tinh, neu ko nhap gia tri moi thi giu nguyen gia tri cu
    // Khong cap nhat id
    public void update(){
        System.out.println("Update candidate information:");
       // this.id= NghiaptUtils.getString("Input ID:");
        this.firstName= NghiaptUtils.getString("Input firstName:",firstName);
        this.lastName= NghiaptUtils.getString("Input lastName:",lastName);
        this.birthDate= NghiaptUtils.getString("Input birthDate:",birthDate);
        this.address= NghiaptUtils.getString("Input address:",address);
        this.phone= NghiaptUtils.getString("Input phone:",phone);
        this.email= NghiaptUtils.getString("Input email:",email);
       // this.type= 0;
        
        this.year0fExp= NghiaptUtils.getInt("Input year0fExp:", 0, 100,year0fExp);
        this.proSkill= NghiaptUtils.getString("Input proSkill:",proSkill);
    }
    
    public void display(){
        System.out.print("id=" + id + ", firstName=" + firstName + ", lastName=" + lastName 
                + ", birthDate=" + birthDate + ", address=" + address + ", phone=" + phone 
                + ", email=" + email );
        System.out.print(", type=" + type + ", year0fExp=" + year0fExp + ", proSkill=" + proSkill + '}');
    }
    
    public void delete(){
        
    }
    public void search(){
        
    }
    
    public Experience() {
    }

    public Experience(String id, String firstName, String lastName, String birthDate, String address, String phone, String email, int type, int year0fExp, String proSkill) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.type = type;
        this.year0fExp = year0fExp;
        this.proSkill = proSkill;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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
