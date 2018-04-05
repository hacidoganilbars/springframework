package com.hacidoganilbars;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Operatorler operatorler= context.getBean("operatorlerBean",Operatorler.class);
		
		System.out.println("equalTest: " + operatorler.isEqualTest() + "\nnotEqualTest: " + operatorler.isNotEqualTest()
		+ "\nlessThanTest: " + operatorler.isLessThanTest() + "\nlessThanOrEqualTest: "
		+ operatorler.isLessThanOrEqualTest() + "\ngreaterThanTest: " + operatorler.isGreaterThanTest()
		+ "\ngreaterThanOrEqualTest: " + operatorler.isGreaterThanOrEqulaTest() + "\nandTest: "
		+ operatorler.isAndTest() + "\norTest: " + operatorler.isOrTest() + "\nnotTest: "
		+ operatorler.isNotTest() + "\naddTest: " + operatorler.getAddTest() + "\naddStringTest: "
		+ operatorler.getAddStringTest() + "\nsubtractionTest: " + operatorler.getSubtractionTest()
		+ "\nmultiplicationTest: " + operatorler.getMultiplicationTest() + "\ndivisionTest: "
		+ operatorler.getDivisionTest() + "\nmodulusTest: " + operatorler.getModulusTest()
		+ "\nexponentialPowerTest: " + operatorler.getExponentialPowerTest());

((ConfigurableApplicationContext) context).close();
		
		
	}

}
