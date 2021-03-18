package com.example.employee_listview;

public class Employee {
    private int imgAva;
    private String infor;
    private boolean gender;

    public Employee(int imgAva, String infor, boolean gender) {
        this.imgAva = imgAva;
        this.infor = infor;
        this.gender = gender;
    }

    public int getImgAva() {
        return imgAva;
    }

    public void setImgAva(int imgAva) {
        this.imgAva = imgAva;
    }

    public String getInfor() {
        return infor;
    }

    public void setInfor(String infor) {
        this.infor = infor;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
