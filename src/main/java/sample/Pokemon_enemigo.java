package sample;

import javafx.scene.image.Image;

import java.io.File;

class Pokemon_enemigo {
    String nombre;
    Float vida;
    Float vida_actual;
    String nivel;
    Image sexo;
    File foto;


    Pokemon_enemigo(String nombre, Float vida, Float vida_actual, String nivel, File foto, Image sexo) {
        this.nombre = nombre;
        this.vida = vida;
        this.vida_actual = vida_actual;
        this.nivel = nivel;
        this.foto = foto;
        this.sexo = sexo;

    }
}
