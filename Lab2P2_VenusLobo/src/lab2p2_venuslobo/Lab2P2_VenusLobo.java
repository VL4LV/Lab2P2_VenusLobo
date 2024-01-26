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

    static ArrayList<Libro> libros = new ArrayList();
    static ArrayList<Articulo> articulos = new ArrayList();
    static ArrayList<Cursos_Linea> cursos = new ArrayList();
    static ArrayList<Conferencia> conferencias = new ArrayList();

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //USUARIOS EN DURO 
        ArrayList<Usuario> ListaUsuarios = new ArrayList<>();
        Usuario usuarioEstudiante1 = new Usuario("Adonys_Mercadal", "dunai2004", "estudiante");
        Usuario usuarioEsstudiante2 = new Usuario("Angel.N.M", "myLoveV4", "estudiante");
        Usuario usuarioProfesor1 = new Usuario("Irene_1", "1234", "profesor");
        Usuario usuarioProfesor2 = new Usuario("Belen.A", "BBBB", "profesor");
        Usuario usuarioBiblotecario1 = new Usuario("Emilio_23", "instructorrrr", "bibliotecario");
        Usuario usuarioBiblotecario2 = new Usuario("Carlos_LL", "instructorrrr2222", "bibliotecario");

        ListaUsuarios.add(usuarioEstudiante1);
        ListaUsuarios.add(usuarioEsstudiante2);
        ListaUsuarios.add(usuarioProfesor1);
        ListaUsuarios.add(usuarioProfesor2);
        ListaUsuarios.add(usuarioBiblotecario1);
        ListaUsuarios.add(usuarioBiblotecario2);

        //MENU
        String nombreUsuario;
        String contrasena;

        boolean usuarioValido = false;
        Usuario usuarioAutenticado = null;

        while (!usuarioValido) {
            System.out.println("Ingrese nombre de usuario: ");
            nombreUsuario = sc.nextLine();
            System.out.println("Ingrese su contraseña:");
            contrasena = sc.nextLine();

            Usuario usuarioIngresado = new Usuario(nombreUsuario, contrasena, "");

            boolean usuarioEncontrado = false;

            for (Usuario usuario : ListaUsuarios) {
                if (usuario.getNombreUsuario().equals(usuarioIngresado.getNombreUsuario()) && usuario.getContrasena().equals(usuarioIngresado.getContrasena())) {
                    System.out.println("Usuario valido");
                    usuarioValido = true;
                    usuarioEncontrado = true;
                    usuarioAutenticado = usuario;
                    break;
                }
            }

            if (!usuarioEncontrado) {
                System.out.println("Usuario no valido. Intente nuevamente.");
            }
        }

        if (usuarioAutenticado != null) {
            switch (usuarioAutenticado.getTipoUsuario()) {
                case "estudiante":
                    System.out.println("");
                    System.out.println("---Bienvenido estudiante---");
                    System.out.println("1. Listar recursos");
                    System.out.println("2. Salir");
                    System.out.print("Que vamos hacer: ");
                    int opcEstu = sc.nextInt();

                    break;

                case "profesor":
                    System.out.println("");
                    System.out.println("Bienvenido profesor");
                    System.out.println("1. Listar recursos");
                    System.out.println("2. Crear recursos");
                    System.out.println("3. Salir");
                    System.out.print("Que vamos hacer: ");
                    int opcProfe = sc.nextInt();

                    break;

                case "bibliotecario":
                    int opcBibli;
                    do {
                        System.out.println("");
                        System.out.println("---Bienvenido bibliotecario---");
                        System.out.println("1. Listar recursos");
                        System.out.println("2. Crear recursos");
                        System.out.println("3. Eliminar recursos");
                        System.out.println("4. Modificar recursos");
                        System.out.println("5. Salir");
                        System.out.print("Que vamos hacer: ");

                        opcBibli = sc.nextInt();

                        switch (opcBibli) {
                            case 1:
                                for (Libro lib : libros) {
                                    System.out.println(lib.toString());
                                }
                                break;

                            case 2:
                                System.out.println("1. Libro");
                                System.out.println("2. Articulo");
                                System.out.println("3. Curso en linea");
                                System.out.println("4. Conferencia virtual");
                                System.out.print("Que tipo de recurso quiere crear: ");
                                int tipoCurso = sc.nextInt();

                                sc.nextLine();
                                switch (tipoCurso) {
                                    case 1:
                                        System.out.println("Ingrese titulo del libro: ");
                                        String titulo = sc.nextLine();
                                        System.out.println("Ingrese autor del libro: ");
                                        String autor = sc.nextLine();
                                        System.out.println("Ingrese el genero del libro: ");
                                        String genero = sc.nextLine();
                                        System.out.println("Ingrese el año de publifcacion:");
                                        int anio = sc.nextInt();
                                        sc.nextLine();
                                        System.out.println("Ingrese el estado del libro: ");
                                        String disponibilidad = sc.nextLine();

                                        //AGREGAR A LA LISTA DE LIBROS
                                        Libro nuevoLibro = new Libro(titulo, autor, genero, anio, disponibilidad);
                                        libros.add(nuevoLibro);

                                        break;

                                    case 2:
                                        System.out.println("Ingrese titulo del articulo: ");
                                        String tituloArti = sc.nextLine();
                                        System.out.println("Ingrese autor del articulo: ");
                                        String autorArti = sc.nextLine();
                                        System.out.println("Ingrese el tema del articulo: ");
                                        String tema = sc.nextLine();
                                        System.out.println("Ingrese la fecha de publicacion:");
                                        String fecha = sc.nextLine();
                                        System.out.println("Ingrese el acceso en linea: ");
                                        String acceso = sc.nextLine();

                                        //AGREGAR A LA LISTA DE ARTICULO
                                        Articulo nuevoArticulo = new Articulo(tituloArti, autorArti, tema, fecha, acceso);
                                        articulos.add(nuevoArticulo);
                                        break;

                                    case 3:
                                        System.out.println("Ingrese nombre del curso: ");
                                        String curso = sc.nextLine();
                                        System.out.println("Ingrese INSTRUCTOR del curso: ");
                                        String autorCurso = sc.nextLine();
                                        System.out.println("Ingrese la duracion en semanas: ");
                                        String duracion = sc.nextLine();
                                        System.out.println("Ingrese la plataforma de enseñanza:");
                                        String plataforma = sc.nextLine();

                                        //AGREGAR A LA LISTA DE CURSOS
                                        Cursos_Linea nuevoCurso = new Cursos_Linea(curso, autorCurso, duracion, plataforma);
                                        cursos.add(nuevoCurso);
                                        break;

                                    case 4:
                                        System.out.println("Ingrese titulo de la conferencia: ");
                                        String tituloConfe = sc.nextLine();
                                        System.out.println("Ingrese el conferencista: ");
                                        String conferencista = sc.nextLine();
                                        System.out.println("Ingrese la fecha: ");
                                        String fe = sc.nextLine();
                                        System.out.println("Ingrese la duracion:");
                                        String dura = sc.nextLine();
                                        System.out.println("Ingrese el enlace de acceso: ");
                                        String enlace = sc.nextLine();

                                        //AGREGAR A LA LISTA DE ARTICULO
                                        Conferencia nuevaConferencia = new Conferencia(tituloConfe, conferencista, fe, dura, enlace);
                                        conferencias.add(nuevaConferencia);
                                        break;

                                    default:
                                        System.out.println("Eso no esta aqui.");
                                }
                                break;
                        }

                    } while (opcBibli != 5);

                default:
                    System.out.println("Este tipo de usuario no este disponible.");
                    break;
            }
        }
    }

    //METODOS 
    public static void listas(ArrayList lista) {
        for (Object t : lista) {
            System.out.println(lista.indexOf(t) + "- " + t);
        }
    }

}
