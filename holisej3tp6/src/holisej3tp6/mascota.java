package holisej3tp6;
public class mascota {
        public class Mascota {
    private String valu;
    private String te;
    private int lol;
    private double xd;
    private int clio;
    public String getn() {
        return valu;
    }
    public void setn(String n) {
        this.valu = n;
    }
    public String getr() {
        return te;
    }
    public void setr(String r) {
        this.te = r;
    }
    public int gete() {
        return lol;
    }
    public void sete(int e) {
        this.lol = e;
    }
    public double getp() {
        return xd;
    }
    public void setp(double p) {
        this.xd = p;
    }
    public int getc() {
        return clio;
    }
    public void setc(int c) {
        this.clio = c;
    }
    public void id() {
        System.out.println("nombre:"+valu);
        System.out.println("raza:"+te);
        System.out.println("edad:"+lol);
        System.out.println("peso:"+xd);
        System.out.println("codigo:"+clio);
    }
}
}  

