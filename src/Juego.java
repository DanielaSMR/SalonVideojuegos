public abstract class Juego {
    private String titulo = "Sin titulo";
    private String fabricante = "Desconocido";
    private int anyo;
    private int numTotal;

    public Juego(){
        numTotal++;
    }

    public Juego(String titulo, String fabricante, int anyo){
        this.titulo = titulo;
        this.fabricante = fabricante;
        this.anyo = anyo;
        numTotal++;
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
