package com.sean.po;

/**
 * @author sean
 */
public class Rule implements Sean{
    private Integer ruleId;
    private String ruleName;
    private String ruleDescription;
    private String ruleCategory;

    public Rule() {
    }

    public Rule(Integer ruleId, String ruleName, String ruleDescription, String ruleCategory) {
        this.ruleId = ruleId;
        this.ruleName = ruleName;
        this.ruleDescription = ruleDescription;
        this.ruleCategory = ruleCategory;
    }

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleDescription() {
        return ruleDescription;
    }

    public void setRuleDescription(String ruleDescription) {
        this.ruleDescription = ruleDescription;
    }

    public String getRuleCategory() {
        return ruleCategory;
    }

    public void setRuleCategory(String ruleCategory) {
        this.ruleCategory = ruleCategory;
    }

    @Override
    public String toString() {
        return "Rule{" +
                "ruleId=" + ruleId +
                ", ruleName='" + ruleName + '\'' +
                ", ruleDescription='" + ruleDescription + '\'' +
                ", ruleCategory='" + ruleCategory + '\'' +
                '}';
    }

    @Override
    public String name() {
        return this.ruleName;
    }
}
