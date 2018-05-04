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
public class GadgetAksi {
    public static void main(String[] args) {
        Gadget Notebook = new Gadget();
        
        Notebook.merk="Acer";
        Notebook.warna="Hitam";
        Notebook.tahun="2016";
        Notebook.ukuran="10 inci";
        Notebook.harga="3Juta";
        
        Notebook.cetakInfo();
    }
}
