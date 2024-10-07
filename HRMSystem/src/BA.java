
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

//lop BA co: 4 fields: id, name, salary, domain
public class BA extends Staff{
    private String domain;
    //gan id, name, salary, domain = cai gi do
    
    public BA()
    {
//        id=0;
//        name="";
//        salary=0;
        
       super(); // goi default constructor cua lop cha de gan
       this.domain="";
    }

    public BA(int id, String name, int salary) {
        super(id, name, salary);
        this.domain=domain;
    }
    
    public void inputBA()
    {
        inputStaff(); // nhap id, name, salary
        Scanner s=new Scanner (System.in);
        System.out.println("enter domain:");
        domain=s.nextLine();
    }
    
    public String getInforBA()
    {
        return getInfor()+"-"+domain;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
