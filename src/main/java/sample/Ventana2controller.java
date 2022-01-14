package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.*;

public class Ventana2controller {
    @FXML
    ImageView img_espaldas;
    @FXML
    ImageView img_enemigo;
    @FXML
    Label label_atacante_nombre;
    @FXML
    ProgressBar progressbar_atacante;
    @FXML
    Label label_atacante_nivel;



    @FXML
    public void initialize(Pokemon x) {
        img_espaldas.setImage(x.foto_detras);
        label_atacante_nombre.setText(x.nombre);
        label_atacante_nivel.setText(x.nivel);
        progressbar_atacante.setProgress(x.vida_actual);


    }
}
