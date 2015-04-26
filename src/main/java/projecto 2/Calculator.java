package teste;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class Operation implements Serializable{
	private static final long serialVersionUID = 1L;
	
			private double operador1;
			private double operador2;
			private double resultado;
			
			public Operation(double operador1, double operador2, double resultado) {
				super();
				this.operador1 = operador1;
				this.operador2 = operador2;
				this.resultado = resultado;
			}
	
			public double getOperador1() {
				return operador1;
			}
	
			public void setOperador1(double operador1) {
				this.operador1 = operador1;
			}
	
			public double getOperador2() {
				return operador2;
			}
	
			public void setOperador2(double operador2) {
				this.operador2 = operador2;
			}
	
			public double getResultado() {
				return resultado;
			}
	
			public void setResultado(double resultado) {
				this.resultado = resultado;
			}
			
			public void doSuma(){
				sumar();
			}

			private void sumar() {
				resultado=operador1+operador2;
				
			}
			
	}
		
