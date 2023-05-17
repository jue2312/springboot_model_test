package com.jue.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jue.controller.utils.GetModelOrRule;
import com.jue.dao.ModelAndRuleDao;
import com.jue.dao.ModelDao;
import com.jue.dao.RuleDao;
import com.jue.domain.ModelAndRule;
import com.jue.service.IModelAndRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Pride
 */
@Service
public class ModelAndRuleServiceImpl extends ServiceImpl<ModelAndRuleDao, ModelAndRule> implements IModelAndRuleService {
    @Autowired
    private ModelDao modelDao;
    @Autowired
    private RuleDao ruleDao;

    @Autowired
    private ModelAndRuleDao modelAndRuleDao;

    /**
     * 将ModelAndRule分成Model实体类和Rule实体类
     * @param modelAndRule
     * @return
     */
    @Override
    public boolean save(ModelAndRule modelAndRule) {
        boolean x = modelDao.insert(GetModelOrRule.getModel(modelAndRule)) > 0;
        boolean y = ruleDao.insert(GetModelOrRule.getRule(modelAndRule)) > 0;
        return x == y == true;
    }

    @Override
    public boolean modify(ModelAndRule modelAndRule) {
        boolean x = modelDao.updateById(GetModelOrRule.getModel(modelAndRule)) > 0;
        boolean y = ruleDao.updateById(GetModelOrRule.getRule(modelAndRule)) > 0;
        return x==y;
    }

    @Override
    public boolean delete(Integer id) {
        boolean x = modelDao.deleteById(id) > 0;
        boolean y = ruleDao.deleteById(id) > 0;
        return x==y;
    }

    @Override
    public ModelAndRule getById(Integer id) {
        return modelAndRuleDao.getById(id);
    }

    @Override
    public List<ModelAndRule> getAll() {
        return modelAndRuleDao.selectAll();
    }
}
