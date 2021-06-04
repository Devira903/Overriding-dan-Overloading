/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study.kasus.pkg1;


public class StudyKasus1 {
    public void penjumlahan (int a, int b){
        System.out.println(a + b);
    }
    public void penjumlahan (int a, int b, int c){
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
       StudyKasus1 tambah = new StudyKasus1();
       System.out.println("Hasil Penjumlahan");
       System.out.println("-----------------");
       tambah.penjumlahan(200, 250);
       tambah.penjumlahan(100, 300, 900);
    }
    
}
