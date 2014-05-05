package bez;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileRead {
    static ArrayList<String> myList = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File f = new File("C://sample.wpt");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String line, cash;
        while ((line = fin.readLine()) != null) {
            int s = line.indexOf(",");
            int k = 1;
            if (s > 0) {
                while (line.indexOf(',') > 0) {
                    s = line.indexOf(",");
                    cash = line.substring(0, s);
                    cash = cash.trim();
                    while (cash.length() != 2 && k == 1) {
                        cash = cash + " ";
                    }
                    while (cash.length() != 8 && k == 2) {
                        cash = cash + " ";
                    }
                    k++;
                    myList.add(cash + '|');
                    line = line.substring(s + 1);
                }
                String d = "";
                for (int i = 0; i < myList.size(); i++)
                    d = d + myList.get(i);
                System.out.println(d);
                myList.clear();
            }
        }
        fin.close();
    }
}


