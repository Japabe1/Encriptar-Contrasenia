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
     *Constructor por defecto
     */
    public EncriptacionBase64() {
        pswCodificada = "";
        pswDecodificada = "";
    }

    /**
     * Constructor por parámetros
     * @param pswCodificada Constraseña codificada
     * @param pswDecodificada Contraseña decodificada
     */
    public EncriptacionBase64(String pswCodificada, String pswDecodificada) {
        this.pswCodificada = pswCodificada;
        this.pswDecodificada = pswDecodificada;
    }
    
    
    
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
     * Método set para actualizar la contraseña codificada
     * @param pswCodificada Contraseña codificada
     */
    public void setPswCodificada(String pswCodificada) {
        this.pswCodificada = pswCodificada;
    }

    /**
     * Método set para actualizar la contraseña decodificada
     * @param pswDecodificada Contraseña decodificada
     */
    public void setPswDecodificada(String pswDecodificada) {
        this.pswDecodificada = pswDecodificada;
    }

    /**
     * Método toString que devuelve los datos actuales del objeto
     * @return Devuelve los datos actuales del objeto
     */
    @Override
    public String toString() {
        return "EncriptacionBase64{" + "pswCodificada=" + pswCodificada + ", pswDecodificada=" + pswDecodificada + '}';
    }
    
    
    
    /**
     *  Método que permite códificar una contraseña de UTF-8 a Base64
     * @param psw Contraseña del usuario
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
