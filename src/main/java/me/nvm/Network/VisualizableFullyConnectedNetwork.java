package me.nvm.Network;

public interface VisualizableFullyConnectedNetwork {

    public int[] getLayerSizes();

    public double[][] getOutputWeights(int layer);

    public double[] getBiases(int layer);

    public double[] getValues(int layer);

    public ActivationFunction getActivationFun(int layer);

}
