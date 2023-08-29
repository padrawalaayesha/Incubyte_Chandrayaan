public class Chandrayan {
    int position = 0;
    public void moveBackward(){
        position--;
    }
    public void moveForward(){
        position++;
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
                System.out.print("Invalid Command");
            }
        }

    }
}