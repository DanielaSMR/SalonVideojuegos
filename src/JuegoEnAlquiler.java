public class JuegoEnAlquiler extends Juego implements Alquiler{
    public double precio;
    public int numCopias;
    public int numDiasAlquilado;
    
    public JuegoEnAlquiler(){

    }
    public JuegoEnAlquiler(String titulo,String fabricante,int anyo,double precio,int numCopias, int numDiasAlquilado){
        super(titulo,fabricante,anyo);
        getNumTotal();
        this.precio = precio;
        this.numCopias = numCopias;
        this.numDiasAlquilado = numDiasAlquilado;
    }

    public JuegoEnAlquiler(JuegoEnAlquiler copiarJuego){
        super(copiarJuego.getTitulo(),copiarJuego.getFabricante(),copiarJuego.getanyo());
        getNumTotal();
        precio = copiarJuego.precio;
        numCopias = copiarJuego.numCopias;
        numDiasAlquilado = copiarJuego.numDiasAlquilado;
    }
    
    public void alquilar(){
        numCopias--;
    }


    public void devolver(){
        numCopias++;
    }


    public double precioFinal(){
        double total = precio * numDiasAlquilado;
        return total;
    }


    public String toString(){
        String texto = "\nEl numero de copias actuales es: " + "\t" + numCopias + "\nEl numero de dias alquilado es: " + "\t" + numDiasAlquilado +
            "\nPrecio Final: " + precioFinal();

        return super.toString() + texto;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getNumCopias() {
        return numCopias;
    }
    public void setNumCopias(int numCopias) {
        this.numCopias = numCopias;
    }
    public int getNumDiasAlquilado() {
        return numDiasAlquilado;
    }
    public void setNumDiasAlquilado(int numDiasAlquilado) {
        this.numDiasAlquilado = numDiasAlquilado;
    }

}  
