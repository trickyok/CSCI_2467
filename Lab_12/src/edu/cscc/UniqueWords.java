package edu.cscc;

import javax.annotation.processing.Filer;
import java.io.*;
import java.util.*;

/**
 * Utility to process a document to into sorted set of unique words
 * @author Charles Farmer
 */
public class UniqueWords {
    /**
     * Read file one line at a time
     * Break input String into words
     * Store unique words sorted into alphabetic order
     *
     * @param myfile input file
     * @return sorted set of unique words
     */
    public static Set<String> processDocument(File myfile) throws IOException {
        // TODO - Implement this method to read the file one line at a time
        // and return a Set of sorted unique words. Choose the correct Collection
        // type to handle a sorted unique set of words. You will need to make use
        // of the tokenize() method below.
        Scanner file = new Scanner(myfile);
        HashSet<String> set = new HashSet<>();
        while (file.hasNextLine()) {
            String line = file.nextLine();
            String[] tokenLine = tokenize(line);
            for (int i = 0; i < tokenLine.length; i++) {
                    set.add(tokenLine[i]);
            }
        }
        set = sort(set);
        return set;
    }

    /**
     * Remove all punctuation and numbers from String
     * Tokenize - break into individual words
     * Convert all words to lower case
     *
     * @param str initial non-null String
     * @return array of words from initial String
     */
    public static String[] tokenize(String str) {
        str = str.replaceAll("[^a-zA-Z \n]", " ");
        String[] tok = str.split(" ");
        for (int i = 0; i < tok.length; ++i) {
            tok[i] = tok[i].toLowerCase();
        }
        return tok;
    }

    public static LinkedHashSet<String> sort(HashSet<String> set) {
        List<String> tempList = new ArrayList<String>(set);
        Collections.sort(tempList);
        LinkedHashSet<String> sorted = new LinkedHashSet<>();
        for (int i = 0; i < tempList.size(); i++) {
            sorted.add(tempList.get(i));
        }
        return sorted;
    }

}