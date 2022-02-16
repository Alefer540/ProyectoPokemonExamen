package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.*;

public class Ventana3controller {



    @FXML
    PieChart graficaQuesito;
    @FXML
    BarChart graficoBarras;

    public void datosPiechart(int danodado, int danorecibido) {
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("DADO",danodado),
                        new PieChart.Data("RECIBIDO",danorecibido));
        graficaQuesito.setLabelLineLength(10);
        graficaQuesito.setData(pieChartData);
    }


    public void datosGraficoBarras(int cont_p1, int cont_p2, int cont_p3, int cont_p4, int cont_p5, int cont_p6) { String Jolteon = "Jolteon";
         String Charizard = "Charizard";
         String Vaporeon = "Vaporeon";
         String Pikachu = "Pikachu";
         String Mewtwo = "Mewtwo";
         String Butterfree = "Butterfree";

         CategoryAxis xAxis = new CategoryAxis();

        graficoBarras.setTitle("veces seleccionado");
        xAxis.setLabel("Pokemon");
        XYChart.Series series1 = new XYChart.Series();
       ;
        series1.getData().add(new XYChart.Data(Jolteon, cont_p1));
        series1.getData().add(new XYChart.Data(Charizard, cont_p2));
        series1.getData().add(new XYChart.Data(Vaporeon, cont_p3));
        series1.getData().add(new XYChart.Data(Pikachu, cont_p4));
        series1.getData().add(new XYChart.Data(Mewtwo, cont_p5));
        series1.getData().add(new XYChart.Data(Butterfree, cont_p6));

        graficoBarras.getData().add(series1);
        graficoBarras.setCategoryGap(20);


    }
}
