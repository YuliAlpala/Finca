/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import java.awt.Color;

/**
 *
 * @author User
 */
public class Granjero {
    public Robot granjero;        
    private String nombre;
    
    public Granjero(City objetos,int a,int b,Direction direccion, int things){
        granjero=new Robot(objetos,a,b,direccion,things);
        granjero.setColor(Color.ORANGE);
        this.nombre=nombre;
    }
   
            
            
            
    void movePuerta(Lote lote){
        //System.out.println(granjero.getStreet() + " " + granjero.getAvenue() );
        while(granjero.getStreet()>lote.calle+1){
            granjero.move();
        }
        
        if(lote.avenida>granjero.getAvenue()){
            granjero.turnLeft();
            granjero.turnLeft();
            granjero.turnLeft();
            
        }
        else if(lote.avenida<granjero.getAvenue()){
            granjero.turnLeft();
            
        }
        while(granjero.getAvenue()!=lote.avenida){
            granjero.move();
        }
        
        while(!granjero.getDirection().equals(Direction.NORTH)){
            granjero.turnLeft();
            
        }
        granjero.move();
           
    }
    public void  moverVaca(Vaca vaca){
        if(vaca.vaca.getStreet()<granjero.getStreet()){
            while(!granjero.getDirection().equals(Direction.NORTH)){
                granjero.turnLeft();
            
            }
        }
        else if(vaca.vaca.getStreet()>granjero.getStreet()){
            while(!granjero.getDirection().equals(Direction.SOUTH)){
                granjero.turnLeft();
            
            }
        }
        
        while(granjero.getStreet()!=vaca.vaca.getStreet()){
            granjero.move();
        }
        
        
        
        
    }
    
    
    public void mover(){
        granjero.move();
    }
    
}
