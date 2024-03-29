import java.io.*;
import java.io.BufferedReader;
import java.util.*;
public class Assignment2 {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);

        //input file name
        System.out.print("Enter the file name: ");
        String filename = sc.nextLine();

        //count number of lines
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/src/main/java/" + filename));
        } catch (IOException e) {
            System.out.println(e);
        }
        int l = 0;
        while (reader.readLine() != null) l++;
        reader.close();

        //initialising lines and wordCount arrays with the number of lines
        String[] lines = new String[l];
        int[] wordCount = new int[l];

        //getting the absolute path of the file
        filename = System.getProperty("user.dir") + "/src/main/java/" + filename;

        //printing the contents of the file
        File f1 = new File(filename);
        System.out.println("contents of the file: ");
        Scanner sc1 = new Scanner(f1);
        while(sc1.hasNextLine()){
            System.out.println(sc1.nextLine());
        }
        System.out.println();

        //filling the lines and wordCount arrays with relevant values
        File f = new File(filename);
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(f);
        } catch (FileNotFoundException e1) {
            System.out.println("message: " + e1);
        }
        int r = 0, lindex = 0;
        StringBuilder str = new StringBuilder();
        while ((r = fis.read()) != -1) {
            str.append((char) r);
            if ((char) r == '\n') {
                wordCount[lindex] = str.length();
                lines[lindex++] = str.toString();
                str = new StringBuilder();
            }
        }

        // calling all the relevant functions
        System.out.println("longest line:" + findLongestLine(lines));
        System.out.println("shortest line:" + findShortestLine(lines));
        System.out.print("word count for each line:" );
        for(int i: countWords(lines)){
            System.out.print(i+" ");
        }
        System.out.println("\n\nsorted word count:");
        sortWordCount(countWords(lines));


    }
    public static String findLongestLine(String[] lines){
        int max=lines[0].length();
        int maxindex =0;
        for(int i=0;i<lines.length;i++){
            if(lines[i].length()>=max){
                String s=lines[i];
                max =s.length();
                maxindex = i;
            }
        }
        return lines[maxindex];
    }
    public static String findShortestLine(String[] lines){
        int min=lines[0].length();
        int minindex =0;
        for(int i=0;i<lines.length;i++){
            if(lines[i].length()<=min){
                String s=lines[i];
                min =s.length();
                minindex = i;
            }
        }
        return lines[minindex];
    }
    public static int[] countWords(String[] lines){
        int[] count = new int[lines.length];
        int i=0;
        for(String s:lines){
            int c=0;
            s =s.trim();
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==' ')
                    c++;
            }
            count[i]=c+1;
            i++;
        }
        return count;
    }
    public static void sortWordCount(int[] wordCounts){
        int[] wc = Arrays.stream(wordCounts).sorted().toArray();
        int[] reversedWc = new int[wc.length];
        for (int i = 0; i < wc.length; i++) {
            reversedWc[i] = wc[wc.length - i - 1];
        }
        for(int i:reversedWc){
            System.out.println(i+" words");
        }
    }
}
