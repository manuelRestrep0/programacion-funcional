import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Arroz", 30.5, "Alimentos", 50));
        productos.add(new Producto("Leche", 20.0, "Alimentos", 0));
        productos.add(new Producto("Laptop", 1500.0, "Electrónicos",10));
        productos.add(new Producto("TV", 800.0, "Electrónicos", 5));
        productos.add(new Producto("Mesa", 120.0, "Hogar", 15));

        //obtener lista con todos los productos cuyo stock es mayor a 0 y precio menor a 50:

        List<Producto> productosFiltrados = productos.stream()
                .filter(producto -> (producto.getStock()>0 && producto.getPrecio()<50))
                .collect(Collectors.toList());
        productosFiltrados.stream()
                .forEach(producto -> System.out.println(producto.toString()));
        System.out.println("-------------------------------");

        //obtener la lista de nombres de todos los productos de la categoria alimentos:
        productosFiltrados.clear();
        productosFiltrados = productos.stream()
                .filter(producto -> producto.getCategoria().equals("Alimentos"))
                .collect(Collectors.toList());
        productosFiltrados.stream()
                .forEach(producto -> System.out.println(producto.toString()));
        System.out.println("-------------------------------");
        //obtener el precio total de todos los productos.
        System.out.println(
                productos.stream()
                        .mapToDouble(p -> p.getPrecio())
                        .sum()
        );


    }
}