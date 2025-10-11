package ProgramacionOrientadaObjetos;

public class Planeta {
    private String nombre = null;
    private int cantidadSatelites = 0;
    private double masa = 0.0;
    private double volumen = 0.0;
    private int diametro = 0;
    private int distanciaMediaSol = 0;
    private TipoPlaneta tipoPlaneta;

    public enum TipoPlaneta {
        GASEOSO, TERRESTRE, ENANO
    }

    private boolean observable = false;

    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaMediaSol, TipoPlaneta tipoPlaneta, boolean observable) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaMediaSol = distanciaMediaSol;
        this.tipoPlaneta = tipoPlaneta;
        this.observable = observable;
    }
        public String getNombre() {
        return this.nombre;
    }

    public void mostrarPlaneta() {
        System.out.println("Nombre: " + this.nombre + "," + " Cantidad Satelites: " + this.cantidadSatelites + "," + " Masa: " + this.masa + "," + " Volumen: " + this.volumen + "," + " Diametro: " + this.diametro + "," + " Distancia Media Sol: " + this.distanciaMediaSol + "," + " Tipo de planeta : " + this.tipoPlaneta + "," + " Observable : " + this.observable);
    }

    public double calcularDensidad() {
        return this.masa / this.volumen;
    }

    public String  esExterior() {
        // calculamos distancia de millones de km
        double distanciaKm = this.distanciaMediaSol * 1000000;
        // utilizamos 3.4 para saber si esta mas alla (UA A DISTANCIA TIERRA Y SOL)
        double limiteSuperiorCinturon = 3.4 * 149597870;
        if ( distanciaKm > limiteSuperiorCinturon) {
            return "es exterior";
        } else {
            return "no es exterior";
        }

    }

    public static void main(String[] args) {
        Planeta planeta1 = new Planeta("Tierra", 1, 5.97e24, 1.08321e12, 12742, 150, TipoPlaneta.TERRESTRE, true);
        Planeta planeta2 = new Planeta("Júpiter", 79, 1.898e27, 1.4313e15, 139820, 778, TipoPlaneta.GASEOSO, true);
        planeta1.mostrarPlaneta();
        planeta2.mostrarPlaneta();

        System.out.println("La densidad de : " + planeta1.getNombre() + " es de: " + planeta1.calcularDensidad());
        System.out.println("La densidad de : " + planeta2.getNombre() + " es de: " + planeta2.calcularDensidad());

        System.out.println("El planeta: " + planeta1.getNombre()  + " " + planeta1.esExterior());
        System.out.println("El planeta: " + planeta2.getNombre()  + " " + planeta2.esExterior());

    }


}
