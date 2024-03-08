/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segitiga;

/**
 *
 * @author asus
 */
public class LuasSegitaOOP {
    public static void main(String[] args) {
        // Membuat objek segitiga dengan alas 10 dan tinggi 5
        Segitiga segitiga = new Segitiga(10, 5);
        
        // Menghitung dan menampilkan luas segitiga
        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
    }
}
