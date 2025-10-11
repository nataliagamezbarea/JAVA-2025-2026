package ProgramacionOrientadaObjetos;

public class Automovil {
    // creamos todos los atributos que vamos a utilizar en el constructor
    private String marca;
    private int modelo;
    private int motor;
    private TipoCombustible tipoCombustible;
    private TipoAutomovil tipoAutomovil;
    private int numeroPuertas;
    private int cantidadAsientos;
    private double velocidadMaxima;
    private Color color;
    private double velocidadActual;

    // creamos una lista de tipocombustible que puede haber
    public enum TipoCombustible {
        GASOLINA , BIOETANOL , DIESEL , BIODIÉSEL , GAS_NATURAL
    }
    // creamos una lista de tipoautomovil que puede haber
    public enum TipoAutomovil {
        CIUDAD , SUBCOMPACTO , COMPACTO , FAMILIAR , EJECUTIVO , SUV
    }
    // creamos una lista de color que puede haber
    public enum Color {
        BLANCO, NEGRO , ROJO , NARANJA , AMARILLO , VERDE , AZUL , VIOLETA
    }

    // creamos el constructor y declaramos los atributos   y utilizamos  los atributos declarados al inicio
    public  Automovil (String marca , int modelo , int motor , TipoCombustible tipoCombustible , TipoAutomovil tipoAutomovil , int numeroPuertas , int cantidadAsientos , double velocidadMaxima, Color color , double velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = velocidadActual;
    }

    // generamos todos los getters
    public String getMarca() {
        return this.marca;
    }
    public int getModelo() {
        return this.modelo;
    }
    public int getMotor(){
        return this.motor;
    }
    public TipoCombustible getTipoCombustible() {
        return this.tipoCombustible;
    }
    public TipoAutomovil getTipoAutomovil() {
        return this.tipoAutomovil;
    }
    public int getNumeroPuertas() {
        return this.numeroPuertas;
    }
    public int getCantidadAsientos() {
        return this.cantidadAsientos;
    }
    public double getVelocidadMaxima() {
        return this.velocidadMaxima;
    }
    public Color getColor(){
        return this.color;
    }
    public double getVelocidadActual(){
        return this.velocidadActual;
    }


    // generamos todos los setters
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    public void setMotor(int motor) {
        this.motor = motor;
    }
    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }
    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }


 // esta función recibe el parametro de velocidad
    public void acelerar(double velocidad) {
        // si la velocidad que recibe por parametro es menor a 0 es decir es negativa
        if (velocidad < 0) {
            // printea que no puede ser negativa
            System.out.println("La velocidad no puede ser negativa");
            // return es igual que break pero dentro de un metodo
            return ;
            // si la velocidad sumada con acelerar es mayor a la máxima
        } else if (velocidadActual + velocidad > velocidadMaxima){
            // la velocidad actual será la máxima
            velocidadActual = velocidadMaxima;
            // se printea avisando
            System.out.println("Se ha alcanzado la velocidad máxima: " + velocidadMaxima + " km/h");
            // si no se suma la velocidad pasada por parametro
        } else {
                velocidadActual += velocidad;
            }
        }

    // esta función recibe el parametro de velocidad
    public void desacelerar (double velocidad) {
        // si la velocidad es 0 avisa que no puedes desacelerar un vehiculo parado
        if (this.velocidadActual == 0) {
            System.out.println("No puedes desacelerar un vehiculo que está parado");
            // si no si la velocidad actual - velocidad pasada por parametro es menor que 0 (osea que es negativa)
        } else if (this.velocidadActual - velocidad < 0) {
            // haz que sea 0 la velocidad actual
            this.velocidadActual = 0;
            // y avisa
            System.out.println("No puedes desacelerar más que la velocidad actual. El vehículo se ha detenido");
            // si no resta la velocidad pasada por parametro
        } else {
            this.velocidadActual -= velocidad;
        }
    }
    // funcion que lo que hace es poner la velocidad actual a 0 y frena
    public void frenar() {
        // si la velocidad no es 0 se frena
       if (this.velocidadActual != 0) {
           this.velocidadActual = 0;
           System.out.println("El vehículo ha frenado");
           // si no avisa que ya esta frenado
       } else {
           System.out.println("No se puede frenar un vehículo frenado");
       }
    }

    // calcula el tiempo de llegada con el parametro de distancia y devuelvelo
    public double tiempoLlegada (double distancia) {
        // si la velocidad es mayor que 0 devuelvela
        if (this.velocidadActual > 0) {
            return distancia / this.velocidadActual;
            // si no te dice que está parado y que no lo puede calcular
        } else {
            System.out.println("El vehiculo está parado no se puede calcular el tiempo de llegada");
            return 0;
        }
    }

    // metodo que enseña todos los atributos del automovil
    public void mostrarAutomovil() {
        System.out.println("Marca: " + this.marca + ","+ " Modelo: " + this.modelo + ","+  " Motor: " + this.motor + ","+  " Tipo combustible: " + this.tipoCombustible + ","+  " Tipo de automóvil: " + this.tipoAutomovil + ","+  " Numero de puertas: " + this.numeroPuertas + ","+  " Cantidad de asientos: " + this.cantidadAsientos + ","+  " Velocidad máxima " + this.velocidadMaxima +  " km/h" + ","+  " Color: " + this.color + ","+ " Velocidad actual: " + velocidadActual + " km/h");
    }

    // metodo principal
    public static void main(String[] args) {
        // crea una instancia de la clase automovil que se llame auto  , indico la velocidad actual de 100 km /h
        Automovil auto = new Automovil("Ferrari", 2005, 3, TipoCombustible.GASOLINA, TipoAutomovil.CIUDAD, 4, 4, 300, Color.AZUL, 100);
        // llama a la funcion para mostrar el automovil
        auto.mostrarAutomovil();
        // acelera 20 km por hora
        auto.acelerar(20);
        // printea la velocidad
        System.out.println("La velocidad es de: " + auto.getVelocidadActual() + " km/h");
        // descelera 20 km por hora
        auto.desacelerar(50);
        // printea la velocidad
        System.out.println("La velocidad es de: " + auto.getVelocidadActual() + " km/h");
        // frena el coche
        auto.frenar();
        // printea la velocidad
        System.out.println("La velocidad es de: " + auto.getVelocidadActual() + " km/h");

    }
}
