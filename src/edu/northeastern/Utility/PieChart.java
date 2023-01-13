/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.northeastern.Utility;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
//import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
//import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author satyajitdas
 */
public class PieChart extends javax.swing.JPanel{
    private final PieDataset dataset;
    private String title;
    public PieChart( String title, PieDataset dataset ) {
//      super( title );
      this.title = title;
      this.dataset = dataset;
    }
    
    public ChartPanel getChartPanel() {
        return createDemoPanel();
    }
    
   private static JFreeChart createChart( PieDataset dataset, String title ) {
      JFreeChart chart = ChartFactory.createPieChart(      
         title,   
         dataset,          
         true,
         true, 
         false);

      return chart;
   }
   
   private ChartPanel createDemoPanel() {
      JFreeChart chart;  
      chart = createChart(dataset, title);
      return new ChartPanel( chart ); 
   }
}
