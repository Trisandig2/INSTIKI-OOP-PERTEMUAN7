/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan07;

/**
 *
 * @author Trisandi
 * TGL:29-04-2025
 */
public class mahasiswa {
    private String NIM,NAMA;
    
    public void datamhs(){
        System.out.println("menampilkan data mahasiswa");
        
    }
public void datamhs(String nNIM){
    this.NIM=nNIM;
    System.out.printf ("data mahasiswa dengan NIM%S",this.NIM);
    
    
}
    public void datamhs(String nNIM,String nNAMA){
        this.NIM=nNIM;
        this.NAMA=nNAMA;
        System.out.printf ("data mahasiswa dengan NIM %S\n",this.NIM,this.NAMA);
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void datamhs(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void datamhs(String string, String trisandi_Goser) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
