public class car {
    private String name;
    private String dongCo;
    public static int soCuaXe;
    public car(){
    }
    public car(String name, String dongCo){
        this.name = name;
        this.dongCo = dongCo;
        soCuaXe++;
    }
    public String getname(){
        return name;
    }
    public String getDongCo(){
        return dongCo;
    }
}
