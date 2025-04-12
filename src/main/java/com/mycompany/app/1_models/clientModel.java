// Represent data structure, attributes of something 

package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Client{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String role;
    private long companyId;

    public Client(){}

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getRole(){
        return role;
    }
    public void getRole(String role){
        this.role = role;
    }

    public Long getCompany(){
        return companyId;
    }
    public void setCompany(Long companyId){
        this.companyId = companyId;
    }
}