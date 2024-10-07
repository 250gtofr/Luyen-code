
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kinh
 * 
 * 
 */

/*

khi chuong trinh run, hay tao 1 object nhanvien la 1 trong 4 loai sau day: ba, tester,
senior dua tren lua chon cua user. Hay tao hay xuat infor nv cua tao
*/


public class program {
    public static void main(String[] args) {
        
        Staff st=null;
        int choice=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter choice:");
        choice=s.nextInt();
        do
        {
            System.out.println("1. Nhap BA");
            System.out.println("2. Nhap Tester");
            System.out.println("3. Nhap Fresher");
            System.out.println("4. Nhap Senior:");
            System.out.println("5. Xuat thong tin nhan vien: da nhap:");
        
        switch(choice)
        {
            case 1:
                st=new BA();
                ((BA)st).inputBA();
                break;
            case 2:
                st=new Tester();
                ((Tester)st).inputTester();
                break;
            case 3:
                st=new Fresher();
                ((Fresher)st).inputFresher();
                
            case 4:
                st=new Senior();
                ((Senior)st).inputSenior();
                
            case 5:
                if(st!=null)
                {
                    if(st instanceof BA)
                        System.out.println(((BA)st).getInforBA());
                    else if(st instanceof Tester)
                        System.out.println(((Tester)st).getInforTester());
                    else if(st instanceof Fresher)
                        System.out.println(((Fresher)st).getInforFresher());
                    else if (st instanceof Senior)
                        System.out.println(((Senior)st).getInforSenior());  
                }
                
            
        }
        
        }while(choice<=5);       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
