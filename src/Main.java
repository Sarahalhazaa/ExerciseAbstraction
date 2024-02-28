public class Main {
    public static void main(String[] args) {

//Q1-------------------------------------------------------------------
        System.out.println("");
        System.out.println("Q1");
        System.out.println("");
        Book B = new Book("Book1",20,"sara");
        System.out.println(" price after discount: "+B.getDiscount());

        Movie M = new Movie("Movie1",10,"Nasser");
        System.out.println(" price after discount: "+M.getDiscount());
        System.out.println("");

//Q2--------------------------------------------------------------------

        System.out.println("Q2");
        System.out.println("");
        MovablePoint MP =new MovablePoint(10,20,40,30);
        System.out.print("moveUp: ");
        MP.moveUp();
        System.out.print("moveDown: ");
        MP.moveDown();
        System.out.print("moveLeft: ");
        MP.moveLeft();
        System.out.print("moveRight: ");
        MP.moveRight();
    }
}