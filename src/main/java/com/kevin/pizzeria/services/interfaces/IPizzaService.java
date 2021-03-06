package com.kevin.pizzeria.services.interfaces;

import java.util.List;

import com.kevin.pizzeria.entities.Ingrediente;
import com.kevin.pizzeria.entities.Pizza;

public interface IPizzaService {
    public List<Pizza> getAllPizzas();
    public Pizza getPizzaById(long idPizza);
    public Pizza save(Pizza pizza);
    public void deletePizzaById(Long idPizza);
    public Double calculateProfits(List<Ingrediente> ingredients);
}
