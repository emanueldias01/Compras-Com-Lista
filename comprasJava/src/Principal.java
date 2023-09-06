import br.com.comprasProduto.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Digite o limite do seu cartão: ");
        Scanner limite = new Scanner(System.in);
        double saldo = limite.nextDouble();


        System.out.println("1: Comprar          0: Sair");
        System.out.println("O que deseja fazer:");
        Scanner opcao = new Scanner(System.in);
        int leituraOpcao = opcao.nextInt();

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();


        while (leituraOpcao != 0) {
            if (leituraOpcao == 1) {
                System.out.println("O que gostaria de comprar: ");
                Scanner nomeProduto = new Scanner(System.in);
                String leituraNomeProduto = nomeProduto.nextLine();

                System.out.println("Qual é seu preço: ");
                Scanner precoProduto = new Scanner(System.in);
                double leituraPrecoProduto = precoProduto.nextDouble();

                if(leituraPrecoProduto > saldo){
                    System.out.println("Saldo insuficiente");

                } else{

                    saldo = saldo - leituraPrecoProduto;
                    var prod = new Produto(leituraNomeProduto, leituraPrecoProduto);
                    listaDeProdutos.add(prod);
                    System.out.println("Compra realizada!");
                }

                leituraOpcao = 0;

            }

            System.out.println("1: Comprar          0: Sair");
            System.out.println("O que deseja fazer:");
            opcao = new Scanner(System.in);
            leituraOpcao = opcao.nextInt();


            if (leituraOpcao == 0){

                Collections.sort(listaDeProdutos);

                System.out.println("Itens comprados: ");
                System.out.println(listaDeProdutos);
                System.out.println("saldo: " + saldo);


            }


        }
    }

}
