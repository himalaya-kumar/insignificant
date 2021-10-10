package com.ai;

import org.deeplearning4j.nn.conf.Updater;

import lombok.Value;

@Value
public class CnnModelProperties{
	
	private final int epochNum = 512;
	
	private final double learningRate = 0.01;
	
	private final Updater optimizer = Updater.ADAM;
	
}