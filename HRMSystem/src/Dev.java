
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
public class Dev extends Staff {
    
    
    private String programLanguage;

    public Dev() {
        super();
        programLanguage="Java";
    }

    public Dev(int id, String name, int salary) {
        super(id, name, salary);
        this.programLanguage=programLanguage;
    }

    
    
    
    
    public void inputDev()
    {
        inputStaff();
        Scanner s=new Scanner (System.in);
        System.out.println("enter language:");
        programLanguage=s.nextLine();
    }
    
    public String getInforDev()
    {
        return getInfor()+"-"+programLanguage;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
