
package actividadevento;


public class Evento {
    
    private String tipo;
    private int lugar;
    private int cantidadInvitados;
    private String fecha;
    private String estilo;
    private int musica;
    private int decoracion;
    private adicional adicional;

    public Evento(String tipo, int lugar, int cantidadInvitados, String fecha, String estilo, int musica, int decoracion, adicional adicional) {
        this.tipo = tipo;
        this.lugar = lugar;
        this.cantidadInvitados = cantidadInvitados;
        this.fecha = fecha;
        this.estilo = estilo;
        this.musica = musica;
        this.decoracion = decoracion;
        this.adicional = adicional;
    }

    public adicional getAdicional() {
        return adicional;
    }

    public void setAdicional(adicional adicional) {
        this.adicional = adicional;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLugar() {
        return lugar;
    }

    public void setLugar(int lugar) {
        this.lugar = lugar;
    }

    public int getCantidadInvitados() {
        return cantidadInvitados;
    }

    public void setCantidadInvitados(int cantidadInvitados) {
        this.cantidadInvitados = cantidadInvitados;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getMusica() {
        return musica;
    }

    public void setMusica(int musica) {
        this.musica = musica;
    }

    public int getDecoracion() {
        return decoracion;
    }

    public void setDecoracion(int decoracion) {
        this.decoracion = decoracion;
    }
    

    public int calcularInvitados(int precioxinvitado) { // este parametro tambien puede ser un atributo de la clase.
        int total=(cantidadInvitados*precioxinvitado);
        
        return total;
    }

    public double calcularCostoBase() {
       double total=(lugar+musica+decoracion+calcularInvitados(cantidadInvitados)+adicional.calcularCostoAdicional());
        return total; 
    }

    @Override
    public String toString() {
        return "Evento{" + "tipo=" + tipo + ", lugar=" + lugar + ", cantidadInvitados=" + cantidadInvitados + ", fecha=" + fecha + ", estilo=" + estilo + ", musica=" + musica + ", decoracion=" + decoracion + ", adicional=" + adicional + '}';
    }
    
    
}
    


