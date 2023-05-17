package com.jue.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jue.domain.Model;

import java.util.List;

public interface IModelService extends IService<Model> {
    /**
     * 添加一条记录
     * @param model
     * @return
     */
    @Override
    boolean save(Model model);

    /**
     * 根据model修改记录
     * @param model
     * @return
     */
    boolean modify(Model model);

    /**
     * 根据id删除记录
     * @param id
     * @return
     */
    boolean delete(Integer id);

    /**
     * 根据id查询记录
     * @param id
     * @return
     */
    Model getById(Integer id);

    /**
     * 查询所有记录
     * @return
     */
    List<Model> getAll();

    /**
     * 查询id
     * @return
     */

}
