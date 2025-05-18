import java.time.LocalDate;

public class Auto {
    //asignandole final y quitandole el set se asegura que esta variable no se pueda modificar luego de asignada
    final private String matricula;
    private String color;
    private String marca;
    private String modelo;
    private boolean esDeLujo;
    private String puertas;
    private int anio;
    //agarra el año actual desde los datos del PC, tenia curiosidad de hacerlo con esto pero simplemente podria ser añoActual = 2025;
    private static int añoActual = LocalDate.now().getYear();
    private String venta;
    private String revision;
    private static int cantidadAutos = 0;
    private Motor motor;
    // Se pueden crear varios constructores con diferentes parámetros (sobrecarga).
    // No se puede crear un constructor con la misma lista de parámetros que otro existente.
    // El constructor debe tener el mismo nombre que la clase.
    public Auto(){
        this.matricula = "";
        this.color= "blanco";
        this.marca= "";
        this.modelo= "";
        this.puertas="";
        this.anio=0;
        this.venta="no";
        this.revision="";
        this.motor = new Motor(0, "desconocido");

    }
    public Auto(String matricula, String color, String marca, String modelo, String puertas,int anio, String venta, String revision, Motor motor){
        this.matricula = matricula;
        this.color= color;
        this.marca= marca;
        this.modelo= modelo;
        this.puertas= puertas;
        this.anio=anio;
        this.venta=venta;
        this.revision=revision;
        this.motor = motor;

        cantidadAutos++;
    }

    public void pintarDeVerde() {
        this.color = "verde";
    }
    //sin set para evitar que se modifiqe
    public String getMatricula() {
        return matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        if("Volkswagen".equalsIgnoreCase(marca) && "Jetta".equalsIgnoreCase(modelo)) {
            return "Bora";}
        if("Hyunday".equalsIgnoreCase(marca) && "Scoupe".equalsIgnoreCase(modelo)) {return "Coupe";
        }
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean esDeLujo(){
        return "Ferrari".equalsIgnoreCase(marca)||"Audi".equalsIgnoreCase(marca)||"bugatti".equalsIgnoreCase(marca);
    }

    public String getPuertas() {
        if(!puertas.equals("3") && !puertas.equals("5")){
            this.puertas="5";
        }
        return puertas;
    }

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public static int getAñoActual() {
        return añoActual;
    }

    public static void setAñoActual(int añoActual) {
        Auto.añoActual = añoActual;
    }
    public boolean pagaPatente() {
        return anio != añoActual;
    }
    public boolean noPagaPatente(){
        return anio == añoActual;
    }

    public String getVenta() {
        if("Si".equalsIgnoreCase(venta)){
            venta="Esta a la venta";
        }else {
            venta="No esta a la venta";
        }

        return venta;
    }

    public void setVenta(String venta) {
        this.venta = venta;
    }
    //muy similar al metodo de venta
    public String getRevision() {
        if("Si".equalsIgnoreCase(revision)){
            revision="revision necesaria";
        }else {
            revision="No necesita revision";
        }
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public static int getCantidadAutos() {
        return cantidadAutos;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    //si el toString se le cambia la definion a private no se podra acceder fuera de la clase
    public String toString(){
        String datosA = "Auto {" +"matricula: "+matricula +", Color: "+color+", Marca: "+marca+", modelo: "+getModelo()+ ", es de lujo? : "+esDeLujo()+ ", puertas "+getPuertas() + ", Estado venta: "+getVenta()+". Estado Revision: "+getRevision()+ ", \nmotor: "+motor.toString();
        return datosA;
    }
}
