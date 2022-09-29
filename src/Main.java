import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readFile();
        writeFile();
        readFile();



    }public static void getFilInfo(){
        File file=new File("C:\\javaDemos\\Files\\students.txt");
        if (file.exists()){
            System.out.println("dosya adi: "+ file.getName());
            System.out.println("dosya yolu: "+ file.getAbsolutePath());
            System.out.println("dosya yazilabilir mi? : "+ file.canWrite());
            System.out.println("dosya boyutu: "+ file.length());
        }
    }

    public static void createFile(){
        File file=new File("C:\\javaDemos\\Files\\students.txt");
        try {
            if (file.createNewFile()){
                System.out.println("dosya oluşturuldu.");
            }else {
                System.out.println("dosya zaten var.");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void readFile(){
        File file=new File("C:\\javaDemos\\Files\\students.txt");
        try {
            Scanner reader =new Scanner(file);
            while (reader.hasNext()){
                String line= reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void writeFile(){
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\javaDemos\\Files\\students.txt",true));
            writer.newLine();
            writer.write("ertug");
            System.out.println("dosyaya yazildi");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}