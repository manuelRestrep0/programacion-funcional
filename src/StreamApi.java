import java.util.ArrayList;
import java.util.List;

public class StreamApi {
    public static void main(String[] args){
        List<Empleado> empleados = new ArrayList<>();
        Empleado oscar = new Empleado("Oscar Blacarte", "Sistemas");
        Empleado liliana = new Empleado("Liliana Castro", "Sistemas");
        Empleado biviana = new Empleado("Biviana Martinez", "Sistemas");
        Empleado manuel = new Empleado("Manuel Lopez", "RH");
        Empleado oscar2 = new Empleado("Oscar Blacarte", "Sistemas");
        empleados.add(oscar);
        empleados.add(liliana);
        empleados.add(biviana);
        empleados.add(manuel);
        empleados.add(oscar2);

        empleados.stream()
                .filter(empleado -> empleado.getDepartamento().equals("Sistemas"))
                .sorted((empleado1,empleado2) -> empleado1.getNombre().compareToIgnoreCase(empleado2.getNombre()))
                .distinct()
                .forEach((empleado) -> System.out.println(empleado));
    }
}
