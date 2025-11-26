import java.util.Scanner;

public class Facturacion  {
    public static void main(String[] args) {
        System.out.printf("-- Nuevo Producto --");

        //Requerimientos
        String nombreProducto;
        double precioProducto;
        int cantidaComprar;
        double impuesto = 0.21;
        double dineroCliente;

        //Entrada Datos
        Scanner scanner = new Scanner(System.in);
        System.out.println("A continuación escriba por favor lo solicitado: ");

        System.out.println("Escriba su nombre: ");
        String nombreUsuario = scanner.nextLine();

        System.out.println("Escriba el nombre del producto a comprar: ");
        nombreProducto = scanner.nextLine();
        System.out.println("Escriba el valor del producto a comprar: ");
        precioProducto = scanner.nextInt();

        System.out.println("¿Cuántos va a comprar?");
        cantidaComprar = scanner.nextInt();

        System.out.println("¿Cuántos dinero trae?");
        dineroCliente = scanner.nextInt();


        //Logica de negocio
        double subtotal = precioProducto * cantidaComprar;
        double totalPagar = subtotal + ( subtotal * impuesto);

        //Casting
        int totalRedondeado = (int) totalPagar;

        //Validacion
        boolean puedeComprar = totalRedondeado < dineroCliente;

        //Salida Final...Final
        System.out.println("-- Ticket compra --");

        System.out.println("Fecha: 26/11/2025");
        System.out.println("Bogota D.c");
        System.out.println("Mercadito Generacional");
        System.out.println("Cliente:" + nombreUsuario);
        System.out.println("Efectivo cliente: $" + dineroCliente);
        System.out.println("Orden de compra: 1");
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        System.out.println("Producto: " + nombreProducto );
        System.out.println("Precio producto: $" + precioProducto);
        System.out.println("Cantidades ordenadas: " + cantidaComprar + "un.");
        System.out.println("Total antes inpuestos: " + cantidaComprar * precioProducto);
        System.out.println("Impuestos: " + (impuesto*100) + "%");
        System.out.println("Total compra con impuestos: $" + totalRedondeado);
        System.out.println("-------------------------");
        System.out.println("Verificando compra...");
        System.out.println("-------------------------");
        System.out.println("El cliente puede comprar? " + puedeComprar);
    }
}
