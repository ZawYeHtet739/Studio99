package com.services;

import com.daos.ColorDao;
import com.models.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorService {

    @Autowired
    private ColorDao colorDao;

    public List<Color> getColorsById(int cat_id){
        List<Color> colors = colorDao.getColorsById(cat_id);
        return colors;
    }
}
