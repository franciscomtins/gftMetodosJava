package MetodosExercicio1;

public class Main {
    public static void main(String[] args) {

        //calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        System.out.println("------------ x ------------"); //divisor exercícios

        //Mensagem de acordo com a hora do dia
        System.out.println("Exercício mensagem de acordo com hora");
        MensagemHora.obterMensagem(7);
        MensagemHora.obterMensagem(14);
        MensagemHora.obterMensagem(1);

        System.out.println("------------ x ------------"); //divisor exercícios

        //calcular valor final do empréstimo conforme qtde de parcelas - 2/3
        System.out.println("Exercício calcular valor final empréstimo");
        CalculoEmprestimo.calcular(5000,2);
        CalculoEmprestimo.calcular(5000,3);
        CalculoEmprestimo.calcular(5000,4);

    }
}
