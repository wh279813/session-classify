package com.netease.ysf.shine.classify;

public interface IClassifier {

    void learn(double[] vector, int category);

    int predict(double[] vector);

}
