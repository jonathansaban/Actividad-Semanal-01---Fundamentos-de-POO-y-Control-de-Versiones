/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jotajota
 */
public class Veterinaria {
    public static void main(String[] args) {
                // Crear objetos de tipo Mascota
        Mascota m1 = new Mascota("Luna", "Perro", 3, true);
        Mascota m2 = new Mascota("Michi", "Gato", 2, false);
        Mascota m3 = new Mascota("Tito", "Conejo", 1, true);

        // Mostrar información
        m1.mostrarInformacion();
        m2.mostrarInformacion();
        m3.mostrarInformacion();
    }
    
}
