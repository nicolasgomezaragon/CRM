package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Company{
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Short employeesNumber;
    private String description; 
    private String industry; 

    @OneToMany(mappedBy = "company", 
               cascade = cascadadeType.ALL, 
               orphanRemoval = true) 
    private List<Employee> employees;

    public company(){};

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public Long getEmployeesNumber(){
        return employeesNumber;
    }
    public void setId(Long employeesNumber){
        this.employeesNumber = employeesNumber;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public Long getIndustry(){
        return industry;
    }
    public void setIndustry(String id){
        this.industry = industry;
    }

    public list<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(List<Employee> employees){
        this.employees = employees;
    }

}