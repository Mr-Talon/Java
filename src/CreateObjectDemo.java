public class CreateObjectDemo {
    public static void main(String[] args){
        Point origin_one = new Point(23,94);

        Rectangle rect_one = new Rectangle(origin_one, 100, 200);
        Rectangle rect_two = new Rectangle(50, 100);
        System.out.println("Width of rect_one: " + rect_one.getWidth());
        System.out.println("Height of rect_one: " + rect_one.getHeight());
        System.out.println("Area of rect_one: " + rect_one.area());

        rect_two.setPoint(origin_one);
        System.out.println("X Position of rect_two: " + rect_two.getXOfPoint());
        System.out.println("Y Position of rect_two: " + rect_two.getYOfPoint());

        rect_two.move(40, 72);
        System.out.println("X Position of rect_two: " + rect_two.getXOfPoint());
        System.out.println("Y Position of rect_two: " + rect_two.getYOfPoint());

    }
}
