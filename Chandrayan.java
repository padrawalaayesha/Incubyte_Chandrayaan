public class Chandrayan {
    int position = 0;
    public void moveBackward(){
        position--;
    }
    public static void main(String[] args){
        Chandrayan sp = new Chandrayan();
        String[] commands = {"b"};
        for (String command : commands) {
            if(command =="b"){
                sp.moveBackward();
            }
            else{
                System.out.print("Invalid Command");
            }
        }

    }
}