public class Chandrayan {
    int pos = 0;
    public void moveBackward(){
        pos--;
    }
    public void moveForward(){
        pos++;
    }
    public static void main(String[] args){
        Chandrayan sp = new Chandrayan();
        String[] commands = {"b","f"};
        for (String command : commands) {
            if(command =="b"){
                sp.moveBackward();
            }
            else if(command =="f"){
                sp.moveBackward();
            }
            else{
                System.out.print("You have enetered an invalid command");
            }
        }

    }
}