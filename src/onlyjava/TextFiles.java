package onlyjava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class TextFiles {

    ArrayList<String> songList = new ArrayList<String>();

    public static void main(String[] args) {
        new TextFiles().go();
    }

    public void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }

    void getSongs() {
        try {
            File file = new File("SongList.txt"); // Specify the correct file path
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
            reader.close(); // Close the BufferedReader to release resources
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/"); // Use standard double quotes for splitting
        if (tokens.length > 0) { // Check if there are tokens before accessing them
            songList.add(tokens[0]);
        }
    }
}
