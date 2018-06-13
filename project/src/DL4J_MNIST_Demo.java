import java.io.File;

import org.deeplearning4j.examples.convolution.mnist.MnistClassifier;
import org.deeplearning4j.examples.convolution.mnist.MnistClassifierUI;


public class DL4J_MNIST_Demo {
	
	private static final String basePath = System.getProperty("java.io.tmpdir") + "/mnist";
	private static final String modelFile = basePath + "/minist-model.zip";

	public static void main(String[] args) throws Exception {
		if (!(new File(modelFile).exists())) {
			System.out.println("Training model first (only once) ...");
			MnistClassifier.main(null);
		}
		System.out.println("Model found.");
		MnistClassifierUI.main(null);
	}

}
