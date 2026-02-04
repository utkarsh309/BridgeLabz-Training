package functional_interface;

//Export interface
interface DataExporter {

 void exportToCSV();
 void exportToPDF();

 // New feature added later
 default void exportToJSON() {
     System.out.println("Exporting data to JSON using default implementation");
 }
}

//CSV exporter
class CSVExporter implements DataExporter {

 @Override
 public void exportToCSV() {
     System.out.println("Data exported to CSV format");
 }

 @Override
 public void exportToPDF() {
     System.out.println("Data exported to PDF format");
 }
 
}

//PDF exporter
class PDFExporter implements DataExporter {

 @Override
 public void exportToCSV() {
     System.out.println("Data exported to CSV format");
 }

 @Override
 public void exportToPDF() {
     System.out.println("Data exported to PDF format");
 }
 
}

//Advanced exporter with custom JSON
class AdvancedExporter implements DataExporter {

 @Override
 public void exportToCSV() {
     System.out.println("Advanced export to CSV");
 }

 @Override
 public void exportToPDF() {
     System.out.println("Advanced export to PDF");
 }

 @Override
 public void exportToJSON() {
     System.out.println("Advanced export to JSON with custom formatting");
 }
}

//Main class
public class ReportingModule {

 public static void main(String[] args) {

     DataExporter csvExporter = new CSVExporter();
     DataExporter pdfExporter = new PDFExporter();
     DataExporter advancedExporter = new AdvancedExporter();

     csvExporter.exportToCSV();
     csvExporter.exportToJSON();

     pdfExporter.exportToPDF();
     pdfExporter.exportToJSON();

     advancedExporter.exportToJSON();
 }
}
