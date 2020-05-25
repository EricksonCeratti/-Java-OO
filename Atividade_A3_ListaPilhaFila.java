package atividade_a3_lista.pilha.fila;

import java.util.ArrayList;
import java.util.ArrayDeque;

/**
 *
 * @author Erickson
 */
public class Atividade_A3_ListaPilhaFila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList lista = new ArrayList(5);
        ArrayDeque pilha = new ArrayDeque(5);
        ArrayDeque fila = new ArrayDeque(10);
        
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        
        System.out.println(lista + " - Números inseridos na Lista.");       
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||");
        while(!lista.isEmpty()){
            Object elemento = lista.remove(0);
            pilha.add(elemento);
        System.out.println(lista + " - Dados removidos da Lista para inserir na Pilha");    
        }
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println(pilha + " - Dados inseridos na Pilha"); 
        while(!pilha.isEmpty()){
            Object elemento = pilha.pop();
            fila.add(elemento);
        System.out.println(pilha + " - Dados removidos da Pilha para inserir na Fila");
        
        }
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println(fila + " - Dados inseridos na Fila");
    }
    
}
