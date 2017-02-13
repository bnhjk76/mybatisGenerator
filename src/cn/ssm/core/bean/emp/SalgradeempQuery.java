package cn.ssm.core.bean.emp;

import java.util.ArrayList;
import java.util.List;

public class SalgradeempQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public SalgradeempQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Integer value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Integer value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Integer value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Integer value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Integer value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Integer value1, Integer value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andLosalIsNull() {
            addCriterion("losal is null");
            return (Criteria) this;
        }

        public Criteria andLosalIsNotNull() {
            addCriterion("losal is not null");
            return (Criteria) this;
        }

        public Criteria andLosalEqualTo(Integer value) {
            addCriterion("losal =", value, "losal");
            return (Criteria) this;
        }

        public Criteria andLosalNotEqualTo(Integer value) {
            addCriterion("losal <>", value, "losal");
            return (Criteria) this;
        }

        public Criteria andLosalGreaterThan(Integer value) {
            addCriterion("losal >", value, "losal");
            return (Criteria) this;
        }

        public Criteria andLosalGreaterThanOrEqualTo(Integer value) {
            addCriterion("losal >=", value, "losal");
            return (Criteria) this;
        }

        public Criteria andLosalLessThan(Integer value) {
            addCriterion("losal <", value, "losal");
            return (Criteria) this;
        }

        public Criteria andLosalLessThanOrEqualTo(Integer value) {
            addCriterion("losal <=", value, "losal");
            return (Criteria) this;
        }

        public Criteria andLosalIn(List<Integer> values) {
            addCriterion("losal in", values, "losal");
            return (Criteria) this;
        }

        public Criteria andLosalNotIn(List<Integer> values) {
            addCriterion("losal not in", values, "losal");
            return (Criteria) this;
        }

        public Criteria andLosalBetween(Integer value1, Integer value2) {
            addCriterion("losal between", value1, value2, "losal");
            return (Criteria) this;
        }

        public Criteria andLosalNotBetween(Integer value1, Integer value2) {
            addCriterion("losal not between", value1, value2, "losal");
            return (Criteria) this;
        }

        public Criteria andHisalIsNull() {
            addCriterion("hisal is null");
            return (Criteria) this;
        }

        public Criteria andHisalIsNotNull() {
            addCriterion("hisal is not null");
            return (Criteria) this;
        }

        public Criteria andHisalEqualTo(Integer value) {
            addCriterion("hisal =", value, "hisal");
            return (Criteria) this;
        }

        public Criteria andHisalNotEqualTo(Integer value) {
            addCriterion("hisal <>", value, "hisal");
            return (Criteria) this;
        }

        public Criteria andHisalGreaterThan(Integer value) {
            addCriterion("hisal >", value, "hisal");
            return (Criteria) this;
        }

        public Criteria andHisalGreaterThanOrEqualTo(Integer value) {
            addCriterion("hisal >=", value, "hisal");
            return (Criteria) this;
        }

        public Criteria andHisalLessThan(Integer value) {
            addCriterion("hisal <", value, "hisal");
            return (Criteria) this;
        }

        public Criteria andHisalLessThanOrEqualTo(Integer value) {
            addCriterion("hisal <=", value, "hisal");
            return (Criteria) this;
        }

        public Criteria andHisalIn(List<Integer> values) {
            addCriterion("hisal in", values, "hisal");
            return (Criteria) this;
        }

        public Criteria andHisalNotIn(List<Integer> values) {
            addCriterion("hisal not in", values, "hisal");
            return (Criteria) this;
        }

        public Criteria andHisalBetween(Integer value1, Integer value2) {
            addCriterion("hisal between", value1, value2, "hisal");
            return (Criteria) this;
        }

        public Criteria andHisalNotBetween(Integer value1, Integer value2) {
            addCriterion("hisal not between", value1, value2, "hisal");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}