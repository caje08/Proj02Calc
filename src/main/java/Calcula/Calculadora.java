package Calcula;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

@ManagedBean
@RequestScoped
public class Calculadora implements Serializable{
 
	    private int _param1;
	    private int _param2;
	    private String _result;

	    public Calculadora() {
	    }

	    //
	    public int getParam1() {
	        return _param1;
	    }

	    public void setParam1(int param1) {
	        _param1 = param1;
	    }

	    public int getParam2() {
	        return _param2;
	    }

	    public void setParam2(int param2) {
	        _param2 = param2;
	    }

	    public String getResult() {
	        return _result;
	    }
	    // 

	    public String add(){
	        _result = Integer.toString(_param1 + _param2);
	        return "";
	    }

	    public String substract(){
	        _result = Integer.toString(_param1 - _param2);
	        return "";
	    }

	    public String multiply(){
	        _result = Integer.toString(_param1 * _param2);
	        return "";
	    }

	    public String divide(){
	        _result = _param2 == 0 ? "n/a" : Double.toString(_param1 / (double)_param2);
	        return "";
	    }

	}
