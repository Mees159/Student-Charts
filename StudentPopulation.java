package application;

import java.awt.Color;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
 
 
public class StudentPopulation extends Application {
 
    @Override public void start(Stage stage) {
        stage.setTitle("Line Chart Sample");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
         xAxis.setLabel("Fall 2016-Spring 2021");
        final LineChart<String,Number> lineChart = 
                new LineChart<String,Number>(xAxis,yAxis);
       
        lineChart.setTitle("Student population at\nBergen Comunnity Collegue");
                          
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("FALL");
        series1.getData().add(new XYChart.Data("Academic\nYear 2016", 14519));
        series1.getData().add(new XYChart.Data("Academic\nYear 2017", 14062));
        series1.getData().add(new XYChart.Data("Academic\nYear 2018", 13352));
        series1.getData().add(new XYChart.Data("Academic\nYear 2019", 12968));
        series1.getData().add(new XYChart.Data("Academic\nYear 2020", 11409));
        
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("SPRING");
        series2.getData().add(new XYChart.Data("Academic\nYear 2016", 13005));
        series2.getData().add(new XYChart.Data("Academic\nYear 2017", 12436));
        series2.getData().add(new XYChart.Data("Academic\nYear 2018", 11953));
        series2.getData().add(new XYChart.Data("Academic\nYear 2019", 11525));
        series2.getData().add(new XYChart.Data("Academic\nYear 2020", 9717));


                    
                 
        Scene scene  = new Scene(lineChart,700,500);       
        lineChart.getData().addAll(series1,series2);
       
        stage.setScene(scene);
        scene.getStylesheets().add("application/StudentStyles.css");
        stage.show();
    }
 
 
    public static void main(String[] args) {
        launch(args);
    }
}