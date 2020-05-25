package atividade_a3;

import java.util.ArrayList;
import java.util.ArrayDeque;
        
/**
 *
 * @author Erickson
 */
public class Atividade_a3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ArrayList lista = new ArrayList(5); 
     
     
     lista.add("1"); 
     lista.add("2");
     lista.add("3");
     lista.add("4");
     lista.add("5");
 
     System.out.println(lista + " - Dados foram inseridos na lista");
     System.out.println("-------------------------------------------");
     System.out.println("Removendo os dados a partir da celula inicial da lista");
     
     while(!lista.isEmpty()) {
        lista.remove(0);
        System.out.println(lista);
         
     }
    
    System.out.println("Todos os dados foram removidos da lista!");
    System.out.println("-------------------------------------------");
    System.out.println("Inserindo os dados da lista em uma Pilha");
    ArrayDeque pilha = new ArrayDeque(5);
    
    
    pilha.push(1);
    pilha.push(2);
    pilha.push(3);
    pilha.push(4);
    pilha.push(5);
    
    System.out.println(pilha);
    System.out.println("--------------------------------------------");
    System.out.println("Remvoendo os dados da pilha");
    
    pilha.clear();
    
    System.out.println(pilha);
    
    System.out.println("--------------------------------------------");
    System.out.println("Inserindo os dados da pilha em uma fila");
    ArrayDeque fila = new ArrayDeque(10);
    
    fila.add(1);
    fila.add(2);
    fila.add(3);
    fila.add(4);
    fila.add(5);
    fila.add(0);
    fila.add(0);
    fila.add(0);
    fila.add(0);
    fila.add(0);
    
    System.out.println(fila);
    
    System.out.println("--------------------------------------------");
    System.out.println("Inserindo os números na lista");
    
    
    lista.add(6);
    lista.add(7);
    lista.add(8);
    lista.add(9);
    lista.add(10);
    
    System.out.println(lista);
    
    System.out.println("---------------------------------------------");
    System.out.println("Removendo os dados da lista");
    
    while(!lista.isEmpty()){
        lista.remove(0);
    System.out.println(lista);
    }
    
    System.out.println("Removido todos os dados da lista!");
    System.out.println("----------------------------------");
    System.out.println("Inserindo os dados da lista em uma pilha");
    
    pilha.push(6);
    pilha.push(7);
    pilha.push(8);
    pilha.push(9);
    pilha.push(10);
    
    System.out.println(pilha);
    System.out.println("-----------------------------------");
    System.out.println("Incluindo os dados da pilha na fila");
    
    fila.add(0);
    fila.add(0);
    fila.add(0);
    fila.add(0);
    fila.add(0);
    fila.add(6);
    fila.add(7);
    fila.add(8);
    fila.add(9);
    fila.add(10);
    
    System.out.println(fila); 
    
    }
    
   
}
