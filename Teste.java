/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colors;

public class Teste {

    public static void main(String[] args) {
        //Input
        NeuralNetwork rede = new NeuralNetwork(new Layer(5));
        
        //Hidden Layer
        rede.addLayer(new Layer(4));
        
        //Outpur Layer
        rede.addLayer(new Layer(3));
        
        //Print the first neuron's weights
        System.out.println(rede.inputLayer.getNeurons()[0].getWeights()[0]);
        
    }
}
