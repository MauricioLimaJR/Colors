package colors;

import java.util.ArrayList;

public class Layer {

    private Neuron[] neurons;
    private Neuron BIAS;
    private int size;

    //This method receives the quantity of neurons in a layer    
    public Layer(int size) {
        neurons = new Neuron[size];
        for (int i = 0; i < size; ++i) {
            neurons[i] = new Neuron();
        }
    }

    public Neuron[] getNeurons() {
        return neurons;
    }

    public void setNeurons(Neuron[] neurons) {
        this.neurons = neurons;
    }

    public Neuron getBIAS() {
        return BIAS;
    }

    public void setBIAS(Neuron BIAS) {
        this.BIAS = BIAS;
    }  
    
    public int getSize() {
        return size;
    }
}
