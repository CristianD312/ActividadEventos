package actividadevento;

class Venta {

    private metodopago metodoPago;
    private Evento evento;
    private Cliente cliente;

    public Venta(metodopago metodoPago, Evento evento, Cliente cliente) {
        this.metodoPago = metodoPago;
        this.evento = evento;
        this.cliente = cliente;
    }

    public metodopago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(metodopago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double gestionarVenta() {
        double costoEvento = evento.calcularCostoBase();
        double total = (metodoPago.calcularPagoTotal(costoEvento));
        return total;
    }

    //este metodo toma los metodos de la clase evento y clase metodo de pago para mostrar los valores.
    public String mostrarVenta() {
        String formadepago;
        if (metodoPago.isEfectivo()) {
            
            formadepago = ("En efectivo con descuento: $" + gestionarVenta());
            
        } else {
            
            formadepago = ("Total: $" + evento.calcularCostoBase() + " En " + metodoPago.getCuotas() + " Cuotas. Precio cuota: $" + gestionarVenta());
            
        }

        return ("Datos de la venta. Cliente : " + cliente.getNombre() + " Costo del evento : " + formadepago);

    }
}
