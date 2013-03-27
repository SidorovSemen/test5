package ru.sidorov.figure;

/**
 * Класс-ромб.
 * Задается 2 параметрами - стороной(a) и диагональю(d).
 * @author sidorov
 */
public class Rhomb extends Figure{
    private double a,d1;
    
    /**
     * Конструктор принимает 2 аргумента,
     * которыми инициализирует поля объекта.
     */
    public Rhomb(double a, double d1)  {
        name="Ромб";
        this.a=a;
        this.d1=d1;
    } 
    
    /**
     * @return Возвращает значение первой диагонали ромба.
     */
    public double getDiag1(){
        return d1;
    }
    
    /**
     * @return Возвращает значение второй диагонали ромба.
     */
    public double getDiag2(){
        return 2*Math.sqrt(a*a-(d1/2)*(d1/2));
    }
    
    @Override
    public double getMax(){
        return a;
    }
        
    @Override
    public int getId(){
        return id;
    }

    @Override
    public String getName(){
        return name;
    }
    
    /**
     * @return Возвращает значение стороны ромба.
     */
    public double getSide(){
        return a;
    }

    @Override
    public double per() {
        return 4*a;
    }

    @Override
    public double area() {
        return (d1*getDiag2())/2;
    }
     
    @Override
    public String toString(){
        return "id="+this.getId()+", "+this.getName()+", сторона="+this.getSide()+", первая диагональ="+this.getDiag1()+", вторая диагональ" +Math.round(this.getDiag2()*100)/100f+", периметр="+Math.round(this.per()*100)/100f+", площадь="+Math.round(this.area()*100)/100f;
    }     
}
