package MetodosExercicio1;

// taxas de juros para duas e três parcelas
public class CalculoEmprestimo {

    public static double getTaxaDuasParcelas() {
        return 0.30;
    }

    public static double getTaxaTresParcelas() {
        return 0.45;
    }

    public static void calcular(double valor, int parcelas) {

        if (parcelas == 2) {

            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);

        }else if (parcelas == 3) {

            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);

        }else {

            System.out.println("Não aceitamos essa quantidade de parcelas");
        }
    }

}
