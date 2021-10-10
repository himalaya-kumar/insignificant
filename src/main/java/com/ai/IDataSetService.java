package com.ai;

import java.util.List;

import org.deeplearning4j.nn.conf.inputs.InputType;
import org.nd4j.linalg.dataset.api.iterator.DataSetIterator;

public interface IDataSetService {

	DataSetIterator trainIterator();

	DataSetIterator testIterator();

	InputType inputType();

	List<String> labels();
}