package com.ai;

import java.util.stream.IntStream;

import org.deeplearning4j.eval.Evaluation;
import org.deeplearning4j.nn.api.OptimizationAlgorithm;
import org.deeplearning4j.nn.conf.MultiLayerConfiguration;
import org.deeplearning4j.nn.conf.NeuralNetConfiguration;
import org.deeplearning4j.nn.conf.layers.ConvolutionLayer;
import org.deeplearning4j.nn.conf.layers.OutputLayer;
import org.deeplearning4j.nn.conf.layers.SubsamplingLayer;
import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.deeplearning4j.nn.weights.WeightInit;
import org.nd4j.linalg.activations.Activation;
import org.nd4j.linalg.lossfunctions.LossFunctions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CnnModel {

	Logger LOGGER = LoggerFactory.getLogger(CnnExample.class);
	
	private final IDataSetService dataSetService;

	private final MultiLayerNetwork network;

	private final CnnModelProperties properties;

	public CnnModel(IDataSetService dataSetService, CnnModelProperties properties) {
		this.dataSetService = dataSetService;
		this.properties = properties;

		MultiLayerConfiguration configuration = new NeuralNetConfiguration.Builder().seed(1611)
				.optimizationAlgo(OptimizationAlgorithm.STOCHASTIC_GRADIENT_DESCENT)
				.learningRate(properties.getLearningRate()).regularization(Boolean.TRUE)
				.updater(properties.getOptimizer()).list().layer(0, convo5x5()).layer(1, pooling2x2Stride2())
				.layer(2, convo3x3Stride1Padding2()).layer(3, pooling2x2Stride1()).layer(4, convo3x3Stride1Padding1())
				.layer(5, pooling2x2Stride1()).layer(6, dense()).pretrain(false).backprop(Boolean.TRUE)
				.setInputType(dataSetService.inputType()).build();
		network = new MultiLayerNetwork(configuration);
	}

	void train() {
		network.init();
		int epochsNum = properties.getEpochNum();
		IntStream.range(1, epochsNum + 1).forEach(epoch -> {
			LOGGER.info("Epoch {} / {}", epoch, epochsNum);
			network.fit(dataSetService.trainIterator());
		});
	}

	/**
	 * Convolutional layers are the major building blocks used in convolutional
	 * neural networks. A convolution is the simple application of a filter to an
	 * input that results in an activation. Repeated application of the same filter
	 * to an input results in a map of activations called a feature map, indicating
	 * the locations and strength of a detected feature in an input, such as an
	 * image.
	 * 
	 * @return
	 */
	private ConvolutionLayer convo5x5() {
		return new ConvolutionLayer.Builder(5, 5).nIn(3).nOut(16).stride(1, 1).padding(1, 1)
				.weightInit(WeightInit.XAVIER_UNIFORM).activation(Activation.RELU).build();
	}

	public Evaluation evaluate() {
		return network.evaluate(dataSetService.testIterator());
	}

	private SubsamplingLayer pooling2x2Stride2() {
		return new SubsamplingLayer.Builder(SubsamplingLayer.PoolingType.MAX).kernelSize(2, 2).stride(2, 2).build();
	}

	private ConvolutionLayer convo3x3Stride1Padding2() {
		return new ConvolutionLayer.Builder(3, 3).nOut(32).stride(1, 1).padding(2, 2)
				.weightInit(WeightInit.XAVIER_UNIFORM).activation(Activation.RELU).build();
	}

	private SubsamplingLayer pooling2x2Stride1() {
		return new SubsamplingLayer.Builder(SubsamplingLayer.PoolingType.MAX).kernelSize(2, 2).stride(1, 1).build();
	}

	private ConvolutionLayer convo3x3Stride1Padding1() {
		return new ConvolutionLayer.Builder(3, 3).nOut(64).stride(1, 1).padding(1, 1)
				.weightInit(WeightInit.XAVIER_UNIFORM).activation(Activation.RELU).build();
	}

	private OutputLayer dense() {
		return new OutputLayer.Builder(LossFunctions.LossFunction.MEAN_SQUARED_LOGARITHMIC_ERROR)
				.activation(Activation.SOFTMAX).weightInit(WeightInit.XAVIER_UNIFORM)
				.nOut(dataSetService.labels().size() - 1).build();
	}
}