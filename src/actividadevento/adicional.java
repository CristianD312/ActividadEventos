
package actividadevento;


public class adicional {
    
private int costoFotografia;
private int costoEntretenimiento;
private int costoSeguridad;
private boolean fotografia;
private boolean entretenimiento;
private boolean seguridad;

    public adicional(int costoFotografia, int costoEntretenimiento, int costoSeguridad, boolean fotografia, boolean entretenimiento, boolean seguridad) {
        this.costoFotografia = costoFotografia;
        this.costoEntretenimiento = costoEntretenimiento;
        this.costoSeguridad = costoSeguridad;
        this.fotografia = fotografia;
        this.entretenimiento = entretenimiento;
        this.seguridad = seguridad;
    }

    public boolean isFotografia() {
        return fotografia;
    }

    public void setFotografia(boolean fotografia) {
        this.fotografia = fotografia;
    }

    public boolean isEntretenimiento() {
        return entretenimiento;
    }

    public void setEntretenimiento(boolean entretenimiento) {
        this.entretenimiento = entretenimiento;
    }

    public boolean isSeguridad() {
        return seguridad;
    }

    public void setSeguridad(boolean seguridad) {
        this.seguridad = seguridad;
    }



    public int getCostoFotografia() {
        return costoFotografia;
    }

    public void setCostoFotografia(int costoFotografia) {
        this.costoFotografia = costoFotografia;
    }

    public int getCostoEntretenimiento() {
        return costoEntretenimiento;
    }

    public void setCostoEntretenimiento(int costoEntretenimiento) {
        this.costoEntretenimiento = costoEntretenimiento;
    }

    public int getCostoSeguridad() {
        return costoSeguridad;
    }

    public void setCostoSeguridad(int costoSeguridad) {
        this.costoSeguridad = costoSeguridad;
    }

 

    public double calcularCostoAdicional() {
        double total=0;
        if (fotografia) {
            total=(total+costoFotografia);
        }
        if (entretenimiento) {
             total=(total+costoEntretenimiento);
        }
        if (seguridad) {
             total=(total+costoSeguridad);
        }

        return total;
    }
    
    
    
}

    

