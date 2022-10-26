package com.mycompany.account;
public class People {
    private String holderName;
    private int cpf;
    private int age;

    public People(String holderName, int cpf, int age) {
        this.holderName = holderName;
        this.cpf = cpf;
        this.age = age;
    }

    public People() {
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
