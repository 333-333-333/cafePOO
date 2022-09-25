public class Cafe {

    private int Cantidad;
    private int Capacidad;
    private int Temperatura;
    private String Cafeteria;
    private String Endulzante;
    private String Tipo;


    public Cafe(int cantidad, int capacidad, int temperatura, String cafeteria, String endulzante, String tipo) {
        Cantidad = cantidad;
        Capacidad = capacidad;
        Temperatura = temperatura;
        Cafeteria = cafeteria;
        Endulzante = endulzante;
        Tipo = tipo;
    }

    public void beberSorbo() {
        if (Cantidad>=20) {
            System.out.println("*Surp*");
            Cantidad-=20;
        } else if (Cantidad>0){
            System.out.println("*Surp* \n 'Se me acabó el café :('");
        } else {
            System.out.println("'¿Y el café?'");
        }
    }

    public void soplar() {
        System.out.println("*Soplido*");
        if (Temperatura>20) {
            Temperatura-=10;
        } else if (Temperatura > 10) {
            Temperatura = 10;
        } else {
            System.out.println("Parece que el café no se puede enfriar más.");
        }
    }

    public void calentar() {
        System.out.println("*Lo coloca en la cafetera*");
        if (Temperatura<80) {
            Temperatura+=20;
        } else if (Temperatura < 100 && Temperatura <= 80) {
            Temperatura = 100;
        } else {
            System.out.println("'El café está muy caliente' :/");
        }
    }

    public void rellenarVaso() {
        int cantidadNecesitada = Capacidad - Cantidad;
        Cantidad = Capacidad;
        Temperatura = Temperatura + (int) (100 * cantidadNecesitada / Capacidad);
    }

    void rellenarVaso(String tipoCafe) {
        if (Cantidad == 0) {
            Cantidad = Capacidad;
            Tipo = tipoCafe;
        } else {
            System.out.println("'Aún no me acabo el café, y no quiero mezclarlos' :(");
        }
    }

    public int getCantidad() {
        return Cantidad;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public int getTemperatura() {
        return Temperatura;
    }

    public String getCafeteria() {
        return Cafeteria;
    }

    public String getEndulzante() {
        return Endulzante;
    }

    public String getTipo() {
        return Tipo;
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "Cantidad=" + Cantidad +
                ", Capacidad=" + Capacidad +
                ", Temperatura=" + Temperatura +
                ", Cafeteria='" + Cafeteria + '\'' +
                ", Endulzante='" + Endulzante + '\'' +
                ", Tipo='" + Tipo + '\'' +
                '}';
    }
}
