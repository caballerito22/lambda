import java.util.List;

record Producto(String nombre, int precio) {}

interface Filtro{
    boolean pasaFiltro(Producto p);
}

interface Accion{
    void hacerAccion(Producto producto);
}

class Almacen {

    List<Producto> productos;

    Almacen(List<Producto> productos) {
        this.productos = productos;
    }
    void paraCadaProducto(Accion accion, Filtro filtro){
        for(Producto producto: productos){
            if (filtro.pasaFiltro(producto))
            accion.hacerAccion(producto);
        }
    }
}


public class Main {
    public static void main(String[] args) {

        Almacen almacen = new Almacen(List.of(new Producto("lapiz ", 5), new Producto("boli ", 6), new Producto("libro ", 10)));


        almacen.paraCadaProducto(p-> System.out.println(p), p -> p.precio() > 5);

    }
}