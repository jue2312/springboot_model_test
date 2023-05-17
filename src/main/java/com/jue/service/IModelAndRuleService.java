package com.jue.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jue.domain.ModelAndRule;

import java.util.List;

/**
 * @author Pride
 */
public interface IModelAndRuleService extends IService<ModelAndRule> {
    /**
     * 添加一条记录
     * @param
     * @return
     */
    @Override
    boolean save(ModelAndRule modelAndRule);

    /**
     * 根据model修改记录
     * @param modelAndRuleDao
     * @return
     */
    boolean modify(ModelAndRule modelAndRuleDao);

    /**
     * 根据id删除记录
     * @param id
     * @return
     */
    boolean delete(Integer id);

    /**
     * 根据id查询记录
     *
     * @param id
     * @return
     */
    ModelAndRule getById(Integer id);

    /**
     * 查询所有记录
     * @return
     */

    List<ModelAndRule> getAll();
}
