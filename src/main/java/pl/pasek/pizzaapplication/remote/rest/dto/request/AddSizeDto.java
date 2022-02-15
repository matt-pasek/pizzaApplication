package pl.pasek.pizzaapplication.remote.rest.dto.request;

import pl.pasek.pizzaapplication.domain.model.SizeType;

import java.math.BigDecimal;

public class AddSizeDto
{
    private SizeType sizes;
    private BigDecimal price;

    public AddSizeDto()
    {

    }

    public AddSizeDto(SizeType sizes, BigDecimal price)
    {
        this.sizes = sizes;
        this.price = price;
    }

    public SizeType getSizes()
    {
        return sizes;
    }

    public void setSizes(SizeType sizes)
    {
        this.sizes = sizes;
    }

    public BigDecimal getPrice()
    {
        return price;
    }

    public void setPrice(BigDecimal price)
    {
        this.price = price;
    }
}
