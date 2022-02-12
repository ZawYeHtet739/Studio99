package com.services;

import com.daos.SizeDao;
import com.models.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SizeService {

    @Autowired
    private SizeDao sizeDao;

    public List<Size> getSizesById(int cat_id){
        List<Size> sizes = sizeDao.getSizesById(cat_id);
        return sizes;
    }
}
