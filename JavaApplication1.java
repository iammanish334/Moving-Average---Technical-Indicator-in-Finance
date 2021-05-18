
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import java.util.*;
import java.io.File;
import java.io.IOException;
//import static java.util.Date.parse;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
//import jxl.read.biff.BiffException;


public class JavaApplication1 extends Application {
   
    @Override public void start(Stage stage) throws Exception{
        stage.setTitle("Moving Average Chart");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Date");yAxis.setLabel("Price");       
        final LineChart<String,Number> lineChart;
        lineChart = new LineChart<String,Number>(xAxis,yAxis);              
        lineChart.setTitle("NMA Fluctuation, 2021");                      
        XYChart.Series series = new XYChart.Series();
        series.setName("My Technical Analysis");

String date[] = new String[100];
double[][] arr = new double[100][100];
double[] arrr = new double[100];
double check = 0,curr1 = 0,sum = 0,sum1 = 0,avg1 = 0;
String currr,curr,avg;
Scanner sc = new Scanner(System.in);

        System.out.println("\n\t\t\t ***** Moving Average Algorithm ***** \t\t\t \n");
        System.out.println("Choose from following Sector : -\n");
        System.out.println("1. Automobile Sector");
        System.out.println("2. Banking Sector");
        System.out.println("3. Medical Sector");
        System.out.println("4. Energy & Engineering Sector");
        System.out.println("\nInput Here  :");
        int v = sc.nextInt();
        int choice = v;
        switch(choice)
        {
           case 1: while(true){
System.out.println("\nKindly Choose From Companies:-\n");
System.out.println("1. Tata Motors");
System.out.println("2. Ashok Leyland ");
System.out.println("3. Eicher Motors");
System.out.println("4. Maruti Suzuki");
System.out.println("5. Bajaj Auto");
System.out.println("6. Apollo Tyres");
System.out.println("7. MRF");
System.out.println("8. Bharat Forge");
System.out.println("9. TVS Motors");
System.out.println("10. Exide Indutries");
int m=sc.nextInt();
choice=m;
switch(choice)
{
    case 1:File f1 = new File("C:\\Users\\shubh\\Downloads\\Auto\\XLS\\TataMotors1.xls");    
    Workbook wb = Workbook.getWorkbook (f1);Sheet s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\Auto\\XLS\\TataMotors1.xls",wb,s,date,arrr,series);
    File ff1 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Auto\\TataMotors.xls");    
    Workbook wbb = Workbook.getWorkbook (ff1);Sheet ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Auto\\TataMotors.xls",wbb,check,ss);
    Scene scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 2:File f2 = new File("C:\\Users\\shubh\\Downloads\\Auto\\XLS\\Ashok.xls");    
    wb = Workbook.getWorkbook (f2);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\Auto\\XLS\\Ashok.xls",wb,s,date,arrr,series);
    File ff2 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Auto\\Ashok.xls");    
    wbb = Workbook.getWorkbook (ff2);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Auto\\Ashok.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 3:File f3 = new File("C:\\Users\\shubh\\Downloads\\Auto\\XLS\\Eicher.xls");    
    wb = Workbook.getWorkbook (f3);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\Auto\\XLS\\Eicher.xls",wb,s,date,arrr,series);
    File ff3 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Auto\\Eicher.xls");    
    wbb = Workbook.getWorkbook (ff3);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Auto\\Eicher.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 4:File f4 = new File("C:\\Users\\shubh\\Downloads\\Auto\\XLS\\Maruti.xls");    
    wb = Workbook.getWorkbook (f4);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\Auto\\XLS\\Maruti.xls",wb,s,date,arrr,series);
    File ff4 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Auto\\Maruti.xls");    
    wbb = Workbook.getWorkbook (ff4);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Auto\\Maruti.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 5:File f5 = new File("C:\\Users\\shubh\\Downloads\\Auto\\XLS\\Bajaj.xls");    
    wb = Workbook.getWorkbook (f5);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\Auto\\XLS\\Bajaj.xls",wb,s,date,arrr,series);
    File ff5 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Auto\\Bajaj.xls");    
    wbb = Workbook.getWorkbook (ff5);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Auto\\Bajaj.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 6:File f6 = new File("C:\\Users\\shubh\\Downloads\\Auto\\XLS\\Apollo.xls");    
    wb = Workbook.getWorkbook (f6);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\Auto\\XLS\\Apollo.xls",wb,s,date,arrr,series);
    File ff6 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Auto\\Apollo.xls");    
    wbb = Workbook.getWorkbook (ff6);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Auto\\Apollo.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 7:File f7 = new File("C:\\Users\\shubh\\Downloads\\Auto\\XLS\\MRF.xls");    
    wb = Workbook.getWorkbook (f7);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\Auto\\XLS\\MRF.xls",wb,s,date,arrr,series);
    File ff7 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Auto\\MRF.xls");    
    wbb = Workbook.getWorkbook (ff7);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Auto\\Eicher.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 8:File f8 = new File("C:\\Users\\shubh\\Downloads\\Auto\\XLS\\Bharat Forge.xls");    
    wb = Workbook.getWorkbook (f8);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\Auto\\XLS\\Bharat Forge.xls",wb,s,date,arrr,series);
    File ff8 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Auto\\Bharat Forge.xls");    
    wbb = Workbook.getWorkbook (ff8);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Auto\\Bharat Forge.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 9:File f9 = new File("C:\\Users\\shubh\\Downloads\\Auto\\XLS\\TVS Motors.xls");    
    wb = Workbook.getWorkbook (f9);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\Auto\\XLS\\TVS Motors.xls",wb,s,date,arrr,series);
    File ff9 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Auto\\TVS Motors.xls");    
    wbb = Workbook.getWorkbook (ff9);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Auto\\TVS Motors.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 10:File f10 = new File("C:\\Users\\shubh\\Downloads\\Auto\\XLS\\Exidein.xls");    
    wb = Workbook.getWorkbook (f10);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\Auto\\XLS\\Exidein.xls",wb,s,date,arrr,series);
    File ff10 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Auto\\Exidein.xls");    
    wbb = Workbook.getWorkbook (ff10);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Auto\\Exidein.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();
    break;
    
    default:
        System.out.println("Invalid Entry");
        System.out.println("Enetr Valid Choice : \n================================");continue;
    }break;}break;
    
           case 2:while(true){
System.out.println("\nKindly Choose From Companies:-\n");
System.out.println("1. HDFC Bank Ltd.");
System.out.println("2. ICICI Bank Ltd.");
System.out.println("3. Axis Bank Ltd.");
System.out.println("4. Kotak Mahindra Bank Ltd.");
System.out.println("5. State Bank of India");
System.out.println("6. Indusland Bank Ltd.");
System.out.println("7. Punjbab National Bank Ltd.");
System.out.println("8. Bandhan Bank Ltd.");
System.out.println("9. Federal Bank Ltd.");
System.out.println("10. IDFC First Bank Ltd.");
int m1=sc.nextInt();
choice=m1;
switch(choice)
{
    case 1:File f1 = new File("C:\\Users\\shubh\\Downloads\\Bank\\XLS\\HDFC.xls");    
    Workbook wb = Workbook.getWorkbook (f1);Sheet s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\Bank\\XLS\\HDFC.xls",wb,s,date,arrr,series);
    File ff1 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Bank\\HDFC.xls");    
    Workbook wbb = Workbook.getWorkbook (ff1);Sheet ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Bank\\HDFC.xls",wbb,check,ss);
    Scene scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 2:File f2 = new File("C:\\Users\\shubh\\Downloads\\Bank\\XLS\\ICICI.xls");    
    wb = Workbook.getWorkbook (f2);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\Bank\\XLS\\ICICI.xls",wb,s,date,arrr,series);
    File ff2 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Bank\\ICICI.xls");    
    wbb = Workbook.getWorkbook (ff2);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Bank\\ICICI.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 3:File f3 = new File("C:\\Users\\shubh\\Downloads\\Bank\\XLS\\AxisBank.xls");    
    wb = Workbook.getWorkbook (f3);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\Bank\\XLS\\AxisBank.xls",wb,s,date,arrr,series);
    File ff3 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Bank\\AxisBank.xls");    
    wbb = Workbook.getWorkbook (ff3);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Bank\\AxisBank.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 4:File f4 = new File("C:\\Users\\shubh\\Downloads\\Bank\\XLS\\KotakBank.xls");    
    wb = Workbook.getWorkbook (f4);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\Bank\\XLS\\KotakBank.xls",wb,s,date,arrr,series);
    File ff4 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Bank\\KotakBank.xls");    
    wbb = Workbook.getWorkbook (ff4);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Bank\\Kotakbank.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 5:File f5 = new File("C:\\Users\\shubh\\Downloads\\Bank\\XLS\\SBIN.xls");    
    wb = Workbook.getWorkbook (f5);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\Bank\\XLS\\SBIN.xls",wb,s,date,arrr,series);
    File ff5 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Bank\\SBIN.xls");    
    wbb = Workbook.getWorkbook (ff5);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Bank\\SBIN.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 6:File f6 = new File("C:\\Users\\shubh\\Downloads\\Bank\\XLS\\InduslanBank.xls");    
    wb = Workbook.getWorkbook (f6);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\Bank\\XLS\\InduslandBank.xls",wb,s,date,arrr,series);
    File ff6 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Bank\\InduslandBank.xls");    
    wbb = Workbook.getWorkbook (ff6);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Bank\\InduslandBank.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 7:File f7 = new File("C:\\Users\\shubh\\Downloads\\Bank\\XLS\\AuBank.xls");    
    wb = Workbook.getWorkbook (f7);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\Bank\\XLS\\AuBank.xls",wb,s,date,arrr,series);
    File ff7 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Bank\\AuBank.xls");    
    wbb = Workbook.getWorkbook (ff7);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Bank\\AuBank.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 8:File f8 = new File("C:\\Users\\shubh\\Downloads\\Bank\\XLS\\BandhanBank.xls");    
    wb = Workbook.getWorkbook (f8);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\Bank\\XLS\\BandhanBank.xls",wb,s,date,arrr,series);
    File ff8 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Bank\\BandhanBank.xls");    
    wbb = Workbook.getWorkbook (ff8);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Bank\\BandhanBank.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 9:File f9 = new File("C:\\Users\\shubh\\Downloads\\Bank\\XLS\\FederalBank.xls");    
    wb = Workbook.getWorkbook (f9);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\Bank\\XLS\\FederalBank.xls",wb,s,date,arrr,series);
    File ff9 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Bank\\FederalBank.xls");    
    wbb = Workbook.getWorkbook (ff9);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Bank\\FederalBank.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 10:File f10 = new File("C:\\Users\\shubh\\Downloads\\Bank\\XLS\\IDFC.xls");    
    wb = Workbook.getWorkbook (f10);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\Bank\\XLS\\IDFC.xls",wb,s,date,arrr,series);
    File ff10 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Bank\\IDFC.xls");    
    wbb = Workbook.getWorkbook (ff10);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Bank\\IDFC.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;

    default:
        System.out.println("Invalid Entry");
        System.out.println("Enetr Valid Choice : \n================================");continue;
    }break;}break;
       
        case 3: while(true){
System.out.println("\nKindly Choose From Companies:-\n");
System.out.println("1. Apollo Hospital");
System.out.println("2. Dr Lal PathLab");
System.out.println("3. Max Healthcare");
System.out.println("4. Fortis Health");
System.out.println("5. Metropolis");
System.out.println("6. Narayan Hruda");
System.out.println("7. Aster DM Health");
System.out.println("8. Thyrocore Techn");
System.out.println("9. Indraprastha");
System.out.println("10. Shalby");
int m2=sc.nextInt();
choice=m2;
switch(choice)
{
    case 1:File f1 = new File("C:\\Users\\shubh\\Downloads\\Medical\\XLS\\Apollo.xls");    
    Workbook wb = Workbook.getWorkbook (f1);Sheet s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\Medical\\XLS\\Apollo.xls",wb,s,date,arrr,series);
    File ff1 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Medical\\Apollo.xls");    
    Workbook wbb = Workbook.getWorkbook (ff1);Sheet ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Medical\\Apollo.xls",wbb,check,ss);
    Scene scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 2:File f2 = new File("C:\\Users\\shubh\\Downloads\\Medical\\XLS\\LalPath.xls");    
    wb = Workbook.getWorkbook (f2);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\Medical\\XLS\\LalPath.xls",wb,s,date,arrr,series);
    File ff2 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Medical\\LalPath.xls");    
    wbb = Workbook.getWorkbook (ff2);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Medical\\LalPath.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 3:File f3 = new File("C:\\Users\\shubh\\Downloads\\Medical\\XLS\\MaxHealth.xls");    
    wb = Workbook.getWorkbook (f3);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\Medical\\XLS\\MaxHealth.xls",wb,s,date,arrr,series);
    File ff3 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Medical\\MaxHealth.xls");    
    wbb = Workbook.getWorkbook (ff3);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Medical\\MaxHealth.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 4:File f4 = new File("C:\\Users\\shubh\\Downloads\\Medical\\XLS\\Fortis.xls");    
    wb = Workbook.getWorkbook (f4);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\Medical\\XLS\\Fortis.xls",wb,s,date,arrr,series);
    File ff4 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Medical\\Fortis.xls");    
    wbb = Workbook.getWorkbook (ff4);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Medical\\Fortis.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 5:File f5 = new File("C:\\Users\\shubh\\Downloads\\Medical\\XLS\\Metropolis.xls");    
    wb = Workbook.getWorkbook (f5);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\Medical\\XLS\\Metropolis.xls",wb,s,date,arrr,series);
    File ff5 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Medical\\Metropolis.xls");    
    wbb = Workbook.getWorkbook (ff5);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Medical\\Metropolis.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 6:File f6 = new File("C:\\Users\\shubh\\Downloads\\Medical\\XLS\\NH.xls");    
    wb = Workbook.getWorkbook (f6);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\Medical\\XLS\\NH.xls",wb,s,date,arrr,series);
    File ff6 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Medical\\NH.xls");    
    wbb = Workbook.getWorkbook (ff6);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Medical\\NH.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 7:File f7 = new File("C:\\Users\\shubh\\Downloads\\Medical\\XLS\\AsterDm.xls");    
    wb = Workbook.getWorkbook (f7);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\Medical\\XLS\\AsterDm.xls",wb,s,date,arrr,series);
    File ff7 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Medical\\AsterDm.xls");    
    wbb = Workbook.getWorkbook (ff7);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Medical\\AsterDm.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 8:File f8 = new File("C:\\Users\\shubh\\Downloads\\Medical\\XLS\\Thyrocare.xls");    
    wb = Workbook.getWorkbook (f8);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\Medical\\XLS\\Thyrocare.xls",wb,s,date,arrr,series);
    File ff8 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Medical\\Thyrocare.xls");    
    wbb = Workbook.getWorkbook (ff8);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Medical\\Thyrocare.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 9:File f9 = new File("C:\\Users\\shubh\\Downloads\\Medical\\XLS\\Indraprastha.xls");    
    wb = Workbook.getWorkbook (f9);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\Medical\\XLS\\Indraprastha.xls",wb,s,date,arrr,series);
    File ff9 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Medical\\Indraprastha.xls");    
    wbb = Workbook.getWorkbook (ff9);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Medical\\Indraprastha.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 10:File f10 = new File("C:\\Users\\shubh\\Downloads\\Medical\\XLS\\Shalby.xls");    
    wb = Workbook.getWorkbook (f10);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\Medical\\XLS\\Shalby.xls",wb,s,date,arrr,series);
    File ff10 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Medical\\Shalby.xls");    
    wbb = Workbook.getWorkbook (ff10);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\Medical\\Shalby.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;default:{
        System.out.println("Invalid Entry");
        System.out.println("Enetr Valid Choice : \n================================");continue;}
    }break;}break;
    
    case 4:while(true){
System.out.println("\nKindly Choose From Companies:-\n");
System.out.println("1. ONGC");
System.out.println("2. Reliance Industries");
System.out.println("3. Bharat Petroleum Corporation Ltd.");
System.out.println("4. Indian Oil Corporation Ltd.");
System.out.println("5. Tata Power Corporation Ltd.");
System.out.println("6. Kalyan Jeweller");
System.out.println("7. laxmi Organic");
System.out.println("8. Larsen & Turbo");
System.out.println("9. Craftsman");
System.out.println("10. BHEL");
int m3=sc.nextInt();
choice=m3;
switch(choice)
{
    case 1:File f1 = new File("C:\\Users\\shubh\\Downloads\\E&E\\XLS\\ONGC.xls");    
    Workbook wb = Workbook.getWorkbook (f1);Sheet s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\E&E\\XLS\\ONGC.xls",wb,s,date,arrr,series);
    File ff1 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\E&E\\ONGC.xls");    
    Workbook wbb = Workbook.getWorkbook (ff1);Sheet ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\E&E\\ONGC.xls",wbb,check,ss);
    Scene scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 2:File f2 = new File("C:\\Users\\shubh\\Downloads\\E&E\\XLS\\RELIANCE.xls");    
    wb = Workbook.getWorkbook (f2);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\E&E\\XLS\\RELIANCE.xls",wb,s,date,arrr,series);
    File ff2 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\E&E\\RELIANCE.xls");    
    wbb = Workbook.getWorkbook (ff2);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\E&E\\RELIANCE.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 3:File f3 = new File("C:\\Users\\shubh\\Downloads\\E&E\\XLS\\BPCL.xls");    
    wb = Workbook.getWorkbook (f3);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\E&E\\XLS\\BPCL.xls",wb,s,date,arrr,series);
    File ff3 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\E&E\\BPCL.xls");    
    wbb = Workbook.getWorkbook (ff3);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\E&E\\BPCL.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 4:File f4 = new File("C:\\Users\\shubh\\Downloads\\E&E\\XLS\\IOC.xls");    
    wb = Workbook.getWorkbook (f4);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\E&E\\XLS\\IOC.xls",wb,s,date,arrr,series);
    File ff4 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\E&E\\IOC.xls");    
    wbb = Workbook.getWorkbook (ff4);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\E&E\\IOC.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 5:File f5 = new File("C:\\Users\\shubh\\Downloads\\E&E\\XLS\\TATAPOWER.xls");    
    wb = Workbook.getWorkbook (f5);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\E&E\\XLS\\TATAPOWER.xls",wb,s,date,arrr,series);
    File ff5 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\E&E\\TATAPOWER.xls");    
    wbb = Workbook.getWorkbook (ff5);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\E&E\\TATAPOWER.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 6:File f6 = new File("C:\\Users\\shubh\\Downloads\\E&E\\XLS\\KALYAN.xls");    
    wb = Workbook.getWorkbook (f6);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\E&E\\XLS\\KALYAN.xls",wb,s,date,arrr,series);
    File ff6 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\E&E\\KALYAN.xls");    
    wbb = Workbook.getWorkbook (ff6);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\E&E\\KALYAN.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 7:File f7 = new File("C:\\Users\\shubh\\Downloads\\E&E\\XLS\\LAXMIORG.xls");    
    wb = Workbook.getWorkbook (f7);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\E&E\\XLS\\LAXMIORG.xls",wb,s,date,arrr,series);
    File ff7 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\E&E\\LAXMIORG.xls");    
    wbb = Workbook.getWorkbook (ff7);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\E&E\\LAXMIORG.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 8:File f8 = new File("C:\\Users\\shubh\\Downloads\\E&E\\XLS\\L&T.xls");    
    wb = Workbook.getWorkbook (f8);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\E&E\\XLS\\L&T.xls",wb,s,date,arrr,series);
    File ff8 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\E&E\\L&T.xls");    
    wbb = Workbook.getWorkbook (ff8);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\E&E\\L&T.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 9:File f9 = new File("C:\\Users\\shubh\\Downloads\\E&E\\XLS\\CRAFTSMAN.xls");    
    wb = Workbook.getWorkbook (f9);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\E&E\\XLS\\CRAFTSMAN.xls",wb,s,date,arrr,series);
    File ff9 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\E&E\\CRAFTSMAN.xls");    
    wbb = Workbook.getWorkbook (ff9);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\E&E\\CRAFTSMAN.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;
    
    case 10:File f10 = new File("C:\\Users\\shubh\\Downloads\\E&E\\XLS\\BHEL.xls");    
    wb = Workbook.getWorkbook (f10);s = wb.getSheet(0);
    check = my("C:\\Users\\shubh\\Downloads\\E&E\\XLS\\BHEL.xls",wb,s,date,arrr,series);
    File ff10 = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\E&E\\BHEL1.xls");    
    wbb = Workbook.getWorkbook (ff10);ss = wbb.getSheet(0);
    get("C:\\Users\\shubh\\OneDrive\\Desktop\\Current\\E&E\\BHEL1.xls",wbb,check,ss);
    scene  = new Scene(lineChart,800,600);
    lineChart.getData().add(series);stage.setScene(scene);
    stage.show();break;default:
        System.out.println("Invalid Entry");
        System.out.println("Enetr Valid Choice : \n================================");continue;
    }break;}break;

    default:
        System.out.println("Invalid Input");
        System.exit(0);
        } }
 
   void get(String strr,Workbook wbb,double check,Sheet ss){
       
       File ff = new File(strr);
       int row=ss.getRows();
       int col=ss.getColumns();
       String curr,currr;
       double curr1 = 0;
       
       for(int i = 0;i <43 ;i++){
            for(int j=0;j<1;j++){
                if(i == 42 && j == 0){
                    Cell c=ss.getCell(j,i);
                    System.out.print("Current Price : " + c.getContents()+"\t\t\n");
                    curr = c.getContents();
                    curr = curr.replaceAll("[,+%-]","");
                    currr = curr.substring(0,6);
                    curr1 = Double.parseDouble(currr);
                }}System.out.print("");}
        if(check > (curr1 + 1))
        {            System.out.println("\nTechnical Indication :     -->  ( BUY )");}
        else if(check < (curr1) - 1)
        {            System.out.println("\nTechnical Indication :     -->  ( SELL )");}
        else{        System.out.println("\nTechnical Indication :     -->  ( HOLD )");}
        System.out.println("\n“ The Best Trading Strategy in the World won’t do you any good if you allow Emotions to Trump Logic. “");}
   
   double my(String str,Workbook wb,Sheet s,String date[],double arrr[],XYChart.Series series){
       
       File f = new File(str);
       int row=s.getRows(),col=s.getColumns();
        
        System.out.println("Input Timestamp\n");
        System.out.println("1. System Default");
        System.out.println("2. User Default");
        Scanner sc = new Scanner(System.in);
        
        int time = sc.nextInt();
        int choose = time;
        switch(choose)
        {
            case 1:
                time = 10;
                break;
            case 2:
                System.out.println("\nEnter the Time Period in Days");
                time = sc.nextInt();
                break;
        }
        double[][] arr = new double[100][100];
        String avg;
        double check = 0,curr1 = 0,sum = 0,sum1 = 0,avg1 = 0;
 
        for(int i = 1;i <=time ;i++){
            for(int j=0;j<1;j++){
                    Cell c=s.getCell(j,i);
                    date[i] = c.getContents();
                    date[i] = date[i].replaceAll("[,+%-]","");}
            System.out.print("");}
        
        for(int i = 1;i <= time;i++){
            for(int j=1;j<5;j++){
                    Cell c=s.getCell(j,i);
                    avg = c.getContents();
                    avg = avg.replaceAll("[,+%-]","");
                    avg1 = Double.parseDouble(avg);
                    arr[i][j] = avg1;}
            System.out.print("");}
        sum = 0;
        
        for(int i=1;i<=time;i++){
            for(int j=1;j<5;j++)
            { sum = sum + arr[i][j]; }
            arrr[i] = (sum)/4;
            sum = 0;}
        sum1 = 0;
        for(int i=1;i<=time;i++)
        { sum1 = sum1 + arrr[i];}
        check = sum1/time;
        System.out.printf("\nThe Normal Moving Average is %.2f\n",check);
        
        for(int x=time;x>=1;x--)
        {series.getData().add(new XYChart.Data(date[x].substring(4), arrr[x]));}
        return check;}
 
    public static void main(String[] args) {     
        launch(args); 
    }
}
