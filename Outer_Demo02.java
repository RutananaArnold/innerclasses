public class Outer_Demo02 {
    private int number = 175;  //private members can be linked throug using getters 

    public class inner_Class{
        public int getNum(){
            System.out.println("This is a getter for number");
            return number;
        }
    }
}
