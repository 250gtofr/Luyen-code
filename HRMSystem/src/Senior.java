
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
public class Senior extends Dev {
    private boolean isfullstack;
    public Senior()
    {
        super(); //consructor cua DEV
        isfullstack=false;
                
    }

    public Senior(int id, String name, int salary) {
        super(id, name, salary);
    }

    public boolean isIsfullstack() {
        return isfullstack;
    }

    public void setIsfullstack(boolean isfullstack) {
        this.isfullstack = isfullstack;
    }
    
    public void inputSenior()
    {
        inputDev();
        Scanner s=new Scanner(System.in);
        System.out.println("enter isfullstact(true/false):");
        isfullstack=s.nextBoolean();
    }
    
    public String getInforSenior()
    {
        return getInforDev()+"-"+isfullstack;
    }
    
    
    
    
    
    
    
    
    
    
}
