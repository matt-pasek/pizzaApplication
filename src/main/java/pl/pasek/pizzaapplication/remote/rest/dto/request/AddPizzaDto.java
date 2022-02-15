package pl.pasek.pizzaapplication.remote.rest.dto.request;

import pl.pasek.pizzaapplication.domain.model.SizeType;

import java.util.List;

public class AddPizzaDto
{
    private String name;
    private List<SizeType> sizes;

    public AddPizzaDto()
    {

    }

    public AddPizzaDto(String name, List<SizeType> sizes)
    {
        this.name = name;
        this.sizes = sizes;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<SizeType> getSizes()
    {
        return sizes;
    }

    public void setSizes(List<SizeType> sizes)
    {
        this.sizes = sizes;
    }
}
