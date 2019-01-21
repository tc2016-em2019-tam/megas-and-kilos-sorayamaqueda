package soraya;

//This class is exclusively for the operations to happen. The main will print the results.
public class Kilobytes {
    private int kb = 0; //Variable that can only be altered through methods.

    //Method for converting kilobytes into megabytes.
    public void MegaConverter (int kb) throws Exception{
        if (kb >= 0){
            this.kb = kb; //Assigning value to the variable
        }else{
            //For when the user inputs less than zero.
            System.out.println("The unit cannot be negative.");
            throw new Exception();
        }
    }

    //Method for obtaining the value of kb though the dot access operand.
    public int getKb() {
        return kb;
    }

    public void setKb(int kb) {
        this.kb = kb;
    }

    public static void printMegaANDKilo (int kb){
        int megabytes = kb / 1024; //Variable to save the value converted to megabtytes.
        int kilobytes = kb % 1024; //Variable to save the value that remains of the division.
        System.out.println(this.kb +"KB= " + this.megabytes + "MB" + this.kilobytes + "KB");
    }
}
