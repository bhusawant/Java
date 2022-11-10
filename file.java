import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class file {
    public static void main(String[] args) {

        //Code to create a new file
//        File myFile = new File("File.txt");
//        try {
//            myFile.createNewFile();
//        }
//        catch (IOException e){
//            System.out.println("Unable to create a file");
//            e.printStackTrace();
//        }

//        Code to write to a file
        int i = 28;
        String table = "";
        for (int j = 1; j<= 10;j++){
            table += i + "X" + j + "=" + i*(j);
            table += "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("File.txt");
//            fileWriter.write("This is a first file\nThis is second line of file");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
/*
//        Reading a file
        File myfile = new File("File.txt");

        try {
            Scanner sc = new Scanner(myfile);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        Delete a file
        File myfile = new File("File.txt");
        if (myfile.delete()){
            System.out.println("The file has been deleted: " + myFile.getName());
        }
        else {
            System.out.println("Some problem occur while deleting the file");
        }*/
    }
}
