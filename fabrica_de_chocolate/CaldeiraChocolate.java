public class CaldeiraChocolate {
    private static CaldeiraChocolate instancia;
    private boolean vazia = true;
    private boolean fervida = false;

    private CaldeiraChocolate() {}

    public static CaldeiraChocolate getInstancia() {
        if (instancia == null) {
            instancia = new CaldeiraChocolate();
        }
        return instancia;
    }

    public void encher() {
        if (vazia) {
            vazia = false;
        }
    }

    public void ferver() {
        if (!vazia && !fervida) {
            fervida = true;
        }
    }

    public void drenar() {
        if (fervida) {
            vazia = true;
            fervida = false;
        }
    }

    public boolean isVazia() {
        return vazia;
    }

    public boolean isFervida() {
        return fervida;
    }
}

    
