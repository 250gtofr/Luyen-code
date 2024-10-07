/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kinh
 */
public class Tester extends Staff{
    private int exp;
    
    public Tester()
    {
        super();
        this.exp=5;
    }

    public Tester(int id, String name, int salary) {
        super(id, name, salary);
        this.exp=exp;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
    
    public void inputTester()
    {
        inputStaff();
    }
    
    
    public String getInforTester()
    {
        return getInfor()+"-"+exp;
    }
    
    
            
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
