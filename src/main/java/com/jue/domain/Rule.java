package com.jue.domain;

import lombok.Data;

/**
 * 规则表
 * @author Pride
 */
@Data
public class Rule {
    private Integer id;
    private String inputSourceRule;
    private String outputSourceRule;
}
