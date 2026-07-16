
public class libro {
    private String t;
    private String a;
    private int ejs;
    private int p;
    public libro() {
    }
    public libro(String tit, String aut, int nuejl, int nuejp) {
        this.t=t;
        this.a=a;
        this.ejs=ejs;
        this.p=p;
    }
    public String gett() {
        return t;
    }
    public void sett(String t) {
        this.t=t;
    }
    public String geta() {
        return a;
    }
    public void seta(String a) {
        this.a=a;
    }
    public int getejs() {
        return ejs;
    }
    public void setejs(int ejs) {
        this.ejs=ejs;
    }
    public int getp() {
        return p;
    }
    public void setp(int p) {
        this.p=p;
    }
    public boolean Prestar() {
        if (p<ejs) {
            p++;
            return true;
        }
        return false;
    }
    public boolean d() {
        if (p>0) {
            p--;
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "Título: "+t +
               "\na: "+a +
               "\nejs: "+ejs +
               "\np: "+p;
    }
}
    public static void main(String[] args) {
    }
    
