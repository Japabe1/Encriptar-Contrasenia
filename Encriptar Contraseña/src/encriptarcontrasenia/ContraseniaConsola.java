/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encriptarcontrasenia;

import java.io.Console;

/**
 * Clase ContraseniaConsola que pide por consola y almacena la contraseña siempre
 * que se verifique que esta bien introducida con una doble introducción de la 
 * contraseña y comprobación de que sean iguales
 * 
 * Version 1.0
 * @author Jose Antonio Parejo Bellido
 */

public class ContraseniaConsola {

    private char[] contrasenia;

    /**
     *Constructor por defecto
     */
    public ContraseniaConsola() {
        contrasenia = new char[0];
    }

    /**
     * Constructor por parametros
     * @param contrasenia Contraseña del usuario
     */
    public ContraseniaConsola(char[] contrasenia) {
        this.contrasenia = contrasenia;
    }

    
    /**
     * Método get del atributo contraseña
     * @return Devuelve la contraseña como un array de tipo char
     */
    public char[] getContrasenia() {
        return contrasenia;
    }

    /**
     * Método get del atributo contraseña
     * @return Devuelve la contraseña como un String
     */
    public String getConstrasenia() {
        return new String(contrasenia);
    }

    /**
     * Método set para actualizar la contraseña del usuario
     * @param contrasenia Contraseña del asuario
     */
    public void setContrasenia(char[] contrasenia) {
        this.contrasenia = contrasenia;
    }

    /**
     *  Método toString para mostrar los datos actualizados del objeto
     * @return Devuelve los datos acutalizados del objeto
     */
    @Override
    public String toString() {
        return "ContraseniaConsola{" + "contrasenia=" + contrasenia + '}';
    }
    
    
    /**
     * Método que pide una contraseña por consola y verifica que es la contraseña que se quiere insertar
     */
    public void PedirContrasenia() {
        Console console = System.console();
        if (console == null) {
            System.out.println("No se puede obtener la instancia de la Consola");
            System.exit(0);
        }

        console.printf("Testeo de contraseña");
        char[] arrayContrasenia = console.readPassword("\nIngresa tu contrasenia: ");
        char[] arraySegundaContrasenia = console.readPassword("\nIngresa tu contrasenia de nuevo ");

        if ((new String(arrayContrasenia)).equals(new String(arraySegundaContrasenia))) {
            System.out.println("\ningreso la contrasenia de forma correcta");
            contrasenia = arrayContrasenia;
        } else {
            System.err.println("\nerror! debe coincidir las contraseñas");
        }

    }
}
