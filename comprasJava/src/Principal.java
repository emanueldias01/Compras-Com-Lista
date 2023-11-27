import br.com.comprasProduto.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Digite o limite do seu cartão: ");
        Scanner scanner = new Scanner(System.in);
        double saldo = scanner.nextDouble();


        System.out.println("1: Comprar          0: Sair");
        System.out.println("O que deseja fazer:");
        int leituraOpcao = scanner.nextInt();

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();


        while (leituraOpcao != 0) {
            if (leituraOpcao == 1) {
                System.out.println("O que gostaria de comprar: ");
                String leituraNomeProduto = scanner.nextLine();

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
            leituraOpcao = scanner.nextInt();


            if (leituraOpcao == 0){

                Collections.sort(listaDeProdutos);

                System.out.println("Itens comprados: ");
                System.out.println(listaDeProdutos);
                System.out.println("saldo: " + saldo);


            }


        }
    }

}
