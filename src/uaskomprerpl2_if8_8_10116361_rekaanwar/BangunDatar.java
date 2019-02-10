/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaskomprerpl2_if8_8_10116361_rekaanwar;

/**
 *
 * @author RSA
 * HARI/TANGGAL : Kamis, 7 Februari 2019

NO SOAL : 8

KELAS : IF8

NIM : 10110269

NAMA : RIZKI ADAM KURNIAWAN

 */
public class BangunDatar {

    /**
     * @param args the command line arguments
     */
        private int luas,sisi,panjang,lebar,Persegi,PersegiPanjang,hitungLuasP,hitungLuasPp;
        public void setSisi(int sisi){
            this.sisi = sisi;
        }
        public void setPanjang(int panjang){
            this.panjang = panjang;
        }
        public void setLebar(int lebar){
            this.lebar = lebar;
        }
        public void sethitungLuasP(int hitungLuasP){
            hitungLuasP = sisi*sisi;
            this.hitungLuasP = hitungLuasP;
        }
        public void sethitungLuasPp(int hitungLuasPp){
            hitungLuasPp = panjang*lebar;
            this.hitungLuasPp = hitungLuasPp;
        }
     
        
        public int getSisi(){
            return this.sisi;
        }
        public int getPanjang(){
            return this.panjang;
        }
        public int getLebar(){
            return this.lebar;
        }
        public int gethitungLuasP(){
            Persegi = sisi * sisi;
            return this.Persegi;
        }
        public int gethitungLuasPp(){
            PersegiPanjang = panjang * lebar;
            return this.PersegiPanjang;
        }     
                
    public static void main(String[] args) {
        // TODO code application logic here
        BangunDatar reka = new BangunDatar();
        int luas,sisi,panjang,lebar,Persegi,PersegiPanjang,hitungLuasP,hitungLuasPp;
        reka.setSisi(6);
        reka.setPanjang(5);
        reka.setLebar(7);
        System.out.println("Luas Persegi ="+reka.gethitungLuasP());
        System.out.println("Luas Persegi Panjang ="+reka.gethitungLuasPp());
    }
    
}
