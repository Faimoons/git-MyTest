package Home1Work;

import java.io.*;

public class CreatJavaClass implements NameMethod {
    private static String way = "C:\\Users\\Faimo\\ideaProjects\\HomeWorkStudent\\src\\Home1Work\\";

    public static void main(String[] args) {
        CreatJavaClass work = new CreatJavaClass();
        work.recordNameJavaClass("OcHomework1\n" +
                "OcHomework2\n" +
                "OcHomework3\n" +
                "OcHomework4\n" +
                "OcHomework5\n" +
                "OcHomework6\n" +
                "OcHomework7\n" +
                "OcHomework8\n" +
                "OcHomework9\n" +
                "OcHomework10\n" +
                "OcHomework11");
        readAllFileNameAndCheckExists(way, "Belanovih");
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
