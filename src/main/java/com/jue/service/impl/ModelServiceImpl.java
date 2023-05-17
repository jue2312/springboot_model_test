package com.jue.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jue.dao.ModelDao;
import com.jue.domain.Model;
import com.jue.service.IModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Pride
 */
@Service
public class ModelServiceImpl extends ServiceImpl<ModelDao, Model> implements IModelService {
    @Autowired
    private ModelDao modelDao;
    @Override
    public boolean save(Model model) {
        return modelDao.insert(model) > 0;
    }

    @Override
    public boolean modify(Model model){
        return modelDao.updateById(model) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return modelDao.deleteById(id) > 0;
    }

    @Override
    public Model getById(Integer id) {
        return modelDao.selectById(id);
    }

    @Override
    public List<Model> getAll() {
        return modelDao.selectList(null);
    }




}
