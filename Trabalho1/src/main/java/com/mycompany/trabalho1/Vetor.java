package com.mycompany.trabalho1;

public class Vetor <T> {
    int tamanho;
    int [] vetor;   

    public Vetor(int tamanho) {
        this.tamanho = tamanho;
        vetor = new int [this.tamanho];
        
    }

    
    
 
   public void mostrarVetor(){
       for (int i = 0; i < this.vetor.length; i++) {
           System.out.println(vetor[i]);
       }
   }
   
   public void insercao(int valor){
       int i = 0;
       int k = 1;
       while(i < vetor.length && k != i){
          if (vetor[i] == 0) {
              vetor[i] = valor;
              k--;
          } else {
              i++;
              k++;
          } 
       }
       
       if (i >= vetor.length) {
           System.out.println("Não há espaço para o valor " + valor + " neste vetor!");
       }
      
   }
   
   public void remocao (int posicao){

           for (int j = posicao; j < this.tamanho; j++) {
               if (j < (this.tamanho-1)) {
                   vetor[j] = vetor[j+1];
                   
               }else{
                   vetor[j] = 0;
                   
               }   
           } 
    }
   
   
   public void busca (int busca){
       for (int i = 0; i < this.tamanho; i++) {
           if (i == busca) {
               System.out.println();
               System.out.println("O valor do elemento na posição " + busca + " ° é igual à:" + vetor[i]);
           }else{
               
           }
       }
   }
   
   
}
