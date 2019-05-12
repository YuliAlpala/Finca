package unal.poo.practica;
import becker.robots.*;
import java.awt.Color;
import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;

      

public class Main
{    
     
      
        public static City objetos;
       // public static Robot vaca;
        
	public static void main (String[] args){
         //Declarar la creacion de la ciudad
objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
          Granja granja=new Granja();
      
       //VACAS LOTE 1
          Vaca vaca_1=new Vaca (objetos,3,6,Direction.NORTH,10);
          Vaca vaca_2=new Vaca(objetos,2, 3, Direction.SOUTH,0);
          Vaca vaca_3= new Vaca(objetos,4, 3, Direction.WEST,0);
          Vaca vaca_4=new Vaca (objetos,6, 5, Direction.NORTH,0);
          Vaca vaca_5=new Vaca(objetos,9, 2, Direction.EAST,0);
          Vaca vaca_6= new Vaca(objetos,11, 3, Direction.NORTH,0);
          //VACAS LOTE 2
          Vaca vaca_7= new Vaca(objetos,11, 14, Direction.WEST,0);
          Vaca vaca_8= new Vaca(objetos,12, 14, Direction.EAST,0);
          Vaca vaca_9= new Vaca(objetos,6, 13, Direction.SOUTH,0);
          Vaca vaca_10= new Vaca(objetos,7, 15, Direction.NORTH,0);
          Vaca vaca_11= new Vaca(objetos,12, 11, Direction.SOUTH,0);
          Vaca vaca_12= new Vaca(objetos,3, 14, Direction.WEST,0);
          
          //VACAS LOTE 3
          Vaca vaca_13= new Vaca(objetos,5, 22, Direction.EAST,0);
          Vaca vaca_14= new Vaca(objetos,5, 23, Direction.WEST,0);
          Vaca vaca_15= new Vaca(objetos,10, 21, Direction.NORTH,0);
          Vaca vaca_16= new Vaca(objetos,9, 21, Direction.SOUTH,0);
          Vaca vaca_17= new Vaca(objetos,4, 23, Direction.EAST,0);
          Vaca vaca_18= new Vaca(objetos,4, 24, Direction.WEST,0); 
          
          
          Lote lote_1=new Lote(1);
          Lote lote_2=new Lote(2);
          Lote lote_3=new Lote(3);
          
          //Cada vaca pertenece al lote 1
          vaca_1.Lista_lote.add(lote_1);
          vaca_2.Lista_lote.add(lote_1);
          vaca_3.Lista_lote.add(lote_1);
          vaca_4.Lista_lote.add(lote_1);
          vaca_5.Lista_lote.add(lote_1);
          vaca_6.Lista_lote.add(lote_1);
           
          //Cada vaca pertenece al lote 2
          vaca_7.Lista_lote.add(lote_2);
          vaca_8.Lista_lote.add(lote_2);
          vaca_9.Lista_lote.add(lote_2);
          vaca_10.Lista_lote.add(lote_2);
          vaca_11.Lista_lote.add(lote_2);
          vaca_12.Lista_lote.add(lote_2);
          //Cada vaca pertenece al lote 3
          vaca_13.Lista_lote.add(lote_3);
          vaca_14.Lista_lote.add(lote_3);
          vaca_15.Lista_lote.add(lote_3);
          vaca_16.Lista_lote.add(lote_3);
          vaca_17.Lista_lote.add(lote_3);
          vaca_18.Lista_lote.add(lote_3);
          
          

}
        

   
}
          
          
             
            
   
             
             
             