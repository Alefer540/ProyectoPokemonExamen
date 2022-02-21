package sample;

import javafx.scene.image.Image;

import java.io.File;

public class Pokemon{
    int index;
    String nombre;
    Float vida;
    Float vida_actual;
    String nivel;
    File sexo;
    File foto;
    File foto_detras;

    Pokemon(int index, String nombre, Float vida, Float vida_actual, String nivel, File foto, File sexo, File foto_detras){
        this.index = index;
        this.nombre=nombre;
        this.vida=vida;
        this.vida_actual=vida_actual;
        this.nivel=nivel;
        this.foto=foto;
        this.sexo=sexo;
        this.foto_detras=foto_detras;
    }

    public int getIndex(){
        return index;
    }


}
