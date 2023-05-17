package com.jue.domain;

import lombok.Data;

/**
 * 数据模型表
 * @author Pride
 */
@Data
public class Model {
    private Integer id;
    private String name;
    private Integer pid;
    private boolean fileOrFolder;
    private String businessInformation;
    private String jarDriver;
    private String jar;
    private String modelParameter;
}
