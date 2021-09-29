package RestauranteEDoBem;

import java.util.Scanner;

public class Sistemas {

    //Atributos

    private String prato;

    //Método entrada de dados

    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

//Menu de cadastro

    public static void menu() {
        System.out.println("BEM VINDOS AO RESTAURANTE É DO BEM");
        System.out.println("Digite 1 - Para cadastrar um prato. ");
        System.out.println("Digite 3 - Para sair");
    }

    //Método cadastro de pratos


    }
