package holisej4tp6;
public class cuenta {
    private String nombre;
    private String numero;
    private double tipoi;
    private double saldo;
    public cuenta() {
    }
    public cuenta(String nombre, String numero, double tipoi, double saldo) {
        this.nombre=nombre;
        this.numero=numero;
        this.tipoi=tipoi;
        this.saldo=saldo;
    }
    public cuenta(cuenta c) {
        this.nombre=c.nombre;
        this.numero=c.numero;
        this.tipoi=c.tipoi;
        this.saldo=c.saldo;
    }
    public String getn() {
        return nombre;
    }
    public void setn(String nom) {
        this.nombre=nom;
    }
    public String getnc() {
        return numero;
    }
    public void setnc(String nc) {
        this.numero=nc;
    }
    public double getti() {
        return tipoi;
    }
    public void setti(double ti) {
        this.tipoi=ti;
    }
    public double gets() {
        return saldo;
    }
    public void sets(double s) {
        this.saldo=s;
    }
    public boolean i(double cant) {
        if (cant<0) {
            return false;
        }
        saldo+=cant;
        return true;
    }
    public boolean ri(double cant) {
        if (cant<0 || cant>saldo) {
            return false;
        }
        saldo-=cant;
        return true;
    }
    public boolean trans(cuenta d, double i) {
        if (i<0 || i>saldo) {
            return false;
        }
        saldo-=i;
        d.saldo+=i;
        return true;
    }
}
 
