package com.example.keltron_exam;

public class Students {

    String name;
    String email;
    String className;
    String phone;
    String fatherName;

    public Students(String name, String email, String className, String mobile, String fatherName) {
        this.name = name;
        this.email = email;
        this.className = className;
        this.phone = mobile;
        this.fatherName = fatherName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}

