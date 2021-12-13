package com.ai;

import java.util.List;

import org.deeplearning4j.datasets.iterator.impl.CifarDataSetIterator;
import org.deeplearning4j.nn.conf.inputs.InputType;
import org.nd4j.linalg.dataset.api.iterator.DataSetIterator;

public class CifarDataSetService implements IDataSetService {

	private final InputType inputType = InputType.convolutional(32, 32, 3);
	private final int trainImageSun = 512;
	private final int testImageSun = 128;
	private final int trainBatch = 16;
	private final int testBatch = 16;

	private final CifarDataSetIterator trainIterator;
	private final CifarDataSetIterator testIterator;

	public CifarDataSetService() {
		this.trainIterator = new CifarDataSetIterator(trainBatch, trainImageSun, true);
		this.testIterator = new CifarDataSetIterator(testBatch, testImageSun, false);
	}

	@Override
	public DataSetIterator trainIterator() {
		return trainIterator;
	}

	@Override
	public DataSetIterator testIterator() {
		return testIterator;
	}

	@Override
	public InputType inputType() {
		return inputType;
	}

	@Override
	public List<String> labels() {
		return trainIterator.getLabels();
	}

}
