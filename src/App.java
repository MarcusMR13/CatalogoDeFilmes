import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Esse é o Screen Match");

        String nomeFilme = "Wall-e";
        int anoLancamento = 2001;
        double notaDoFilme = 4.49;
        boolean isBom;

        System.out.println(String.format("Nome: %s,\nAno de Lançamento: %d,\nNota: %.2f", nomeFilme, anoLancamento,
                notaDoFilme));

        System.out.println(String.format((notaDoFilme >= 4.50)
                ? "O Filme: %s é bom"
                : "O Filme: %s é ruim", nomeFilme,
                nomeFilme));

        
            
        /*
         * if (notaDoFilme >= 4.50) {
         * isBom = true;
         * System.out.println("O Filme: Velozes e Furiosos é bom?" + isBom);
         * }else {
         * isBom = false;
         * System.out.println("O Filme: Velozes e Furiosos é bom?" + isBom);
         * }
         */
    }
}