package activities;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class Activity13_1 {
    public static void main(String[] args) throws IOException, CsvException {

        CSVReader reader = new CSVReader(new FileReader("src/test/java/activities/13_1.csv"));
        List<String[]> data = reader.readAll();
        System.out.println("Total number of rows are: " + data.size());
        Iterator<String[]> itr = data.iterator();
        int j=1;
        while(itr.hasNext()) {
            String[] values = itr.next();

            System.out.print(j + " row Values are: ");
            for(int i=0;i<values.length;i++) {
                System.out.print(" " + values[i]);
            }
            System.out.println(" ");
            j+=1;
        }

        reader.close();
    }
}
