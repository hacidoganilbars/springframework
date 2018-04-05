package com.hacidoganilbars;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Merkez {

	public static void main(String[] args) {

		ExpressionParser parser = new SpelExpressionParser();

		// literal ifadeler
		Expression exp1 = parser.parseExpression("'Ahmet Coşkun'");
		String mesaj1 = exp1.getValue(String.class);
		System.out.println(mesaj1);

		// method invocation(çağırma)
		Expression exp2 = parser.parseExpression("'Ahmet Coşkun'.length()");
		int mesaj2 = (int) exp2.getValue();
		System.out.println(mesaj2);

		// matematiksel operatörler
		Expression exp3 = parser.parseExpression("14*53");
		int mesaj3 = (int) exp3.getValue();
		System.out.println(mesaj3);

		// Bir nesne oluşturuyoruz ve EL ile nesneyi test ediyoruz Dikkat!!!!!!!!!
		Kaynak kaynak = new Kaynak();
		StandardEvaluationContext testContext = new StandardEvaluationContext(kaynak);

		// kaynaktaki bir property'yi yani değişkeni al
		Expression exp4 = parser.parseExpression("eposta");
		String mesaj4 = exp4.getValue(testContext, String.class);
		System.out.println(mesaj4);

		// epostaları karşılaştırıyoruz
		Expression exp5;
		exp5 = parser.parseExpression("eposta=='hd.ilbars@hotmail.com'");
		boolean mesaj5 = exp5.getValue(testContext, Boolean.class);
		System.out.println(mesaj5);

	}

}
