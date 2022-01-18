package com.mehmetpekdemir.librarymanagementsystem.entity;


import javax.persistence.*;

@Entity
@Table(name = "clientlogin")
public class ClientLogin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clientid")
    private Integer clientid;

    @Column(name = "clientusername")
    private String clientusername;

    @Column(name = "clientpassword")
    private String clientpassword;

    @Column(name = "clientstatus")
    private int clientstatus;



    public Integer getClientid() {
        return clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    public String getClientusername() {
        return clientusername;
    }

    public void setClientusername(String clientusername) {
        this.clientusername = clientusername;
    }

    public String getClientpassword() {
        return clientpassword;
    }

    public void setClientpassword(String clientpassword) {
        this.clientpassword = clientpassword;
    }

    public int getClientstatus() {
        return clientstatus;
    }

    public void setClientstatus(int clientstatus) {
        this.clientstatus = clientstatus;
    }
}
