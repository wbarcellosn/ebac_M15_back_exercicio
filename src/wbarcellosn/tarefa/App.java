/**
 * @author winic
 */
package wbarcellosn.tarefa;

import wbarcellosn.tarefa.cars.Car;
import wbarcellosn.tarefa.factories.Factory;
import wbarcellosn.tarefa.factories.FordFactory;
import wbarcellosn.tarefa.factories.VolkswagenFactory;

import javax.swing.*;

public class App {

    public static void main (String[] args){

        Factory factory;

        String opcao = JOptionPane.showInputDialog(
                null,
                "ESCOLHA A MONTADORA\n\nDigite 1 para VOLKSWAGEN;\nDigite 2 para FORD;\n\nDigite 0 para SAIR;\n\n",
                "Cadastro",
                JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)){

            if (opcao.isEmpty()){
                Sair();
            }

            opcao = JOptionPane.showInputDialog(
                    null,
                    "OPÇÃO INVÁLIDA!\n\nDigite 1 para VOLKSWAGEN;\nDigite 2 para FORD;\n\nDigite 0 para SAIR;\n\n",
                    "",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        while (isOpcaoValida(opcao)){

            if(isOpcaoSair(opcao)){
                Sair();
            } else if (isOpcaoVolks(opcao)) {
                factory = getFactory("1");
                Car car = factory.create(chooseTypeCar());
                JOptionPane.showMessageDialog(
                        null,
                        car.toString(),
                        "",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            else if (isOpcaoFord(opcao)) {
                factory = getFactory("2");
                Car car = factory.create(chooseTypeCar());
                JOptionPane.showMessageDialog(
                        null,
                        car.toString(),
                        "",
                        JOptionPane.INFORMATION_MESSAGE);
            }

            opcao = JOptionPane.showInputDialog(
                    null,
                    "ESCOLHA A MONTADORA\n\nDigite 1 para VOLKSWAGEN;\nDigite 2 para FORD;\n\nDigite 0 para SAIR;\n\n",
                    "",
                    JOptionPane.INFORMATION_MESSAGE);
        }


    }



    private static boolean isOpcaoValida(String opcao) {
        return opcao.equals("1") || opcao.equals("2") || opcao.equals("0");
    }

    private static boolean isOpcaoVolks(String opcao) {
        return opcao.equals("1");
    }

    private static boolean isOpcaoFord(String opcao) {
        return opcao.equals("2");
    }
    private static boolean isOpcaoSair(String opcao) {
        return opcao.equals("0");
    }

    private static void Sair() {
        JOptionPane.showMessageDialog(
                null,
                "Até logo!",
                "Sair",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static Factory getFactory(String option) {
        if (option.equals("1")) {
            return new VolkswagenFactory();
        } else if (option.equals("2")){
            return new FordFactory();
        }
        return null;
    }

    private static String chooseTypeCar(){
        String opcao = JOptionPane.showInputDialog(
                null,
                "SELECIONE O TIPO DESEJADO\n\nDigite 1 para SEDAN;\nDigite 2 para CAMINHONETE;\n\nDigite 0 para SAIR;\n\n",
                "",
                JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)){

            if (opcao.isEmpty()){
                Sair();
            }

            opcao = JOptionPane.showInputDialog(
                    null,
                    "OPÇÃO INVÁLIDA!\n\nDigite 1 para SEDAN;\nDigite 2 para CAMINHONETE;\n\nDigite 0 para SAIR;\n\n",
                    "",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        return opcao;
    }
}
