public class FabricaDeChocolate {
    public static void main(String[] args) {
        CaldeiraChocolate caldeira = CaldeiraChocolate.getInstancia();

        System.out.println("Caldeira vazia: " + caldeira.isVazia());
        caldeira.encher();
        System.out.println("Caldeira vazia após encher: " + caldeira.isVazia());

        caldeira.ferver();
        System.out.println("Caldeira fervida: " + caldeira.isFervida());

        caldeira.drenar();
        System.out.println("Caldeira vazia após drenar: " + caldeira.isVazia());
    }
}
