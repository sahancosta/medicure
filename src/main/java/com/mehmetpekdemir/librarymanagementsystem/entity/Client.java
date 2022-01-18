package com.mehmetpekdemir.librarymanagementsystem.entity;


import javax.persistence.*;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idclient")
    private Integer idclient;

    @Column(name = "cname")
    private String cname;

    @Column(name = "cemail")
    private String cemail;

    @Column(name = "caddress")
    private String caddress;

    @OneToOne(targetEntity = ClientLogin.class,cascade =  CascadeType.ALL)
    @JoinColumn(name = "idclient" , referencedColumnName = "clientid" )
    private ClientLogin clientLogin;

    public Integer getIdclient() {
        return idclient;
    }

    public void setIdclient(Integer idclient) {
        this.idclient = idclient;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCemail() {
        return cemail;
    }

    public void setCemail(String cemail) {
        this.cemail = cemail;
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress;
    }

    public ClientLogin getClientLogin() {
        return clientLogin;
    }

    public void setClientLogin(ClientLogin clientLogin) {
        this.clientLogin = clientLogin;
    }
}
