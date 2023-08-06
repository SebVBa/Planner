package Controllers;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */


/**
 *
 * @author jprod
 */
public interface Controller<Type> {
    public void insert(Type obj);
    public void update(Type obj);
    public void delete(Type obj);
    public void read(Object id);
    public void readAll();
}
