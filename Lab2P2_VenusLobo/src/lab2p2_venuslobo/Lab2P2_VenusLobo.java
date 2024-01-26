/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_venuslobo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Lab2P2_VenusLobo {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //USUARIOS EN DURO 
        ArrayList<Usuario> ListaUsuarios = new ArrayList<>();
        Usuario usuarioEstudiante1 = new Usuario("Adonys_Mercadal", "dunai2004", "estudiante");
        Usuario usuarioEsstudiante2 = new Usuario("Angel.N.M", "myLoveV4", "estudiante");

        ListaUsuarios.add(usuarioEstudiante1);
        ListaUsuarios.add(usuarioEsstudiante2);

        //MENU
        String nombreUsuario;
        String contrasena;
      

        boolean usuarioValido = false;

        while (!usuarioValido) {
            System.out.println("Ingrese nombre de usuario: ");
            nombreUsuario = sc.nextLine();
            System.out.println("Ingrese su contraseña:");
            contrasena = sc.nextLine();

            Usuario usuarioIngresado = new Usuario(nombreUsuario, contrasena, "");

            boolean usuarioEncontrado = false;

            for (Usuario usuario : ListaUsuarios) {
                if (usuario.getNombre().equals(usuarioIngresado.getNombre()) && usuario.getContrasena().equals(usuarioIngresado.getContrasena())) {
                    System.out.println("Usuario valido");
                    usuarioValido = true;
                    usuarioEncontrado = true;
                    break;
                }
            }

            if (!usuarioEncontrado) {
                System.out.println("Usuario no valido. Intente nuevamente.");
            }
        }
    }

}
