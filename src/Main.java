public class Main {
    public static void main(String[] args) {

        //Cria uma lista que poderá conter no máximo 10 números
        Lista lista = new Lista(10);

        lista.add(5); //Adiciona o número 5 ao final da lista
        lista.add(10.3); //Adiciona o número 10.3 ao final da lista

        //Imprime 2, já que é a quantidade de números já inseridos
        System.out.println(lista.lenght());

        //Imprimindo os elementos da lista
        for (int i = 0; i < lista.lenght(); i++) {
            System.out.println(lista.getListItem(i));
        }

        //Imprime “índice inválido”
        System.out.println(lista.getListItem(2));

        //Adiciona -10 ao final da lista
        lista.add(-10);

        //Imprime -10
        System.out.println(lista.getListItem(2));
        lista.setListItem(1, 1000); //Troca o valor 10.3, no índice 1, por 1000

        lista.cleanList(); //Remove todos os elementos da lista
    }
}
