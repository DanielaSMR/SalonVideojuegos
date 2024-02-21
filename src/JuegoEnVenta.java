public class JuegoEnVenta extends Juego{
    public double precio;
    public int numCopias;
    
    public JuegoEnVenta(){

    }
    public JuegoEnVenta(String titulo,String fabricante,int anyo,double precio,int numCopias){
        super(titulo,fabricante,anyo);
        this.precio = precio;
        this.numCopias = numCopias;
    }

    public void vender(){
        numCopias--;
    }

    public String toString(){
        String texto = "\nEl precio es: " + "\t" + precio + "\nEl numero de copias es: " + "\t" + numCopias;

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




}
