import java.sql.SQLOutput;
import java.util.*;

public class Main {
    private static List<Articulo> listaArticulos;
    public static void main(String[] args) {
    menuPrincipal();
    }

private static void agregarArticulos(){
        Scanner sc = new Scanner(System.in);
        String nombre;
        String descripcion;
        String modelo;
        float precio;
        listaArticulos = new ArrayList<>();
        int tipoArticulo = obtenerTipoArticulo();


        switch(tipoArticulo){
            case 1:
                Telefono telefono = new Telefono();
                System.out.println("Ingrese el nombre del articulo: ");
                telefono.setNombre(sc.nextLine());
                System.out.println("Ingrese el modelo del articulo: ");
                telefono.setModelo(sc.nextLine());
                System.out.println("Ingrese una descripcion breve del articulo: ");
                telefono.setDescripcion(sc.nextLine());
                System.out.println("Ingrese el precio del articulo: ");
                System.out.println("$");
                telefono.setPrecio(sc.nextFloat());
                System.out.println("Ingrese el almacenamiento del articulo (en GB): ");
                telefono.setAlmacenamiento(sc.nextInt());
                System.out.println("Ingrese el tamaño del articulo (en cm): ");
                telefono.setTamano(sc.nextFloat());
                listaArticulos.add(telefono);
                break;
            case 2:
                Laptop laptop = new Laptop();
                System.out.println("Ingrese el nombre del articulo: ");
                laptop.setNombre(sc.nextLine());
                System.out.println("Ingrese el modelo del articulo: ");
                laptop.setModelo(sc.nextLine());
                System.out.println("Ingrese una descripcion breve del articulo: ");
                laptop.setDescripcion(sc.nextLine());
                System.out.println("Ingrese el precio del articulo: ");
                laptop.setPrecio(sc.nextFloat());
                sc.nextLine();
                System.out.println("Ingrese el idioma de fabrica del teclado: ");
                laptop.setIdiomaTeclado(sc.nextLine());
                System.out.println("Ingrese el sistema operativo de la laptop");
                laptop.setSistemaOperativo(sc.nextLine());
                listaArticulos.add(laptop);
                break;
        }
}

private static void menuOpciones(){
    System.out.println("Bienvenido al sistema de la tienda");
    System.out.println("Estas son las opciones disponibles: ");
    System.out.println("1. para agregar un articulo");
    System.out.println("2. para modificar el precio de un articulo");
    System.out.println("3. para ver la lista de articulos");
    System.out.println("0.  para salir");
    System.out.println("Ingresa una opcion: ");
}

private static void menuPrincipal(){
        Scanner sc = new Scanner(System.in);
        int opcion;
        while(true){
           try{
               menuOpciones();
               opcion = sc.nextInt();

               if (opcion == 0){
                   System.out.println("Hasta pronto...");
                   break;
               }

               switch(opcion){
                   case 1:
                       agregarArticulos();
                       break;
                   case 2:
                       modificarPrecio();
                       break;
                   case 3:
                       mostrarLista(listaArticulos);
                       break;
                   default:
                       System.out.println("Ingresa una opcion valida");
               }

           }catch(Exception e){
               System.out.println("Ingresa un tipo de dato valido");
           }finally{
               sc.nextLine();
           }

        }
}

private static int obtenerTipoArticulo(){
        Scanner sc = new Scanner(System.in);
        int opcion;
    while(true){
        try{
            System.out.println("Selecciona el tipo de articulo");
            System.out.println("1. para telefono");
            System.out.println("2. para laptop");
            System.out.println("Ingresa una opcion: ");
            opcion = sc.nextInt();
            if(opcion >= 1 && opcion <= 2) return opcion;
            System.out.println("Por favor ingresa una opcion valida");
        }catch(Exception e){
            System.out.println("Ingresa un tipo de dato valido");
        }finally{
            sc.nextLine();
        }
    }
}

private static void modificarPrecio(){
    Scanner sc = new Scanner(System.in);
    String nombre;
    float precio;
    Articulo modificarArticulo;
    System.out.println("Ingrese el nombre del articulo al que quiere cambiarle el precio: ");
    nombre = sc.nextLine();
    modificarArticulo = buscarArticulo(nombre,listaArticulos);
    System.out.println("Nuevo precio del articulo: ");
    precio = sc.nextFloat();
    modificarArticulo.setPrecio(precio);

}

private static Articulo buscarArticulo(String nombre, List<Articulo> articulos){

        for (Articulo articulo : articulos){
            if (articulo.getNombre().equals(nombre)){
                return articulo;
            }
        }
        return null;
}

private static void mostrarLista(List<Articulo> articulos){
    System.out.println("----------Lista---------");
    for(Articulo articulo : articulos){
        System.out.println("Nombre de articulo: " + "\t" + articulo.getNombre());
        System.out.println("Modelo de articulo: " + "\t" + articulo.getModelo());
        System.out.println("Descripcion de articulo: " + "\t" + articulo.obtenerDescripcion(articulo.getDescripcion()));
        System.out.println("Precio de articulo: " + "\t" + articulo.obtenerPrecio(articulo.getPrecio()));

    }

}


}

