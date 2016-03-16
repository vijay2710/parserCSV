import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.*;

public class Csv {
    public static void main(String[] args) throws IOException {
        String file = "Parsers.csv";
        parserscsv(file);
    }
    public static String parserscsv(String filename){
        try {
            Reader in = new FileReader(filename);
            Iterable<CSVRecord> records;
            records = CSVFormat.EXCEL.parse(in);
            for (CSVRecord record : records) {
                String Name = record.get(0);
                String email = record.get(1);
                System.out.println("[Name= " + Name + " , email=" + email + "]");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {}

        System.out.println("Done Successfully");
        return filename;
    }

}