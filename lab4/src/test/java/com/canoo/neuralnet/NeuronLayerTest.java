package com.canoo.neuralnet;

import org.junit.Test;

public class NeuronLayerTest {

    @Test
    public void shouldInitializeWeights() {
        // when
        NeuronLayer sut = new NeuronLayer(3, 4);

        // then
        System.out.println(sut);
    }

}