package com.jue.controller;

import com.jue.controller.utils.R;
import com.jue.domain.ModelAndRule;
import com.jue.service.impl.ModelAndRuleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Pride
 */
@RestController()
@RequestMapping("/models")
public class ModelAndRuleController {
    @Autowired
    private ModelAndRuleServiceImpl modelAndRuleService;

    /**
     * 获取获取Model表和Rule表的全部信息 关联条件id
     * @return
     */
    @GetMapping
    public R getAll() {
        return new R(true,modelAndRuleService.getAll());
    }

    /**
     * 向Model表和Rule表中添加一条记录
     * @param
     * @return
     */
    @PostMapping
    public R save(@RequestBody ModelAndRule modelAndRule) {
        boolean flag = modelAndRuleService.save(modelAndRule);
        return new R(flag,flag?"添加成功^_^":"添加失败-_-");
    }

    /**
     * 根据ModelAndRule信息修改Model表和Rule表中的信息
     * @param modelAndRule
     * @return
     */
    @PutMapping
    public R update(@RequestBody ModelAndRule modelAndRule) {
        return new R(modelAndRuleService.modify(modelAndRule));
    }

    /**
     * 根据id删除Model表和Rule表中的记录
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public R delete(@PathVariable Integer id) {
        return new R(modelAndRuleService.delete(id));
    }

    /**1
     * 根据id查询Model表和Rule表中的记录
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id){
        return new R(true,modelAndRuleService.getById(id));
    }
}
