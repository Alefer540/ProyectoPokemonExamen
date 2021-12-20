package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Ventana1Controller {
	int cont=0;
	Pokemon p1 = new Pokemon("Jolteon",204f,204f,"LV.65",new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/full/135.png"));
	Pokemon p2 =new Pokemon ("Charizard",148f,148f,"LV.45",new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/full/006.png"));
	Pokemon p3=new Pokemon("Vapereon",234f,234f,"LV.54",new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/full/134.png"));
	Pokemon p4=new Pokemon("Blastoise",222f,222f,"LV.65",new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/full/009.png"));
	Pokemon p5=new Pokemon("Mewtwo",298f,298f,"LV.75",new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/full/150.png"));
	Pokemon p6=new Pokemon("Butterfree",160f,80f,"LV.54", new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/full/012.png"));
	@FXML
	Label l1Nombre1;
	@FXML
	Label l2Nivel1;
	@FXML
	Label l3Vida1;
	@FXML
	Label l4Nombre2;
	@FXML
	Label l5Nivel2;
	@FXML
	Label l6Vida2;
	@FXML
	Label l7Nombre3;
	@FXML
	Label l8Nivel3;
	@FXML
	Label l9Vida3;
	@FXML
	Label l10Nombre4;
	@FXML
	Label l11Nivel4;
	@FXML
	Label l12Vida4;
	@FXML
	Label l13Nombre5;
	@FXML
	Label l14Nivel5;
	@FXML
	Label l15Vida5;
	@FXML
	Label l16Nombre6;
	@FXML
	Label l17Nivel6;
	@FXML
	Label l18Vida6;
	@FXML
	ImageView img1;
	@FXML
	ImageView img2;
	@FXML
	ImageView img3;
	@FXML
	ImageView img4;
	@FXML
	ImageView img5;
	@FXML
	ImageView img6;
	@FXML
	ProgressBar progress1;
	@FXML
	ProgressBar progress2;
	@FXML
	ProgressBar progress3;
	@FXML
	ProgressBar progress4;
	@FXML
	ProgressBar progress5;
	@FXML
	ProgressBar progress6;
	@FXML
	AnchorPane Anchor1;
	@FXML
	AnchorPane Anchor2;
	@FXML
	AnchorPane Anchor3;
	@FXML
	AnchorPane Anchor4;
	@FXML
	AnchorPane Anchor5;
	@FXML
	AnchorPane Anchor6;



	@FXML
	public void initialize() {
		l1Nombre1.setText(p1.nombre);
		l2Nivel1.setText(""+p1.nivel);
		l3Vida1.setText(""+p1.vida);
		l4Nombre2.setText(p2.nombre);
		l5Nivel2.setText(""+p2.nivel);
		l6Vida2.setText(""+p2.vida);
		l7Nombre3.setText(p3.nombre);
		l8Nivel3.setText(""+p3.nivel);
		l9Vida3.setText(""+p3.vida);
		l10Nombre4.setText(p4.nombre);
		l11Nivel4.setText(""+p4.nivel);
		l12Vida4.setText(""+p4.vida);
		l13Nombre5.setText(p5.nombre);
		l14Nivel5.setText(""+p5.nivel);
		l15Vida5.setText(""+p5.vida);
		l16Nombre6.setText(p6.nombre);
		l17Nivel6.setText(""+p6.nivel);
		l18Vida6.setText(""+p6.vida);
		img1.setImage(p1.foto);
		img2.setImage(p2.foto);
		img3.setImage(p3.foto);
		img4.setImage(p4.foto);
		img5.setImage(p5.foto);
		img6.setImage(p6.foto);
		progress1.setProgress(p1.vida_actual/p1.vida);
		progress2.setProgress(p2.vida_actual/p2.vida);
		progress3.setProgress(p3.vida_actual/p3.vida);
		progress4.setProgress(p4.vida_actual/p4.vida);
		progress5.setProgress(p5.vida_actual/p5.vida);
		progress6.setProgress(p6.vida_actual/p6.vida);
		System.out.println(p6.vida_actual/p6.vida);

	}

	@FXML
	private void clickear1() {
		System.out.println("anchor pulsado");
		Anchor1.setStyle("-fx-background-color:#1D6B7B;");
		l1Nombre1.setStyle("-fx-text-fill: #0BE1F0;");
		l2Nivel1.setStyle("-fx-text-fill: #0BE1F0;");
		l3Vida1.setStyle("-fx-text-fill: #0BE1F0;");
		cont=1;
	}
	@FXML
	private void clickear2() {
		System.out.println("anchor pulsado");
		Anchor2.setStyle("-fx-background-color:#1D6B7B;");
		l4Nombre2.setStyle("-fx-text-fill: #0BE1F0;");
		l5Nivel2.setStyle("-fx-text-fill: #0BE1F0;");
		l6Vida2.setStyle("-fx-text-fill: #0BE1F0;");
		cont=1;
	}
	@FXML
	private void clickear3() {
		System.out.println("anchor pulsado");
		Anchor3.setStyle("-fx-background-color:#1D6B7B;");
		l7Nombre3.setStyle("-fx-text-fill: #0BE1F0;");
		l8Nivel3.setStyle("-fx-text-fill: #0BE1F0;");
		l9Vida3.setStyle("-fx-text-fill: #0BE1F0;");
		cont=1;
	}
	@FXML
	private void clickear4() {
		System.out.println("anchor pulsado");
		Anchor4.setStyle("-fx-background-color:#1D6B7B;");
		l10Nombre4.setStyle("-fx-text-fill: #0BE1F0;");
		l11Nivel4.setStyle("-fx-text-fill: #0BE1F0;");
		l12Vida4.setStyle("-fx-text-fill: #0BE1F0;");
		cont=1;
	}
	@FXML
	private void clickear5() {
		System.out.println("anchor pulsado");
		Anchor5.setStyle("-fx-background-color:#1D6B7B;");
		l13Nombre5.setStyle("-fx-text-fill: #0BE1F0;");
		l14Nivel5.setStyle("-fx-text-fill: #0BE1F0;");
		l15Vida5.setStyle("-fx-text-fill: #0BE1F0;");
		cont=1;
	}
	@FXML
	private void clickear6() {
		System.out.println("anchor pulsado");
		Anchor6.setStyle("-fx-background-color: #1D6B7B;");
		l16Nombre6.setStyle("-fx-text-fill: #0BE1F0;");
		l17Nivel6.setStyle("-fx-text-fill: #0BE1F0;");
		l18Vida6.setStyle("-fx-text-fill: #0BE1F0;");
		cont=1;
	}

}
class Pokemon{
	String nombre;
	Float vida;
	Float vida_actual;
	String nivel;
	Image foto;
	Pokemon(String nombre,Float vida,Float vida_actual,String nivel,Image foto){
		this.nombre=nombre;
		this.vida=vida;
		this.vida_actual=vida_actual;
		this.nivel=nivel;
		this.foto=foto;
	}


}
