package pack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Weather {

    public static void main(String[] args) {

    	int max_temp1=0;
        String csvFile = "/home/student/Desktop/Weather.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] weather = line.split(cvsSplitBy);
                //System.out.println(weather);
                //System.out.println("Weather [Date= " + weather[2] + " , MaxTemp=" + weather[11] + "]");
                String d=weather[2];
                System.out.println(d.substring(0, 4));
                if(weather[2]=2000)
                {
                	
                	for( String v : weather) {
                		
                	}
                }
                System.out.println("Weather [Date= " + weather[2] + " , MaxTemp=" + weather[11] + "]");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}