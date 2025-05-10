/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registrousuario;

import java.util.Scanner;

/**
 *
 * @author Carlos Orozco
 */
public class RegistroUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                Scanner datos = new Scanner(System.in);
        
        // Declaración de variables
        
        String uValido = "admin";
        String cValida = "123";
        
        //Solicitar datos al usuario
        
        System.out.println("***Ingreso al Sistema****");
        System.out.println("");
        System.out.print("Ingrese su nombre de usuario: ");
        String usuario = datos.nextLine();
        System.out.print("Ingrese su contrasena: ");
        String contrasena = datos.nextLine();
        
      
       
      
        //Validación de datos
        
        if (usuario.equals(uValido) && contrasena.equals(cValida)){
            
            System.out.println("****Sistema de Compras****");
            System.out.println("");
            System.out.println("Ingreso al sistema exitoso");   
      
            } else if (usuario.equals(uValido)) {
            
            System.out.println("Contrasena incorrecta corregirla");
            
            } else if (contrasena.equals(cValida)) {
            
                    System.out.println("El usuario es incorrecto corregirlo");
            
            }else{ System.out.println("Los datos ingresados son incorrectos");
  
                        }
    }
    }
    

