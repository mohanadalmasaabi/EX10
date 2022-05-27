public class task3 {
    public static void main(String[] args) {
        int mohanadalmasaabi60527;

        try(FileInputStream fs= new FileInputStream("Test123.txt");
            FileOutputStream fos=new FileOutputStream("CopyOfFile.txt")) {

            do {
                mohanadalmasaabi60527= fs.read();
                if ((char)mohanadalmasaabi60527 == ' ')mohanadalmasaabi60527= '_';
                if (mohanadalmasaabi60527 != -1) fos.write(mohanadalmasaabi60527);
            }while (mohanadalmasaabi60527!=-1);

        }catch (IOException e){
            System.out.println("Error!!!");
}
