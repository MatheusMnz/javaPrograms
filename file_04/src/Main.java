import java.io.*;

public class Main {
    public static void main(String[] args) {
        String[] lines = new String[]{"Good morning", "Good afternoon", "Good Night"};
        String path = "/home/matheus/out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for(String line: lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}