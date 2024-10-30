package vttp.batch5.sdf.task01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Use this class as the entry point of your program

public class Main {

	public static void main(String[] args) throws IOException {
	
		Main obj = new Main();
		obj.run();

		// System.out.printf("The " + position + "recorded number of cyclists was in " + season + ", on a " + day + "in the month of of " + month + "." + " There were a total of " + total + " cyclists. The weather was " + weather + "." + day + " was " + holiday);

	}

	private void run() {
		String csvFile = "C:\\Users\\Sherlyn Kek\\SDF\\SDF_Assessment\\task01\\day.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try 
            {
               br = new BufferedReader(new FileReader(csvFile));
               while ((line = br.readLine()) != null) {
				String[] id = line.split(cvsSplitBy);
                System.out.println(" ");
            }

        } 
		catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
		catch (IOException e) {
            e.printStackTrace();
        } 
		finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }    

        System.out.println("#####################3");
    }
}
