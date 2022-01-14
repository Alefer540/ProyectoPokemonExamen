package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;

import java.awt.*;

public class Ventana2controller {

    Pokemon_enemigo p_e1 = new Pokemon_enemigo("Arbok",250f,250f,"NV.70",new Image("https://static.wikia.nocookie.net/espokemon/images/b/b8/Arbok_NB_variocolor.gif/revision/latest/scale-to-width-down/84?cb=20110426043824"),new Image("https://cdn-icons-png.flaticon.com/512/90/90704.png"));
    @FXML
    ImageView img_espaldas;
    @FXML
    Label name_pokemon;
    @FXML
    Label nivel_pokemon;
    @FXML
    ImageView img_sexo;
    @FXML
    ProgressBar vida_actual;
    @FXML
    Label name_enemigo_pokemon;
    @FXML
    Label nivel_enemigo_pokemon;
    @FXML
    ProgressBar vida_actual_enemigo;
    @FXML
    ImageView img_enemigo;
    @FXML
    ImageView img_sexo_enemigo;


    @FXML
    public void initialize(Pokemon x) {
        img_espaldas.setImage(x.foto_detras);
        name_pokemon.setText(x.nombre);
        nivel_pokemon.setText(x.nivel);
        img_sexo.setImage(x.sexo);
        vida_actual.setProgress(x.vida_actual);
    }
    public void initialize(){
        img_enemigo.setImage(p_e1.foto);
        name_enemigo_pokemon.setText(p_e1.nombre);
        nivel_enemigo_pokemon.setText(p_e1.nivel);
        vida_actual_enemigo.setProgress(p_e1.vida_actual);
        img_sexo_enemigo.setImage(p_e1.sexo);

    }
}

class Pokemon_enemigo {
    String nombre;
    Float vida;
    Float vida_actual;
    String nivel;
    Image sexo;
    Image foto;


    Pokemon_enemigo(String nombre, Float vida, Float vida_actual, String nivel, Image foto, Image sexo) {
        this.nombre = nombre;
        this.vida = vida;
        this.vida_actual = vida_actual;
        this.nivel = nivel;
        this.foto = foto;
        this.sexo = sexo;

    }
}


