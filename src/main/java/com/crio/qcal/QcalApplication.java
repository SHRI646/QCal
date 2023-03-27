package com.crio.qcal;

import com.crio.qcalc.ScientificCalculator;
import com.crio.qcalc.StandardCalculator;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalApplication {

	public static void main(String[] args) {
		//SpringApplication.run(QcalApplication.class, args);
		System.out.println("Starting QCalc..");
		StandardCalculator calc = new StandardCalculator();
		calc.add(1.0,1.5);
		//calc.add(Double.MAX_VALUE,1.0);     // In Exceptional handling activity 1 value= 1 1.7976931348623157E308
		//calc.add(Double.MAX_VALUE,Double.MAX_VALUE); //In Exceptional handling activity 2 Infinity
		//calc.subtract(Double.MAX_VALUE,Double.NEGATIVE_INFINITY);
		//double addi=calc.getResult();		// No use
		//System.out.println(addi);
		calc.printResult();

		ScientificCalculator sci=new ScientificCalculator();	//obj of Scientific calculator
		sci.sqrt(4);
		sci.printResult();
	}

}
