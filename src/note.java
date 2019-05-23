import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

    public class note {
        public static void main(String[] args)  {
            String filename = "note.txt";
            FileReader fr = null;
            try {
                fr = new FileReader(filename);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            BufferedReader inFile = new BufferedReader(fr);


            String line;
            try {
                while ((line = inFile.readLine() ) != null) {
                    System.out.println(line);
                }
                inFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
