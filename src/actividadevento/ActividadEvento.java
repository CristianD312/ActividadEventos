
package actividadevento;

import java.util.ArrayList;
import java.util.List;


public class ActividadEvento {

  
    public static void main(String[] args) {
        double descuentoEfectivo=0.1;
        int musica=500;
        int decoracion=200;
        
        List <Cliente> clientes = new ArrayList<>();
        List <adicional> adicionales = new ArrayList<>();
        List <Evento> eventos = new ArrayList<>();
        List <Venta> ventas = new ArrayList<>();
        
        // forma desglosada de hacer una lista
        Cliente cliente = new Cliente ("Cristian","1234-5678");
        clientes.add(cliente);
        //forma resumida de hacer listas
        clientes.add(new Cliente ("Joaquin","1111-2222"));
        clientes.add(new Cliente ("Marcelo","3333-44444"));
        clientes.add(new Cliente ("Fernanda","5555-6666"));
        clientes.add(new Cliente ("Beatriz","7777-8888"));
        
        adicionales.add(new adicional(100, 100, 100, true, true, false));
        adicionales.add(new adicional(100, 100, 100, false, false, false));
        adicionales.add(new adicional(100, 100, 100, false, true, true));
        
               
        Evento evento = new Evento("salon 1", 1000, 100, "Agosto", "Formal", musica, decoracion, adicionales.get(0));
        eventos.add(evento);
        eventos.add(new Evento("salon 2", 1500, 20, "Febrero", "Casual", musica, decoracion, adicionales.get(1)));
        eventos.add(new Evento("salon 3", 2000, 200, "diciembre", "gran Evento", musica, decoracion, adicionales.get(2)));
 
        
        // se genera el objeto metododepago en el momento para posteriormente ingresar dentro de la venta.
        metodopago metodopagoVenta1 = new metodopago(true, descuentoEfectivo, 0);       
        Venta nuevaVenta= new Venta(metodopagoVenta1, eventos.get(0), clientes.get(0));
        ventas.add(nuevaVenta);
        
        metodopago metodopagoVenta2 = new metodopago(false, descuentoEfectivo, 6);
        ventas.add(new Venta(metodopagoVenta2, eventos.get(1), clientes.get(2)));
        
        metodopago metodopagoVenta3 = new metodopago(false, descuentoEfectivo, 3);
        ventas.add(new Venta(metodopagoVenta3, eventos.get(2), clientes.get(4)));
        
        
        // lista mostrando todas las ventas.
        
        for (Venta venta : ventas) {
            System.out.println("Total : "+venta.getEvento().calcularCostoBase());
            System.out.println("Total : "+venta.mostrarVenta());
            System.out.println("----------------------------------------------------------------");
            
            
        }

        
       

    }
    
}
