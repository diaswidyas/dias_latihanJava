/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kondisiIf;

/**
 *
 * @author user
 */
public class IfElseAksi {
    public static void main(String[] args){
        
    //pembuatan objek baru dari class IfElseClass();
    IfElseClass ifclass=new IfElseClass();
    
    ifclass.setInputData();
    ifclass.getKeterangan();
      System.out.println("Hasil Akhir");
      System.out.println("========================================================");
      System.out.println("Nama Siswa                  :"+ifclass.nama);
      System.out.println("Nilai Akhir Yang di dapat   :"+ifclass.nilAkhir);
      System.out.println("Keterangan                  :"+ifclass.getKeterangan());
      System.out.println("========================================================");
    
    }
}    

