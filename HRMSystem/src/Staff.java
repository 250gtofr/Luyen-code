
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kinh
 */
public class Staff {
    private int id;
    private String name;
    private int salary;
    
    public Staff()
    {
      id=0;
      name="";
      salary=0;
    }

    public Staff(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public void inputStaff()
    {
        Scanner s=new Scanner (System.in);
        System.out.println("enter id:");
        id=s.nextInt();
        System.out.println("enter name:");
        name=s.nextLine();
        System.out.println("enter salary:");
        salary=s.nextInt();
    }
    
    public String getInfor()
    {
        return id+"-"+name+"-"+salary;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


