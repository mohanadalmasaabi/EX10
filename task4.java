public class task4 {


    public static void main(String[] args) throws IOException {


        DataManagement dm= new DataManagement();
        dm.ReadData();
        dm.WriteToFile();
        System.out.println("-------------");
        dm.ReadFromFile();
}
