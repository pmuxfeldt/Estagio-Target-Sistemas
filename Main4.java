public class Main4 {
    public static void main(String[] args) {

        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double valorTotal = (sp + rj + mg + es + outros);

        double porcSp = (sp * 100) / valorTotal;
        double porcRj = (rj * 100) / valorTotal;
        double porcMg = (mg * 100) / valorTotal;
        double porcEs = (es * 100) / valorTotal;
        double porcOutros = (outros * 100) / valorTotal;

        System.out.printf("São Paulo são %.2f", porcSp);
        System.out.println();
        System.out.printf("Rio de janeiro são %.2f", porcRj);
        System.out.println();
        System.out.printf("Minas Gerais são %.2f", porcMg);
        System.out.println();
        System.out.printf("Espirito Santo são %.2f", porcEs);
        System.out.println();
        System.out.printf("Outros são %.2f", porcOutros);

    }
}