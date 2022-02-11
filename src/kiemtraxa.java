public class kiemtraxa {
    public static void main(String[] args) {
        car car1 = new car("ferrari", "manh");
        System.out.println(car.soCuaXe);
        System.out.println("xe " + car1.getname() + " co dong co " + car1.getDongCo() );
        car car2 = new car("audi", "yeu");
        System.out.println(car.soCuaXe);
        System.out.println("xe " + car2.getname() + " co dong co " + car2.getDongCo());
    }
}
