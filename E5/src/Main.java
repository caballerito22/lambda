import java.util.List;

record Producto(String nombre, int precio) {}


interface Accion{
    void hacerAccion(Producto p1);
}

class Almacen {

    List<Producto> productos;

    Almacen(List<Producto> productos) { this.productos = productos; }
    void paraCadaProducto(Accion accion){
        for(Producto producto: productos){
            accion.hacerAccion(producto);
        }
    }
}


public class Main {
    public static void main(String[] args) {

        Almacen almacen = new Almacen(List.of(new Producto("lapiz ", 5), new Producto("boli ", 6), new Producto("libro ", 10)));

        Accion imprimir = (Producto p) -> {
            System.out.println(p.nombre() +p.precio());
        };

        almacen.paraCadaProducto(imprimir);

    }
}