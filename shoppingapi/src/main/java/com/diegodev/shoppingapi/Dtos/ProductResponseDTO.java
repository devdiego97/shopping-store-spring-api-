package com.diegodev.shoppingapi.Dtos;

import java.math.BigDecimal;

public record ProductResponseDTO( Long id,String name,String about,
String category,String state,BigDecimal price,String cover,
String imgs,String mark,String model

) {

}
