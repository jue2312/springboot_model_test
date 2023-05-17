package com.jue.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 数据模型和规则表
 * @author Pride
 */
@Data
@NoArgsConstructor
public class ModelAndRule {
    private Integer id;
    private Integer pid;
    private String name;
    private String businessInformation;
    private String jarDriver;
    private String jar;
    private boolean fileOrFolder;
    private String modelParameter;
    private String inputSourceRule;
    private String outputSourceRule;


    public ModelAndRule(Integer id,boolean fileOrFolder, Integer pid, String name, String businessInformation, String jarDriver, String jar, String modelParameter, String inputSourceRule, String outputSourceRule) {
        this.id = id;
        this.pid = pid;
        this.fileOrFolder=fileOrFolder;
        this.name = name;
        this.businessInformation = businessInformation;
        this.jarDriver = jarDriver;
        this.jar = jar;
        this.modelParameter = modelParameter;
        this.inputSourceRule = inputSourceRule;
        this.outputSourceRule = outputSourceRule;
    }


    @Override
    public String toString() {
        return "ModelAndRule{" +
                "id=" + id +
                ", pid=" + pid +
                ", name='" + name + '\'' +
                ", businessInformation='" + businessInformation + '\'' +
                ", jarDriver='" + jarDriver + '\'' +
                ", fileOrFolder='" + fileOrFolder + '\'' +
                ", jar='" + jar + '\'' +
                ", modelParameter='" + modelParameter + '\'' +
                ", inputSourceRule='" + inputSourceRule + '\'' +
                ", outputSourceRule='" + outputSourceRule + '\'' +
                '}';
    }
}
