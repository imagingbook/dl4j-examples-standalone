import java.io.File;

import org.deeplearning4j.examples.convolution.mnist.MnistClassifier;
import org.deeplearning4j.examples.convolution.mnist.MnistClassifierUI_WB;
import org.deeplearning4j.examples.convolution.mnist.MnistClassifier_WB;

public class Run_NIST_GUI {
	
	static String modelFile = MnistClassifier_WB.modelFile;

	public static void main(String[] args) throws Exception {
		if (!(new File(modelFile).exists())) {
			System.out.println("Training model ...");
			MnistClassifier_WB.main(null);
		}
		System.out.println("Model found.");
		MnistClassifierUI_WB.main(null);
	}

}
