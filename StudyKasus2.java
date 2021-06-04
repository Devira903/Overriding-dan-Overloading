/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study.kasus.pkg2;


public class StudyKasus2 {
        void BangtanBoys(){
            System.out.println("Min Yoongi");
        }
        void BangtanBoys1(){
            System.out.println("Suga");
        }
}
class subClass extends StudyKasus2{
        void BangtanBoys(){
            System.out.println("Kim Taehyung");
        }
        void BangtanBoys2(){
            System.out.println("Jong Kook");
        }
}
class Main{

    public static void main(String[] args) {
        StudyKasus2 TI= new StudyKasus2();
        subClass BC= new subClass();
        StudyKasus2 X= new subClass();
        
        TI.BangtanBoys();
        BC.BangtanBoys();
        X.BangtanBoys();
        X.BangtanBoys1();
        
    }
}
        

            
            
            
            
                
                
            
        
