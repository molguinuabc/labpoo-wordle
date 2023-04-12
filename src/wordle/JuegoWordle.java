/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordle;

import wordle.interfaces.ITablero;
import wordle.interfaces.ITeclado;

/**
 *
 * @author molguin
 */
public class JuegoWordle {
    ITablero tablero;
    ITeclado teclado;

    public JuegoWordle(ITablero tablero, ITeclado teclado) {
        this.tablero = tablero;
        this.teclado = teclado;
    }
    
    public void jugar() {
        this.tablero.despliegaIntento(this.teclado.getIntento());
    }
    
}
