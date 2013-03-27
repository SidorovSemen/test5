package ru.sidorov.figure;

/**
 * Класс-трапеция.
 * Задается 4 параметрами:
 * нижнее основание, левая боковая, 
 * верхнее основание, высота.
 * @author sidorov
 */
public class Trapeze extends Figure{
    private double down,left,up,h;
    
    /**
     * Конструктор принимает 4 аргумента,
     * которыми инициализирует поля объекта.
     */
    public Trapeze(double down, double left, double up, double h)  {
        name="Трапеция";
        this.down=down;
        this.left=left;
        this.up=up;
        this.h=h;
    } 
        
    @Override
    public double getMax(){
        if (down>left && down>up && down>getRight())
            return down;
        else if (left>up && left>getRight())
            return left;
        else if (up>getRight())
            return up;
        return getRight();
    }
         

    @Override
    public int getId(){
        return id;
    }

    /**
     * @return Возвращает значение высоты трапеции.
     */
    public double getH(){
        return h;
    }    
    
    @Override
    public String getName(){
        return name;
    }
    
    /**
     * Метод, вычисляющий катет в прямоугольном треугольнике.
     * Необходим для нахождения четвертой стороны трапеции.
     * b-один из катетов, с -гипотенуза.
     * @return Возвращает значение второго катета.
     */
    public double getCat(double b, double c){   
        return Math.sqrt(c*c-b*b);               
    }
    
    /**
     * Метод, вычисляющий гипотенузу в прямоугольном треугольнике.
     * Необходим для нахождения четвертой стороны трапеции.
     * a,b - катеты.
     * @return Возвращает значение гипотенузы.
     */
    public double getGyp(double a, double b){      
        return Math.sqrt(a*a+b*b);             
    }
               
    /**
     * Метод, вычисляющий четвертую сторону трапеции(правую боковую).
     * Вычисление происходит с помощью методов getCat() и getGyp.
     * @return Возвращает значение правой боковой стороны трапеции.
     */
    public double getRight(){
        double x=down-up-getCat(h,left);            //проекция правой боковой на нижнее основание 
        return getGyp(h,x);
    }

    @Override
    public double per() {
        return down+left+up+getRight();
    }

    @Override
    public double area() {
        return ((down+up)*h)/2;
    }
  
    @Override
    public String toString(){
        return "id="+this.getId()+", "+this.getName()+", нижнее основание="+this.down+", левая боковая="+this.left+", верхнее основание="+this.up+", правая боковая="+Math.round(this.getRight()*100)/100f+", высота ="+this.getH()+", периметр="+Math.round(this.per()*100)/100f+", площадь="+Math.round(this.area()*100)/100f;
    }
}
