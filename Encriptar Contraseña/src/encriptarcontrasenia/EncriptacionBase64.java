/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encriptarcontrasenia;
import java.util.Base64;
/**
 * Clase EncriptacionBase64 que encripta una contraseña que se le pasa desde un
 * un string en UTF-8 a Base64
 * Version 1.0
 * @author Jose Antonio Parejo Bellido
 */
public class EncriptacionBase64 {
    private String pswCodificada;
    private String pswDecodificada;

    /**
     *Método get del atributo pswCodificada
     * @return Devuelve la contraseña codificada en Base64
     */
    public String getPswCodificada() {
        return pswCodificada;
    }

    /**
     * Método get del atributo pswDecodificada
     * @return Devuelve la contraseña decodificada en Base64
     */
    public String getPswDecodificada() {
        return pswDecodificada;
    }
    
    /**
     *  Método que permite códificar una contraseña de UTF-8 a Base64
     * @param psw Contraseña 
     */
    public void codificarBase64(String psw){
        pswCodificada = Base64.getEncoder().encodeToString(psw.getBytes());
        
    }
    
    /**
     *Método que permite decodificar una contraseña codificada en base64 UTF-8
     */
    public void decodificarBase64 (){
        byte [] bytesDecodificados = Base64.getDecoder().decode(pswCodificada);
        pswDecodificada = new String (bytesDecodificados);
    }

   
    
}
