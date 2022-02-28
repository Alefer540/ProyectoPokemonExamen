package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class Ventana4controller {
    private Ventana2controller ventana2Controller;
    @FXML
    Label nombre_p;
    @FXML
    Label pocion;
    @FXML
    Label nantidoto;
    @FXML
    Text textopocion;
    @FXML
    Text textantidoto;
    @FXML
    ImageView img_p;
    @FXML
    ProgressBar vida_p;
    @FXML
    ImageView revivir;
    @FXML
    ImageView p_maxima;
    @FXML
    ImageView antidoto;

    Pokemon Pokemon_amigo;

    public void infopokemon(Pokemon pokemon_amigo) {
        this.Pokemon_amigo = pokemon_amigo;
        nombre_p.setText(Pokemon_amigo.nombre);
        vida_p.setProgress(Pokemon_amigo.vida_actual/Pokemon_amigo.vida);
        Image imagen1=new Image(pokemon_amigo.foto.toURI().toString());
        img_p.setImage(imagen1);
        if(pokemon_amigo.vida_actual<=0){
            ocultar();
        }else
        {
            mostrar();
        }
    }
    void enviarController2(Ventana2controller Ventana2Controller) {
        this.ventana2Controller = Ventana2Controller;

    }

    @FXML
    private void cerrar(){
        ventana2Controller.stage4.close();

    }


    @FXML
    public void revivir_p() {
        if (Pokemon_amigo.vida_actual <= 0){
            Pokemon_amigo.vida_actual=Pokemon_amigo.vida;
            vida_p.setProgress(Pokemon_amigo.vida_actual);
            ventana2Controller.actualizar_pokemon(Pokemon_amigo);

        }
    }
    @FXML
    public void p_maxima() {
        if (Pokemon_amigo.vida_actual <= Pokemon_amigo.vida) {
            Pokemon_amigo.vida_actual = Pokemon_amigo.vida_actual + 40;
            vida_p.setProgress(Pokemon_amigo.vida_actual / Pokemon_amigo.vida);
            ventana2Controller.actualizar_pokemon(Pokemon_amigo);


        }
    }
    @FXML
    public void antidoto() {

        if (Pokemon_amigo.vida_actual <= Pokemon_amigo.vida) {
            Pokemon_amigo.vida_actual = Pokemon_amigo.vida_actual + 20;
            vida_p.setProgress(Pokemon_amigo.vida_actual/Pokemon_amigo.vida);
            ventana2Controller.actualizar_pokemon(Pokemon_amigo);
        }


    }
    private void ocultar(){
        antidoto.setOpacity(0);
        p_maxima.setOpacity(0);
        pocion.setOpacity(0);
        nantidoto.setOpacity(0);
        textopocion.setOpacity(0);
        textantidoto.setOpacity(0);
    }
    private void mostrar(){
        antidoto.setOpacity(1);
        p_maxima.setOpacity(1);
        pocion.setOpacity(1);
        nantidoto.setOpacity(1);
        textopocion.setOpacity(1);
        textantidoto.setOpacity(1);
    }

}
