package unal.poo.practica;

import becker.robots.*;
import java.awt.Color;
import java.util.*;



/**
 *
 * @author User
 */
public class Vaca {
    
    private  Robot vaca; 
    public double temperatura;
    public double pulso;
    public double ritmo;
    public boolean ciclo_reproductivo;
    public int Tiempo_gestación=0;
    ArrayList<Lote> Lista_lote=new ArrayList<Lote>();
    
    public Vaca(City objetos,int a,int b,Direction direccion, int things){
        vaca=new Robot(objetos,a,b,direccion,things);
        vaca.setColor(Color.BLACK);
        temperatura=Math.random();
        pulso=Math.random();
        ritmo=Math.random();
        ciclo_reproductivo=Math.random()<0.8;
        cambio_color();
        System.out.println("Si la vaca tiene temperatura, pulso o ritmo cardiaco mayor a 0.8 la vaca se encuentra enferma");
        
        
        System.out.println("La temperatura de la vaca es: " + temperatura);
        System.out.println("El pulso de la vaca es: "+pulso);
        System.out.println("El ritmo cardiaco de la vaca es:"+ritmo);
        if(ciclo_reproductivo==true){
        System.out.println("la vaca esta embarazada");
    }   else{
             System.out.println("la vaca no esta embarazada");
        }
    }
    

    public void cambio_color(){
      if (temperatura>0.8 || pulso>0.8 ||ritmo>0.8){
            vaca.setColor(Color.RED);
            
       }
        else if (ciclo_reproductivo){
               vaca.setColor(Color.BLUE);
            }  
        else{
         vaca.setColor(Color.BLACK);   
        }
    }   
}
    

             
             
