public abstract class Juego{
    private String titulo = "Sin titulo";
    private String fabricante = "Desconocido";
    private int anyo = 1970;
    private int numTotal;

    public Juego(){
        numTotal++;
    }

    public Juego(String titulo, String fabricante, int anyo){
        this.titulo = titulo;
        this.fabricante = fabricante;
        this.anyo = anyo;
        comprobarAnyo(anyo);
        numTotal++;
    }

    private void comprobarAnyo(int a){
        if(a < 1970){
            anyo = 1970;
        }else if(a >= 1970){
            anyo = a;
        }
    }

    public String toString(){
        String texto = "Juego: " + "\t" + titulo + "\n Fabricante: " + "\t" + fabricante 
        + "\n Año de creacion: " + "\t" + anyo + "\t" + "Numero de juegos totales: " + numTotal; 
        
        return texto;
    }

    public void equals(Juego juego){
        if(this.titulo == juego.titulo && 
        this.fabricante == juego.fabricante
        && this.anyo == juego.anyo){
            System.out.println("Los juegos son iguales");
        }else
            System.out.println("No son iguales");
    }

    public void compareTo(Juego juego){
        if(this.titulo.length() < juego.titulo.length() || this.fabricante.length() < juego.fabricante.length() || this.anyo < juego.anyo){
            System.out.println("El juego es menor");
        }else{
            System.out.println("El juego es mayor");
        }
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public int getanyo() {
        return anyo;
    }
    public void setanyo(int anyo) {
        this.anyo = anyo;
    }
    public int getNumTotal() {
        return numTotal;
    }
    public void setNumTotal(int numTotal) {
        this.numTotal = numTotal;
    }

}
