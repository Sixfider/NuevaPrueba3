public class Calculadora {
    public int suma(int a, int b){
        return a+b;
    }
    public int resta(int a, int b){
        return a-b;
    }
    public int multiplicacion(int a, int b){
        return a*b;
    }
    public int division(int a , int b){
        return a/b;
    }
    public int resto(int a, int b){
        return a%b;
    }

    public double raiz(int a){
        return Math.sqrt(a);
    }
  
    public int potencia(int a, int b){ 
        return (int) Math.pow(a,b);
    }
}
