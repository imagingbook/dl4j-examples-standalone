import java.io.File;

import org.deeplearning4j.examples.convolution.mnist.MnistClassifier;
import org.deeplearning4j.examples.convolution.mnist.MnistClassifierUI_WB;

public class Run_NIST_GUI {
	
	static String basePath = System.getProperty("java.io.tmpdir") + "/mnist";

	public static void main(String[] args) throws Exception {
		if (!(new File(basePath + "/minist-model.zip").exists())) {
			System.out.println("Training model ...");
			MnistClassifier.main(null);
		}
		System.out.println("Model found.");
		MnistClassifierUI_WB.main(null);
	}

}
