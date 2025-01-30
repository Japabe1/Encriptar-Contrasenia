/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encriptarcontrasenia;

/**
 * Version 1.0
 * @author Jose Antonio Parejo Bellido
 */
public class Main {
    
    public static void main(String[] args) {
        //Declaración varieables
        ContraseniaConsola contrasenia = new ContraseniaConsola();
        EncriptacionBase64 encrip = new EncriptacionBase64();
        String psw, pswCodificada, pswDecodificada ;
        
        
        //Pedir contraseñas
        contrasenia.PedirContrasenia();
        psw = contrasenia.getConstrasenia();
        
        //Codificación Base64
        encrip.codificarBase64(psw);
        pswCodificada = encrip.getPswCodificada();
        
        System.out.println("\nContrasenia codificada: " + pswCodificada);
        
        //Decodificacion psw Base64s
        encrip.decodificarBase64();
        pswDecodificada = encrip.getPswDecodificada();
        
        System.out.println("\nContrasenia decodificada: " + pswDecodificada);
        
        
    }
}
