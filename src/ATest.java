public class ATest {
    public static void main(String[] args) {
        
        JuegoEnAlquiler ja1 = new JuegoEnAlquiler("Mario Bros","Nintendo", 1986, 5.0, 10, 2);
        JuegoEnVenta jv1 = new JuegoEnVenta("Mario Bros", "Nintendo", 1986, 40.0, 10);
        JuegoEnVenta jv2 = new JuegoEnVenta("Mario Bros", "Nintendo", 1985, 35.0, 10);

        JuegoEnAlquiler ja2 = new JuegoEnAlquiler(ja1);
        System.out.println("Numero total");
        System.out.println(ja2.getNumTotal());

        ja1.alquilar();
        System.out.println(ja1.toString());
        ja1.devolver();
        System.out.println(ja1.toString());

        System.out.println("COMPARACIÓN entre ja1 y jv1\n" + //
                        "***************************");
        ja1.equals(jv1);
        System.out.println("COMPARACIÓN entre ja2 y jv2\n" + //
        "***************************");
        ja2.equals(jv2);

        System.out.println("COMPARACIÓN entre ja1 y jv2\n" + //
        "***************************");
        ja1.compareTo(jv2);

        System.out.println("COMPARACIÓN entre jv1 y jv2\n" + //
        "***************************");
        jv1.compareTo(jv2);

        System.out.println("COMPARACIÓN entre ja1 y jv1\n" + //
        "***************************");
        ja1.compareTo(jv1);

    }
}
