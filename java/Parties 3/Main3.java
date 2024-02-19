class Point {
  int x, y;

  public Point(Point p) {
    this.x = p.x;
    this.y = p.y;
  }

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int sum() {
    return x + y;
  }
}

class Main3 {

  public static void main(String[] args) {

    Point point = new Point(1, 1);
    System.out.println(point.sum());

    Point point2 = new Point(point);
    System.out.println(point2.sum());

  }
}