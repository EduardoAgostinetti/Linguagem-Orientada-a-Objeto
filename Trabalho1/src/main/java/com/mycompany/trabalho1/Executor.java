package com.mycompany.trabalho1;
public class Executor {
    
    public static void main(String[] args) {
        Vetor vetor = new Vetor(6);
        
        //Inserindo numeros:
        vetor.insercao(1);  //1
        vetor.insercao(2);  //2
        vetor.insercao(3);  //3
        vetor.insercao(4);  //4
        vetor.insercao(5);  //5
        vetor.insercao(6);  //6
        vetor.insercao(9); // não deixa inserir pois não tem tamanho no vetor
        vetor.mostrarVetor();
        System.out.println();
        
        //Removendo o valor da posição 3 (valor : 4)
        vetor.remocao(3); //remove o quatro (1,2,3,5,6,0)
        vetor.mostrarVetor();
        System.out.println();
        
         //Removendo o valor da posição 1 (valor : 2)
        vetor.remocao(1); //remove o dois (1,3,5,6,0,0)
        vetor.mostrarVetor();
        System.out.println();
       
        //Removendo o valor da posição 0 (valor : 1)
        vetor.remocao(0); //remove o dois (3,5,6,0,0,0)
        vetor.mostrarVetor();
        System.out.println();
        
        //Inserindo o 9 com o vetor Vago depois de remover valores:
        vetor.insercao(9);  //9
        vetor.mostrarVetor();
        System.out.println();
        
        //Buscando O valor 5 no vetor que está na posição 1:
        vetor.busca(1);
        
        //Buscando O valor 9 no vetor que está na posição 3:
        vetor.busca(3);
        
    }
}
