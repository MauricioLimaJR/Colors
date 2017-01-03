package colors;

public class Neuron {

    private double input;
    private double output;
    private double[] weights;
    
    //Getters and Setters
    public double getInput() {
        return input;
    }

    public void setInput(double input) {
        this.input = input;
    }

    public double getOutput() {
        return output;
    }

    public void setOutput(double output) {
        this.output = output;
    }

    public double[] getWeights() {
        return weights;
    }

    public void setWeights(double[] weights) {
        this.weights = weights;  
    }
    
    //Activation function is the sigmoid   
    private double activation (double value) {
        value = 1 / (Math.exp(-value)+1);
        return value;
    }
}
