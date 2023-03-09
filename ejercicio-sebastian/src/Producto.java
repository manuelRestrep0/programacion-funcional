public class Producto {
    private String nombre;
    private Double precio;
    private String categoria;
    private Integer stock;

    public Producto(String nombre, Double precio, String categoria, Integer stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public Integer getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", categoria='" + categoria + '\'' +
                ", stock=" + stock +
                '}';
    }
}
