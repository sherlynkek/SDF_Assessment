package vttp.batch5.sdf.task01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Use this class as the entry point of your program

// see if the file exists
// read the file (day.csv)
// split the data accordingly
// compare every individual data to find the common season /and day /and month /and 
// total number of cyclists
// 

public class Main {

	public static void main(String[] args) throws IOException {
	
		Main obj = new Main();
		obj.file();

		// System.out.printf("The " + position 
		// + "(position) recorded number of cyclists was in " + season 
		// + "(season), on a " + day + "(day) in the month of " + month + "(month)." 
		// + " There were a total of " + total + "(total) cyclists. The weather was " 
		// + weather + "(weather)." + day + " (day) was " + holiday);

	}

	private void file() {
		String csvFile = "C:\\Users\\Sherlyn Kek\\SDF\\SDF_Assessment\\task01\\day.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try 
            {
               br = new BufferedReader(new FileReader(csvFile));
               while ((line = br.readLine()) != null) {
				String[] data = line.split(cvsSplitBy);
                System.out.println("[season: " + data[0] + "] [mnth: " + data[1] 
				+ "] [holiday: " + data[2] + "] [weekday: " + data[3] + "] [weathersit: " 
				+ data[4] + "] [temp: " + data[5] + "] [hum: " + data[6] + "] [windspeed: " + data[7] 
				+ "] [casual: " + data[8] + "] [registered: " + data[9] + "]");
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
    }

	public class Season {
		// 1:spring, 2:summer, 3:fall, 4:winter

		if (season = 1) {
			System.out.println("Spring");
			
		}
		else if (season = 2) {
			System.out.println("Summer");
			
		}
		else if (season = 3) {
			System.out.println("Fall");
			
		}
		else if (season = 4) {
			System.out.println("Winter");
			
		}
	}
}
