package dish;

public class dish {
    protected String material;
    protected String color;

    public String getMaterial() {  //Геттер для переменной «material
        return material;
    }
    public void setMaterial(String material) {   //Cеттер для переменной «material»
        this.material = material;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public dish(String material, String color){
        this.material = material;
        this.color = color;
    }
    @Override
    public String toString() {
        return "Посуда{" +
                "Материал='" + material + '\'' +
                ", Цвет='" + color + '\'' +
                '}';
    }
}