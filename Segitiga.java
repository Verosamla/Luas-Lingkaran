/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segitiga;

/**
 *
 * @author asus
 */
public class Segitiga {
    // Atribut
    private double alas;
    private double tinggi;
    
    // Konstruktor
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    // Metode untuk menghitung luas
    public double hitungLuas() {
        return (this.alas * this.tinggi) / 2;
    }
}
