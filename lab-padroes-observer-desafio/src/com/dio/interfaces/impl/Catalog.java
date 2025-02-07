package com.dio.interfaces.impl;

import java.util.ArrayList;
import java.util.List;

import com.dio.interfaces.CatalogObservable;
import com.dio.interfaces.Observer;

public class Catalog implements CatalogObservable {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

  
    @Override
    public void notifyObservers(String productName) {
        System.out.printf("Notificacao recebida: Novo produto adicionado - %s", productName);
    }

    public void addProduct(String name, String description, double price) {
        notifyObservers(name);
    }
}