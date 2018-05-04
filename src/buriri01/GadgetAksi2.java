/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buriri01;

/**
 *
 * @author Buriri
 */
public class GadgetAksi2 {
     public static void main(String[] args) {
         Gadget Tablet = new Gadget();
         
         Tablet.merk="Lenovo";
         Tablet.warna="Putih";
         Tablet.tahun="2018";
         Tablet.ukuran="8 inci";
         Tablet.harga="2Juta";
         
         Tablet.cetakInfo();
}
}