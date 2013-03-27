package ru.sidorov.figure;

import ru.sidorov.interfaces.*;

/**
 * Класс-фигура(абстрактный).
 * Класс-родитель классов Rhomb,Semicircle, Square, Trapeze.
 * @author sidorov
 */
public abstract class Figure implements Perimeter, Area{
    String name="Фигура";
    int id;
    private static int nextId=1;
    { id = nextId++; }
        
    /**
     * @return Возвращает значение ID фигуры.
     */
    public abstract int getId();
    
    /**
     * @return Возвращает наименование фигуры.
     */
    public abstract String getName();  
    
    /**
     * @return Возвращает значение максимальной стороны фигуры.
     */
    public abstract double getMax();
       
}    
