
package actividadevento;



public class metodopago {
    private boolean efectivo;
    private double descuento;
    private int cuotas;

    public metodopago(boolean efectivo, double descuento, int cuotas) {
        this.efectivo = efectivo;
        this.descuento = descuento;
        this.cuotas = cuotas;
    }

    public boolean isEfectivo() {
        return efectivo;
    }

    public void setEfectivo(boolean efectivo) {
        this.efectivo = efectivo;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }
    
    



    public double calcularPagoTotal(double monto) { // al no acoplar la clase evento la unica forma de ingresar el monto es a traves de un parametro.
        if (efectivo){
            return (monto - (monto*descuento));
        } else {
                return (monto/cuotas);
                }
    }
    
}
