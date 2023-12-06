package dsa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * The SongTextFile class reads song titles from a text file, stores them in an
 * ArrayList, and sorts them alphabetically.
 */
public class SongTextFile {

    /**
     * An ArrayList that stores the song titles.
     */
    ArrayList<String> songList = new ArrayList<String>();

    /**
     * The main method that creates an instance of SongTextFile and calls the go()
     * method.
     * 
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        new SongTextFile().go();
    }

    /**
     * The go method reads the song titles from a text file, prints the unsorted
     * song list, sorts the song list alphabetically, and prints the sorted song
     * list.
     */
    public void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }

    /**
     * The getSongs method reads the song titles from a text file and adds each song
     * title to the songList ArrayList.
     */
    void getSongs() {
        try {
            File file = new File("D:\\IntelliJ_Project_Practice\\JavaPractice\\SongList.txt"); // Specify the correct
                                                                                               // file path
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

    /**
     * The addSong method splits the given line of text using the "/" delimiter and
     * adds the first token (song title) to the songList ArrayList.
     * 
     * @param lineToParse The line of text to parse and add to the songList
     *                    ArrayList.
     */
    void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/"); // Use standard double quotes for splitting
        if (tokens.length > 0) { // Check if there are tokens before accessing them
            songList.add(tokens[0]);
        }
    }
}
