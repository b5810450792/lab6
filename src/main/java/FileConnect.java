import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileConnect {
    private String line = null;

    public void readFile(){
        try {
            Path file = Paths.get("C:\\Users\\Admin\\Desktop\\CodeJava\\selab06\\boss.txt");
            BufferedReader reader = Files.newBufferedReader(file ,
                    StandardCharsets.UTF_8);

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }

    public String getLine() {
        return line;
    }

    public void writeFileExpense(ExpenseIncome expenseIncome,Balance balance) {

        try {
            File file = new File("C:\\Users\\Admin\\Desktop\\CodeJava\\selab06\\boss.txt");
            //  FileWriter writer = new FileWriter(file,false); // true จะเขียนต่อท้ายไฟล์
            FileWriter writer = new FileWriter(file, true); // true จะเขียนต่อท้ายไฟล์
            balance.calculateExpense(expenseIncome.getRmoney(),balance.getTotal());
            writer.write(expenseIncome.getRdate()+" -"+expenseIncome.getRmoney()
                    +" "+expenseIncome.getRtype()+" "+expenseIncome.getRdetail()+" "+balance.getTotal()+ System.getProperty("line.separator"));
            writer.close();
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }
    public void writeFileIncome(ExpenseIncome expenseIncome,Balance balance) {

        try {
            File file = new File("C:\\Users\\Admin\\Desktop\\CodeJava\\selab06\\boss.txt");
            //  FileWriter writer = new FileWriter(file,false); // true จะเขียนต่อท้ายไฟล์
            FileWriter writer = new FileWriter(file, true); // true จะเขียนต่อท้ายไฟล์

            balance.calculateIncome(expenseIncome.getRmoney(),balance.getTotal());
            writer.write(expenseIncome.getRdate()+" +"+expenseIncome.getRmoney()
                    +" "+expenseIncome.getRtype()+" "+expenseIncome.getRdetail()+" "+balance.getTotal()+ System.getProperty("line.separator"));
            writer.close();
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }

    }

//    public void lastLine(String line){
//        if(line.isEmpty()){
//            //System.out.println(line);
//        }else {
//            //System.out.println(line);
//            //String[] strings =
//        }
//
//    }
}
