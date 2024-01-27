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
                    int opcEstu;

                    do {
                        System.out.println("");
                        System.out.println("---Bienvenido estudiante---");
                        System.out.println("1. Listar recursos");
                        System.out.println("2. Salir");
                        System.out.print("Que vamos hacer: ");
                        opcEstu = sc.nextInt();

                        switch (opcEstu) {
                            case 1:
                                System.out.println("LIBROS");
                                if (libros.isEmpty()) {
                                    System.out.println("No hay libros disponibles.");
                                } else {
                                    for (Libro lib : libros) {
                                        System.out.println(lib.toString());
                                    }
                                }

                                System.out.println("ARTICULOS");
                                if (articulos.isEmpty()) {
                                    System.out.println("No hay artículos disponibles.");
                                } else {
                                    for (Articulo ar : articulos) {
                                        System.out.println(ar.toString());
                                    }
                                }

                                System.out.println("CURSOS EN LINEA");
                                if (cursos.isEmpty()) {
                                    System.out.println("No hay cursos en línea disponibles.");
                                } else {
                                    for (Cursos_Linea cur : cursos) {
                                        System.out.println(cur.toString());
                                    }
                                }

                                System.out.println("CONFERENCIAS VIRTUALES");
                                if (conferencias.isEmpty()) {
                                    System.out.println("No hay conferencias virtuales disponibles.");
                                } else {
                                    for (Conferencia co : conferencias) {
                                        System.out.println(co.toString());
                                    }
                                }

                                break;

                            case 2:
                                System.out.println("Adios");
                                break;
                        }
                    } while (opcEstu != 2);

                    break;

                case "profesor":
                    int opcProfe;
                    do {
                        System.out.println("");
                        System.out.println("---Bienvenido profesor---");
                        System.out.println("1. Listar recursos");
                        System.out.println("2. Crear recursos");
                        System.out.println("3. Salir");
                        System.out.print("Que vamos hacer: ");
                        opcProfe = sc.nextInt();

                        switch (opcProfe) {
                            case 1:
                                System.out.println("LIBROS");
                                if (libros.isEmpty()) {
                                    System.out.println("No hay libros disponibles.");
                                } else {
                                    for (Libro lib : libros) {
                                        System.out.println(lib.toString());
                                    }
                                }

                                System.out.println("ARTICULOS");
                                if (articulos.isEmpty()) {
                                    System.out.println("No hay artículos disponibles.");
                                } else {
                                    for (Articulo ar : articulos) {
                                        System.out.println(ar.toString());
                                    }
                                }

                                System.out.println("CURSOS EN LINEA");
                                if (cursos.isEmpty()) {
                                    System.out.println("No hay cursos en línea disponibles.");
                                } else {
                                    for (Cursos_Linea cur : cursos) {
                                        System.out.println(cur.toString());
                                    }
                                }

                                System.out.println("CONFERENCIAS VIRTUALES");
                                if (conferencias.isEmpty()) {
                                    System.out.println("No hay conferencias virtuales disponibles.");
                                } else {
                                    for (Conferencia co : conferencias) {
                                        System.out.println(co.toString());
                                    }
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

                            case 3:
                                System.out.println("Adios");
                                break;
                        }

                    } while (opcProfe != 3);

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
                                System.out.println("LIBROS");
                                if (libros.isEmpty()) {
                                    System.out.println("No hay libros disponibles.");
                                } else {
                                    for (Libro lib : libros) {
                                        System.out.println(lib.toString());
                                    }
                                }

                                System.out.println("ARTICULOS");
                                if (articulos.isEmpty()) {
                                    System.out.println("No hay artículos disponibles.");
                                } else {
                                    for (Articulo ar : articulos) {
                                        System.out.println(ar.toString());
                                    }
                                }

                                System.out.println("CURSOS EN LINEA");
                                if (cursos.isEmpty()) {
                                    System.out.println("No hay cursos en línea disponibles.");
                                } else {
                                    for (Cursos_Linea cur : cursos) {
                                        System.out.println(cur.toString());
                                    }
                                }

                                System.out.println("CONFERENCIAS VIRTUALES");
                                if (conferencias.isEmpty()) {
                                    System.out.println("No hay conferencias virtuales disponibles.");
                                } else {
                                    for (Conferencia co : conferencias) {
                                        System.out.println(co.toString());
                                    }
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

                            case 3:
                                System.out.println("1. Libro");
                                System.out.println("2. Articulo");
                                System.out.println("3. Curso en linea");
                                System.out.println("4. Conferencia virtual");
                                System.out.print("Que quiere borrar: ");
                                int borrar = sc.nextInt();
                                sc.nextLine();

                                switch (borrar) {
                                    case 1:
                                        if (libros.isEmpty()) {
                                            System.out.println("No hay ninguna libro en la lista para eliminar.");
                                        } else {
                                            System.out.println("--MOMENTO DE ELIMINAR UN LIBRO--");
                                            System.out.print("Ingrese el nombre del libro  a eliminar: ");
                                            String nombreKill = sc.nextLine();

                                            boolean libroEncontrado = false;
                                            for (int i = 0; i < libros.size(); i++) {
                                                if (libros.get(i).getTitulo().equalsIgnoreCase(nombreKill)) {
                                                    libros.remove(i);
                                                    libroEncontrado = true;
                                                    System.out.println("Libro eliminado exitosamente.");
                                                    break;
                                                }
                                            }

                                            if (!libroEncontrado) {
                                                System.out.println("No hay ninguna libro con ese nombre.");
                                            }
                                        }
                                        break;

                                    case 2:
                                        if (articulos.isEmpty()) {
                                            System.out.println("No hay ninguna articulo en la lista para eliminar.");
                                        } else {
                                            System.out.println("--MOMENTO DE ELIMINAR UN ARTICULO--");
                                            System.out.print("Ingrese el nombre del articulo  a eliminar: ");
                                            String nombreKill = sc.nextLine();

                                            boolean artiEncontrado = false;
                                            for (int i = 0; i < articulos.size(); i++) {
                                                if (articulos.get(i).getTituloArti().equalsIgnoreCase(nombreKill)) {
                                                    articulos.remove(i);
                                                    artiEncontrado = true;
                                                    System.out.println("Articulo eliminado exitosamente.");
                                                    break;
                                                }
                                            }

                                            if (!artiEncontrado) {
                                                System.out.println("No hay ninguna articulo con ese nombre.");
                                            }
                                        }
                                        break;

                                    case 3:
                                        if (cursos.isEmpty()) {
                                            System.out.println("No hay ningun curso en la lista para eliminar.");
                                        } else {
                                            System.out.println("--MOMENTO DE ELIMINAR UN CURSO--");
                                            System.out.print("Ingrese el nombre del curso  a eliminar: ");
                                            String nombreKill = sc.nextLine();

                                            boolean curEncontrado = false;
                                            for (int i = 0; i < cursos.size(); i++) {
                                                if (cursos.get(i).getTituloCursos().equalsIgnoreCase(nombreKill)) {
                                                    cursos.remove(i);
                                                    curEncontrado = true;
                                                    System.out.println("Curso eliminado exitosamente.");
                                                    break;
                                                }
                                            }

                                            if (!curEncontrado) {
                                                System.out.println("No hay ninguna curso con ese nombre.");
                                            }
                                        }
                                        break;

                                    case 4:
                                        if (conferencias.isEmpty()) {
                                            System.out.println("No hay ninguna conferencia en la lista para eliminar.");
                                        } else {
                                            System.out.println("--MOMENTO DE ELIMINAR UNA CONFERENCIA--");
                                            System.out.print("Ingrese el nombre de la conferencia  a eliminar: ");
                                            String nombreKill = sc.nextLine();

                                            boolean conEncontrado = false;
                                            for (int i = 0; i < conferencias.size(); i++) {
                                                if (conferencias.get(i).getTituloConferencia().equalsIgnoreCase(nombreKill)) {
                                                    conferencias.remove(i);
                                                    conEncontrado = true;
                                                    System.out.println("Conferencia eliminado exitosamente.");
                                                    break;
                                                }
                                            }

                                            if (!conEncontrado) {
                                                System.out.println("No hay ninguna conferencia con ese nombre.");
                                            }
                                        }
                                        break;

                                }

                            case 4:
                                System.out.println("1. Libro");
                                System.out.println("2. Articulo");
                                System.out.println("3. Curso en linea");
                                System.out.println("4. Conferencia virtual");
                                System.out.print("Que quiere modificar: ");
                                int modificar = sc.nextInt();

                                switch (modificar) {
                                    case 1:
                                        System.out.println("LIBROS");
                                        if (libros.isEmpty()) {
                                            System.out.println("No hay libros disponibles.");
                                        } else {
                                            for (Libro lib : libros) {
                                                System.out.println(lib.toString());
                                            }
                                        }

                                        if (libros.isEmpty()) {
                                            System.out.println("No hay ninguna libro en la lista para eliminar.");
                                        } else {
                                            System.out.println("--MOMENTO DE ELIMINAR UN LIBRO--");
                                            System.out.println("Ingrese el tirulo del libro a modificar: ");
                                            String libroModi = sc.nextLine();

                                            boolean libroEncontrado = false;
                                            for (int i = 0; i < libros.size(); i++) {
                                                if (libros.get(i).getTitulo().equalsIgnoreCase(libroModi)) {
                                                    System.out.println("Ingrese titulo del libro: ");
                                                    String titulo = sc.nextLine();

                                                    libros.get(i).setTitulo(titulo);

                                                    System.out.println("Ingrese autor del libro: ");
                                                    String autor = sc.nextLine();

                                                    libros.get(i).setAutor(autor);

                                                    System.out.println("Ingrese el genero del libro: ");
                                                    String genero = sc.nextLine();

                                                    libros.get(i).setGenero(genero);

                                                    System.out.println("Ingrese el año de publifcacion:");
                                                    int anio = sc.nextInt();

                                                    libros.get(i).setAnoPublicacion(anio);
                                                    sc.nextLine();

                                                    System.out.println("Ingrese el estado del libro: ");
                                                    String disponibilidad = sc.nextLine();

                                                    libros.get(i).setDisponibilidad(disponibilidad);
                                                    libroEncontrado = true;
                                                    break;
                                                }
                                            }

                                            if (!libroEncontrado) {
                                                System.out.println("No hay ninguna libro con ese nombre.");
                                            }
                                        }

                                        break;

                                    case 2:
                                        System.out.println("ARTICULOS");
                                        if (articulos.isEmpty()) {
                                            System.out.println("No hay artículos disponibles.");
                                        } else {
                                            for (Articulo ar : articulos) {
                                                System.out.println(ar.toString());
                                            }
                                        }

                                        if (articulos.isEmpty()) {
                                            System.out.println("No hay ninguna articulo en la lista para eliminar.");
                                        } else {
                                            System.out.println("--MOMENTO DE MODIFICAR UN ARTICULO--");
                                            System.out.print("Ingrese el nombre del articulo  a eliminar: ");
                                            String nombreKill = sc.nextLine();

                                            boolean artiEncontrado = false;
                                            for (int i = 0; i < articulos.size(); i++) {
                                                if (articulos.get(i).getTituloArti().equalsIgnoreCase(nombreKill)) {
                                                    System.out.println("Ingrese titulo del articulo: ");
                                                    String tituloArti = sc.nextLine();
                                                    
                                                    articulos.get(i).setTituloArti(tituloArti);
                                                    
                                                    System.out.println("Ingrese autor del articulo: ");
                                                    String autorArti = sc.nextLine();
                                                    articulos.get(i).setAutorArti(autorArti);
                                                    
                                                    System.out.println("Ingrese el tema del articulo: ");
                                                    String tema = sc.nextLine();
                                                    articulos.get(i).setTema(tema);
                                                    
                                                    System.out.println("Ingrese la fecha de publicacion:");
                                                    String fecha = sc.nextLine();
                                                    articulos.get(i).setFechaPubli(fecha);
                                                    
                                                    System.out.println("Ingrese el acceso en linea: ");
                                                    String acceso = sc.nextLine();
                                                    articulos.get(i).setAcceso(acceso);
                                                    
                                                    artiEncontrado = true;
                                                    System.out.println("Articulo modificado exitosamente.");
                                                    break;
                                                }
                                            }

                                            if (!artiEncontrado) {
                                                System.out.println("No hay ninguna articulo con ese nombre.");
                                            }
                                        }
                                        break;

                                    case 3:
                                        System.out.println("CURSOS EN LINEA");
                                        if (cursos.isEmpty()) {
                                            System.out.println("No hay cursos en línea disponibles.");
                                        } else {
                                            for (Cursos_Linea cur : cursos) {
                                                System.out.println(cur.toString());
                                            }
                                        }
                                        
                                        System.out.println("Hasta aqui llegue");
                                        break;

                                    case 4:
                                        System.out.println("CONFERENCIAS VIRTUALES");
                                        if (conferencias.isEmpty()) {
                                            System.out.println("No hay conferencias virtuales disponibles.");
                                        } else {
                                            for (Conferencia co : conferencias) {
                                                System.out.println(co.toString());
                                            }
                                        }
                                        System.out.println("No llego");
                                        break;

                                }

                                break;

                            case 5:
                                System.out.println("Adios");
                                break;
                        }

                    } while (opcBibli != 5);

                default:
                    System.out.println("Este tipo de usuario no este disponible.");
                    break;
            }
        }
    }

}
