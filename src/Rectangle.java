public class Rectangle {
    private int height=0;
    private int width=0;
    private Point origin;

    //下面是构造方法
    public Rectangle(){
        origin=new Point(0,0);
    }
    public Rectangle(Point p){
        origin = p;
    }
    public Rectangle(Point p,int w,int h){
        origin=p;
        width=w;
        height=h;
    }
    public Rectangle(int w,int h){
        this(new Point(0,0),w,h);
    }

    //下面是常规的方法
    public void move(int x,int y){
        origin.setXAndY(x,y);
    }
    public int area(){
        return width*height;
    }
    public void setWidthAndHeight(int w,int h){
        width=w;
        height=h;
    }
    public void setPoint(Point p){
        origin=p;
    }
    public int getXOfPoint(){
        return origin.getX();
    }
    public int getYOfPoint(){
        return origin.getY();
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }

}
