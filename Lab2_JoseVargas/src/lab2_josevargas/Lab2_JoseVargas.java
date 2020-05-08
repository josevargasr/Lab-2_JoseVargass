/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_josevargas;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author josevargas
 */
public class Lab2_JoseVargas {
static Scanner entrada = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean vlogin = false;
        boolean valid = true;
        ArrayList <Casas> casas = new ArrayList();
        ArrayList <Casas> c_listas = new ArrayList();
        ArrayList <Casas> c_construct = new ArrayList();
        ArrayList <Casas> c_espera = new ArrayList();
        ArrayList <Casas> c_demo = new ArrayList();
        while(valid){
            System.out.println("-----BlackFloyd-----");
            System.out.println("1] Registro de Casas\n"
                    + "2] Manejo de Estado\n"
                    + "3] Log In\n"
                    + "4] Salir\n"
                    + "Ingrese una opcion: ");
            int opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    if(vlogin){
                        System.out.println("1] Crear Casas\n"
                                + "2] Listar Casas\n"
                                + "3] Modificar Casas\n"
                                + "4] Borrar Casas\n"
                                + "Ingrese una opcion: ");
                        int opcion2 = entrada.nextInt();
                        switch(opcion2){
                            case 1:
                                System.out.println("Ingrese el numero de casa: ");
                                int n_casa = entrada.nextInt();
                                System.out.println("Ingrese el numero de bloque: ");
                                int n_bloque = entrada.nextInt();
                                System.out.println("Ingrese el color de la casa: ");
                                String color = entrada.next();
                                System.out.println("Ingrese el largo de la casa: ");
                                int largo = entrada.nextInt();
                                System.out.println("Ingrese el ancho de la casa: ");
                                int ancho = entrada.nextInt();
                                System.out.println("La casa esta disponible?(Si/No): ");
                                String comprado = entrada.next();
                                System.out.println("1] Lista\n"
                                        + "2] En Construccion\n"
                                        + "3] En Espera\n"
                                        + "4] En Demolicion\n"
                                        + "Ingrese el estado de la casa: ");
                                int estad = entrada.nextInt();
                                String estado = "";
                                if(estad==1){
                                    estado = "Lista";
                                    c_listas.add(new Casas(n_casa, n_bloque, color, largo, ancho, comprado, estado));
                                }else if(estad==2){
                                    if(c_construct.size()==5){
                                        System.out.println("Ya no pueden haber mas casas en construccion");
                                    }else{
                                        estado = "En Construccion";
                                        c_construct.add(new Casas(n_casa, n_bloque, color, largo, ancho, comprado, estado));
                                    }
                                }else if(estad==3){
                                    
                                        estado = "En Espera";
                                        c_espera.add(new Casas(n_casa, n_bloque, color, largo, ancho, comprado, estado));
                                    
                                }else if(estad==4){
                                    if(c_demo.size()==3){
                                        System.out.println("Ya no pueden haber mas casas en demolicion");
                                    }else{
                                        estado = "En Demolicion";
                                        c_demo.add(new Casas(n_casa, n_bloque, color, largo, ancho, comprado, estado));
                                    }
                                }
                                casas.add(new Casas(n_casa, n_bloque, color, largo, ancho, comprado, estado));
                                System.out.println("La casa fue agregada con exito");
                                System.out.println();
                                break;
                            case 2:
                                for (Object o : casas) {
                                    System.out.println("[" + (casas.indexOf(o)) + "] " + o);
                                }
                                System.out.println();
                                break;
                            case 3:
                                for (Object o : casas) {
                                    System.out.println("[" + (casas.indexOf(o)) + "] " + o);
                                }
                                System.out.println("Ingrese la posicion de la casa que desea modificar: ");
                                int pos = entrada.nextInt();
                                System.out.println("1] Numero de Casa\n"
                                        + "2] Numero de Bloque\n"
                                        + "3] Color de Casa\n"
                                        + "4] Largo\n"
                                        + "5] Ancho\n"
                                        + "6] Disponibilidad de la casa\n"
                                        + "Ingrese la opcion que desea modificar: ");
                                int mod = entrada.nextInt();
                                switch(mod){
                                    case 1:
                                        System.out.println("Ingrese el nuevo numero de la casa: ");
                                        int newnum = entrada.nextInt();
                                        ((Casas)casas.get(pos)).setN_casa(newnum);
                                        System.out.println("El numero fue modificado con exito");
                                        break;
                                    case 2:
                                        System.out.println("Ingrese el nuevo numero de bloque: ");
                                        int newnumb = entrada.nextInt();
                                        ((Casas)casas.get(pos)).setN_bloque(newnumb);
                                        System.out.println("El bloque fue modificado con exito");
                                        break;
                                    case 3:
                                        System.out.println("Ingrese el nuevo color de la casa: ");
                                        String newcolor = entrada.next();
                                        ((Casas)casas.get(pos)).setColor(newcolor);
                                        System.out.println("El color fue modificado con exito");
                                        break;
                                    case 4:
                                        System.out.println("Ingrese el nuevo largo: ");
                                        int newlargo = entrada.nextInt();
                                        ((Casas)casas.get(pos)).setLargo(newlargo);
                                        System.out.println("El largo fue modificado con exito");
                                        break;
                                    case 5:
                                        System.out.println("Ingrese el nuevo ancho: ");
                                        int newancho = entrada.nextInt();
                                        ((Casas)casas.get(pos)).setAncho(newancho);
                                        System.out.println("El ancho fue modificado con exito");
                                        break;
                                    case 6:
                                        System.out.println("La casa esta disponible?(Si/No): ");
                                        String newdisp = entrada.next();
                                        ((Casas)casas.get(pos)).setComprada(newdisp);
                                        System.out.println("La disponibilidad fue modificada con exito");
                                        break;
                                }
                                System.out.println();
                                break;
                            case 4:
                                for (Object o : casas) {
                                    System.out.println("[" + (casas.indexOf(o)) + "] " + o);
                                }
                                System.out.println("Ingrese la posicion de la casa que desea borrar: ");
                                int pos2 = entrada.nextInt();
                                casas.remove(pos2);
                                System.out.println("La casa se elimino con exito!");
                                System.out.println();
                                break;
                        }
                    }else{
                        System.out.println("Todavia no se ha iniciado sesion");
                    }
                    System.out.println();
                    break;
                case 2:
                    if(vlogin){
                        System.out.println("1] Casas Listas:");
                        for (Object o : c_listas) {
                            System.out.println("[" + (c_listas.indexOf(o)) + "] " + o);
                        }
                        System.out.println();
                        System.out.println("2] Casas en Construccion:");
                        for (Object o : c_construct) {
                            System.out.println("[" + (c_construct.indexOf(o)) + "] " + o);
                        }
                        System.out.println();
                        System.out.println("3] Casas en Espera:");
                        for (Object o : c_espera) {
                            System.out.println("[" + (c_espera.indexOf(o)) + "] " + o);
                        }
                        System.out.println();
                        System.out.println("4] Casas en Espera de Demolicion:");
                        for (Object o : c_demo) {
                            System.out.println("[" + (c_demo.indexOf(o)) + "] " + o);
                        }
                        System.out.println();
                        System.out.println("Ingrese un estado para modificar: ");
                        int pos_estado = entrada.nextInt();
                        switch(pos_estado){
                            case 1:
                                for (Object o : c_listas) {
                                    System.out.println("[" + (c_listas.indexOf(o)) + "] " + o);
                                }
                                System.out.println("Ingrese la posicion de la casa que desea modificar: ");
                                int posi1 = entrada.nextInt();
                                if(c_demo.size()==3){
                                        System.out.println("Ya no pueden haber mas casas en demolicion");
                                }else{
                                    c_demo.add(c_listas.get(posi1));
                                    c_listas.remove(posi1);
                                    System.out.println("La casa se movio a la lista de demolicion");
                                }
                                
                                break;
                            case 2:
                                for (Object o : c_construct) {
                                    System.out.println("[" + (c_construct.indexOf(o)) + "] " + o);
                                }
                                System.out.println("Ingrese la posicion de la casa que desea modificar: ");
                                int posi2 = entrada.nextInt();
                                System.out.println("1] Lista\n"
                                        + "2] En Espera\n"
                                        + "Ingrese la posicion a la que lo desea mover: ");
                                int nposi2 = entrada.nextInt();
                                if(nposi2==1){
                                    c_listas.add(c_construct.get(posi2));
                                    c_construct.remove(posi2);
                                    System.out.println("La casa se movio a la lista de casas listas");
                                }else{
                                    c_espera.add(c_construct.get(posi2));
                                    c_construct.remove(posi2);
                                    System.out.println("La casa se movio a la lista de casas en espera");
                                }
                                break;
                                
                            case 3:
                                for (Object o : c_espera) {
                                    System.out.println("[" + (c_espera.indexOf(o)) + "] " + o);
                                }
                                System.out.println("Ingrese la posicion de la casa que desea modificar: ");
                                int posi3 = entrada.nextInt();
                                if(c_construct.size()==5){
                                        System.out.println("Ya no pueden haber mas casas en construccion");
                                }else{
                                    c_construct.add(c_espera.get(posi3));
                                    c_espera.remove(posi3);
                                    System.out.println("La casa se ha movida a construccion");
                                }
                                
                                break;
                            case 4:
                                for (Object o : c_demo) {
                                    System.out.println("[" + (c_demo.indexOf(o)) + "] " + o);
                                }
                                System.out.println("Ingrese la casa que desea demoler: ");
                                int demoler = entrada.nextInt();
                                c_demo.remove(demoler);
                                break;
                        }
                    }else{
                        System.out.println("Todavia no se ha iniciado sesion");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Ingrese el usuario: ");
                    String usuario = entrada.next();
                    System.out.println("Ingrese la contraseña: ");
                    String contraseña = entrada.next();
                    if(usuario.equals("leobanegas")  && contraseña.equals("99")){
                        System.out.println("Se ha iniciado sesion correctamente");
                        vlogin = true;
                    }else{
                        System.out.println("El usuario o contraseña es invalido");
                    }
                    System.out.println();
                    break;
                case 4:
                    valid = false;
                    break;
                    
            }
            
        }
    }
    
}
