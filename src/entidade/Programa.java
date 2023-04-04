package entidade;

public class Programa {
    int num1;
    int num2;
    int result;

    public int soma(int num1, int num2) {
        return result = num1 + num2;
    }
    public int sub(int num1, int num2) {
        return result = num1 - num2;
    }
    public int divi(int num1, int num2) {
        return result = num1 / num2;
    }
    public int mult(int num1, int num2) {
        return result = num1 * num2;
    }

    public String toString() {
        return "Result: " + result;
    }

}
