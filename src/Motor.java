public class Motor {

    private int cilindrada;
    private String tipoCombustible;


    public Motor(int cilindara, String tipoCombustible){
        this.cilindrada=cilindara;
        this.tipoCombustible=tipoCombustible;

    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String toString(){
        String motor = "motor {"+"Cilindrada: "+cilindrada+", tipoCombustible "+tipoCombustible+ "}";
        return motor;
    }
}