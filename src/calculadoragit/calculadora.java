/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoragit;

/**
 *
 * @author Iago Ortiz
 */
public class calculadora {
    private int num1, num2;
    private String marca, modelo;

    public calculadora(int num1, int num2, String marca, String modelo) {
        this.num1 = num1;
        this.num2 = num2;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int suma () {
        return num1+num2;
    }
    
}
