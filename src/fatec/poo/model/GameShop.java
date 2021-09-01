/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author gusta
 */
public class GameShop {
    private int codigo;
    private int idade;
    private double qtdeHoras;

    public GameShop(int codigo, int idade) {
        this.codigo = codigo;
        this.idade = idade;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getIdade() {
        return idade;
    }

    public double getQtdeHoras() {
        return qtdeHoras;
    }
    
    public void comprar(double d)
    {
        qtdeHoras += d;
    
    }
    
    public void jogar(double d)
    {
        qtdeHoras -= d;
    }
    
    public void brinde()
    {
        qtdeHoras *= 2;
    }
    
    
}
