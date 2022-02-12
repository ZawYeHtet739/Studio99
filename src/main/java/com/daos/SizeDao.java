package com.daos;

import com.models.Size;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SizeDao {

    List<Size> getSizesById(int cat_id);
}
