
public class contador {
    private int c;
    public contador() {
        c=0;
    }
    public contador(int c) {
        if (c>=0) {
            this.c=c;
        } else {
            this.c=0;
        }
    }
    public contador(contador c) {
        this.c=c.c;
    }
    public int getCont() {
        return c;
    }
    public void setCont(int c) {
        if (c>=0) {
            this.c=c;
        } else {
            this.c=0;
        }
    }
    public void Incrementar() {
        c++;
    }
    public void Decrementar() {
        c--;

        if (c<0) {
            c=0;
        }
    }
}
    public static void main(String[] args) {
        contador c1=new contador();
        contador c2=new contador(5);
        contador c3=new contador(c2);
        System.out.println("cont 1: " + c1.getCont());
        System.out.println("cont 2: " + c2.getCont());
        System.out.println("cont 3: " + c3.getCont());
        c2.Incrementar();
        c2.Incrementar();
        c2.Decrementar();
        System.out.println("Nuevo valor de C2: " + c2.getCont());
        c1.Decrementar();
        System.out.println("C1 luego de decrementar: " + c1.getCont());
    }
 
