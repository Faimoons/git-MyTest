package Home1Work;

import java.io.*;

public class CreatJavaClass implements NameMethod {
    private static String way = "C:\\Users\\Faimo\\ideaProjects\\HomeWorkStudent\\src\\Home1Work\\";

    public static void main(String[] args) {
        CreatJavaClass work = new CreatJavaClass();
        work.recordNameJavaClass("Homework1\n" +
                "Homework2\n" +
                "Homework3\n" +
                "Homework4\n" +
                "Homework5\n" +
                "Homework6\n" +
                "Homework7\n" +
                "Homework8\n" +
                "Homework9\n" +
                "Homework10\n" +
                "Homework11");
        readAllFileNameAndCheckExists(way, "Strelcenok");
    }
    private static void recordAndCreatJavaClassAndRecordPackage(String way,String line, String folder){
        String wayPackage = "package Home1Work." + folder + ";\n";
        try (BufferedWriter record = new BufferedWriter(new FileWriter(way + folder +"\\"+ line + ".java"))) {
            String nameClass = "class " + line + "{\n public static void main(String[] args) {}\n}";
            record.write(wayPackage+nameClass);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readAllFileNameAndCheckExists(String way, String folder) {
        String line;
        try (BufferedReader read = new BufferedReader(new FileReader(way + "NameJavaClass.txt"))) {
            while ((line = read.readLine()) != null) {
                File file = new File(way + folder+"\\" + line + ".java");
                if (!file.exists()) {
                  recordAndCreatJavaClassAndRecordPackage(way,line,folder);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void recordNameJavaClass(String nameJavaClass) {
        try (BufferedWriter record = new BufferedWriter(new FileWriter(way + "NameJavaClass.txt"))) {
            record.write(nameJavaClass);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
