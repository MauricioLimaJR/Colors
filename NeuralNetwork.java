package colors;

import java.util.ArrayList;
import java.util.Random;

public class NeuralNetwork {

    public ArrayList<Layer> layers;
    public Layer outputLayer;
    public Layer inputLayer;

    //The neural network must have at least one layer
    public NeuralNetwork(Layer layer) {
        layers = new ArrayList<>();

        //Just for tests
        layer = createWeights(layer, layer.getSize());

        layers.add(layer);

        //Input layer is the first layer
        inputLayer = layers.get(0);

        //Outpur layer is the last layer
        outputLayer = layers.get(layer.getSize()-1);
    }

    //The layer is a added at the end
    public void addLayer(Layer newLayer) {
        layers.add(newLayer);
    }

    
public Layer createWeights(Layer layer, int numberWeights) {
        Random weightsGanarate = new Random();

        double[] weights = new double[3];

        // Create the weights randomly
        //Error on this loop
        for (int i = 0; i < weights.length; ++i) {
            weights[i] = weightsGanarate.nextDouble();
        }
   
        /*
        weights[0] = 1;
        weights[1] = 1;
        weights[2] = 1;*/

          
        for (int i = 0; i < layer.getNeurons().length; ++i) {
            layer.getNeurons()[i].setWeights(weights);
        }

        return layer;
    }
}
