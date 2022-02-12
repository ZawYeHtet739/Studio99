package com.daos;

import com.models.Color;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ColorDao {

    List<Color> getColorsById(int cat_id);

}
