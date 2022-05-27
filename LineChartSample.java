package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
 
 
public class LineChartSample extends Application {
 
    @Override public void start(Stage stage) {
        stage.setTitle("Line Chart Sample");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
         xAxis.setLabel("Month");
        final LineChart<String,Number> lineChart = 
                new LineChart<String,Number>(xAxis,yAxis);
       
        lineChart.setTitle("Stock Monitoring, 2010");
                          
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Portfolio 1");
        
        series1.getData().add(new XYChart.Data("Jan", 23));
        series1.getData().add(new XYChart.Data("Feb", 14));
        series1.getData().add(new XYChart.Data("Mar", 15));
        series1.getData().add(new XYChart.Data("Apr", 24));
        series1.getData().add(new XYChart.Data("May", 34));
        series1.getData().add(new XYChart.Data("Jun", 36));
        series1.getData().add(new XYChart.Data("Jul", 22));
        series1.getData().add(new XYChart.Data("Aug", 45));
        series1.getData().add(new XYChart.Data("Sep", 43));
        series1.getData().add(new XYChart.Data("Oct", 17));
        series1.getData().add(new XYChart.Data("Nov", 29));
        series1.getData().add(new XYChart.Data("Dec", 25));
        
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Portfolio 2");
        series2.getData().add(new XYChart.Data("Jan", 55));
        series2.getData().add(new XYChart.Data("Feb", 5));
        series2.getData().add(new XYChart.Data("Mar", 3));
        series2.getData().add(new XYChart.Data("Apr", 84));
        series2.getData().add(new XYChart.Data("May", 34));
        series2.getData().add(new XYChart.Data("Jun", 12));
        series2.getData().add(new XYChart.Data("Jul", 59));
        series2.getData().add(new XYChart.Data("Aug", 54));
        series2.getData().add(new XYChart.Data("Sep", 58));
        series2.getData().add(new XYChart.Data("Oct", 37));
        series2.getData().add(new XYChart.Data("Nov", 39));
        series2.getData().add(new XYChart.Data("Dec", 50));
        
        XYChart.Series series3 = new XYChart.Series();
        series3.setName("Portfolio 3");
        series3.getData().add(new XYChart.Data("Jan", 96));
        series3.getData().add(new XYChart.Data("Feb", 36));
        series3.getData().add(new XYChart.Data("Mar", 68));
        series3.getData().add(new XYChart.Data("Apr", 64));
        series3.getData().add(new XYChart.Data("May", 23));
        series3.getData().add(new XYChart.Data("Jun", 26));
        series3.getData().add(new XYChart.Data("Jul", 39));
        series3.getData().add(new XYChart.Data("Aug", 78));
        series3.getData().add(new XYChart.Data("Sep", 74));
        series3.getData().add(new XYChart.Data("Oct", 46));
        series3.getData().add(new XYChart.Data("Nov", 28));
        series3.getData().add(new XYChart.Data("Dec", 69));
        
        XYChart.Series series4 = new XYChart.Series();
        series4.setName("Portfolio 4");
        series4.getData().add(new XYChart.Data("Jan", 99));
        series4.getData().add(new XYChart.Data("Feb", 66));
        series4.getData().add(new XYChart.Data("Mar", 38));
        series4.getData().add(new XYChart.Data("Apr", 74));
        series4.getData().add(new XYChart.Data("May", 99));
        series4.getData().add(new XYChart.Data("Jun", 12));
        series4.getData().add(new XYChart.Data("Jul", 23));
        series4.getData().add(new XYChart.Data("Aug", 76));
        series4.getData().add(new XYChart.Data("Sep", 12));
        series4.getData().add(new XYChart.Data("Oct", 26));
        series4.getData().add(new XYChart.Data("Nov", 63));
        series4.getData().add(new XYChart.Data("Dec", 84));
        
        Scene scene  = new Scene(lineChart,800,600);      
        XYChart.Series series5 = new XYChart.Series();
        series5.setName("Portfolio 5");
        series5.getData().add(new XYChart.Data("Jan", 15));
        series5.getData().add(new XYChart.Data("Feb", 30));
        series5.getData().add(new XYChart.Data("Mar", 35));
        series5.getData().add(new XYChart.Data("Apr", 40));
        series5.getData().add(new XYChart.Data("May", 45));
        series5.getData().add(new XYChart.Data("Jun", 50));
        series5.getData().add(new XYChart.Data("Jul", 65));
        series5.getData().add(new XYChart.Data("Aug", 75));
        series5.getData().add(new XYChart.Data("Sep", 96));
        series5.getData().add(new XYChart.Data("Oct", 23));
        series5.getData().add(new XYChart.Data("Nov", 15));
        series5.getData().add(new XYChart.Data("Dec", 46));
        lineChart.getData().addAll(series1, series2, series3, series4, series5);
       
        stage.setScene(scene);
        stage.show();
    }
 
 
    public static void main(String[] args) {
        launch(args);
    }
}