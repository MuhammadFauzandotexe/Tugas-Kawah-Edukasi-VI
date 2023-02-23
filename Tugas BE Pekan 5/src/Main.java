public class Main {
    public static void main(String[] args) {
        Square persegi = new Square(5);
        Rectangle persegiPanjang = new Rectangle(5,10);
        Triangle segitiga = new Triangle(10,7,8,9);
        Circle lingkaran = new Circle(7);
        System.out.println("Luas tanah Pak Dengklek yang pertama adalah "+persegi.getArea()+" dan keliling nya adalah "+persegi.getAround());
        System.out.println("Luas tanah Pak Dengklek yang kedua adalah "+persegiPanjang.getArea()+" dan keliling nya adalah "+persegiPanjang.getAround());
        System.out.println("Luas tanah Pak Dengklek yang ketiga adalah "+segitiga.getArea()+" dan keliling nya adalah "+segitiga.getAround());
        System.out.println("Luas tanah Pak Dengklek yang keempat adalah "+lingkaran.getArea()+" dan keliling nya adalah "+lingkaran.getAround());
    }
}