package pl.pasek.pizzaapplication.remote.rest.dto.request;

import pl.pasek.pizzaapplication.remote.rest.dto.response.OrderStatusDto;

import java.util.List;

public class UpdateOrderDto
{
    private OrderStatusDto status;
    private List<PizzaOrderDto> pizzas;
    private List<PersonOrderDto> persons;

    public UpdateOrderDto()
    {

    }

    public UpdateOrderDto(OrderStatusDto status, List<PizzaOrderDto> pizzas, List<PersonOrderDto> persons)
    {
        this.status = status;
        this.pizzas = pizzas;
        this.persons = persons;
    }

    public OrderStatusDto getStatus()
    {
        return status;
    }

    public void setStatus(OrderStatusDto status)
    {
        this.status = status;
    }

    public List<PizzaOrderDto> getPizzas()
    {
        return pizzas;
    }

    public void setPizzas(List<PizzaOrderDto> pizzas)
    {
        this.pizzas = pizzas;
    }

    public List<PersonOrderDto> getPersons()
    {
        return persons;
    }

    public void setPersons(List<PersonOrderDto> persons)
    {
        this.persons = persons;
    }
}
