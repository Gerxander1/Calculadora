
package calculadora;

public class Operacion {
String memoria1;
String memoria2;
String signo;
String resultado;
String porcen;

    public String getPorcen() {
        return porcen;
    }

    public void setPorcen(String porcen) {
        this.porcen = porcen;
    }

    public String getMemoria1() {
        return memoria1;
    }

    public void setMemoria1(String memoria1) {
        this.memoria1 = memoria1;
    }

    public String getMemoria2() {
        return memoria2;
    }

    public void setMemoria2(String memoria2) {
        this.memoria2 = memoria2;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }
    
    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    
    public void Operaciones(){
    double result;
      
            if(getSigno().equals("+")){
                  result = Double.parseDouble(getMemoria1())+Double.parseDouble(getMemoria2());
                  setResultado(String.valueOf(result));
            }

            if(getSigno().equals("-")){
                  result = Double.parseDouble(getMemoria1())-Double.parseDouble(getMemoria2());
                  setResultado(String.valueOf(result));
            }


            if(getSigno().equals("*")){
                  result = Double.parseDouble(getMemoria1())*Double.parseDouble(getMemoria2());
                  setResultado(String.valueOf(result));
            }

            if(getSigno().equals("/")){
                  result = Double.parseDouble(getMemoria1())/Double.parseDouble(getMemoria2());
                  setResultado(String.valueOf(result));
            }  
    }
    
   /* public void Porcen(){
        double n;
        n = Double.parseDouble(getPorcen());
        n = n * 0.01;
        setMemoria1(String.valueOf(n));
    }*/
    
    
    
}
