package home.pb.springwebmvc.dao;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import home.pb.springwebmvc.entity.Customer;
import home.pb.springwebmvc.entity.CustomerExample.Criteria;
import home.pb.springwebmvc.entity.CustomerExample.Criterion;
import home.pb.springwebmvc.entity.CustomerExample;
import java.util.List;
import java.util.Map;

public class CustomerSqlProvider {

    public String countByExample(CustomerExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("customer");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(CustomerExample example) {
        BEGIN();
        DELETE_FROM("customer");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(Customer record) {
        BEGIN();
        INSERT_INTO("customer");
        
        if (record.getCustomer_id() != null) {
            VALUES("customer_id", "#{customer_id,jdbcType=INTEGER}");
        }
        
        if (record.getCustomer_name() != null) {
            VALUES("customer_name", "#{customer_name,jdbcType=VARCHAR}");
        }
        
        if (record.getContact_name() != null) {
            VALUES("contact_name", "#{contact_name,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            VALUES("phone", "#{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            VALUES("address", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getProvince() != null) {
            VALUES("province", "#{province,jdbcType=VARCHAR}");
        }
        
        if (record.getCity() != null) {
            VALUES("city", "#{city,jdbcType=VARCHAR}");
        }
        
        if (record.getSale_employee_id() != null) {
            VALUES("sale_employee_id", "#{sale_employee_id,jdbcType=INTEGER}");
        }
        
        if (record.getCredit_limit() != null) {
            VALUES("credit_limit", "#{credit_limit,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    public String selectByExample(CustomerExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("customer_id");
        } else {
            SELECT("customer_id");
        }
        SELECT("customer_name");
        SELECT("contact_name");
        SELECT("phone");
        SELECT("address");
        SELECT("province");
        SELECT("city");
        SELECT("sale_employee_id");
        SELECT("credit_limit");
        FROM("customer");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Customer record = (Customer) parameter.get("record");
        CustomerExample example = (CustomerExample) parameter.get("example");
        
        BEGIN();
        UPDATE("customer");
        
        if (record.getCustomer_id() != null) {
            SET("customer_id = #{record.customer_id,jdbcType=INTEGER}");
        }
        
        if (record.getCustomer_name() != null) {
            SET("customer_name = #{record.customer_name,jdbcType=VARCHAR}");
        }
        
        if (record.getContact_name() != null) {
            SET("contact_name = #{record.contact_name,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            SET("phone = #{record.phone,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            SET("address = #{record.address,jdbcType=VARCHAR}");
        }
        
        if (record.getProvince() != null) {
            SET("province = #{record.province,jdbcType=VARCHAR}");
        }
        
        if (record.getCity() != null) {
            SET("city = #{record.city,jdbcType=VARCHAR}");
        }
        
        if (record.getSale_employee_id() != null) {
            SET("sale_employee_id = #{record.sale_employee_id,jdbcType=INTEGER}");
        }
        
        if (record.getCredit_limit() != null) {
            SET("credit_limit = #{record.credit_limit,jdbcType=INTEGER}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("customer");
        
        SET("customer_id = #{record.customer_id,jdbcType=INTEGER}");
        SET("customer_name = #{record.customer_name,jdbcType=VARCHAR}");
        SET("contact_name = #{record.contact_name,jdbcType=VARCHAR}");
        SET("phone = #{record.phone,jdbcType=VARCHAR}");
        SET("address = #{record.address,jdbcType=VARCHAR}");
        SET("province = #{record.province,jdbcType=VARCHAR}");
        SET("city = #{record.city,jdbcType=VARCHAR}");
        SET("sale_employee_id = #{record.sale_employee_id,jdbcType=INTEGER}");
        SET("credit_limit = #{record.credit_limit,jdbcType=INTEGER}");
        
        CustomerExample example = (CustomerExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(Customer record) {
        BEGIN();
        UPDATE("customer");
        
        if (record.getCustomer_name() != null) {
            SET("customer_name = #{customer_name,jdbcType=VARCHAR}");
        }
        
        if (record.getContact_name() != null) {
            SET("contact_name = #{contact_name,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            SET("phone = #{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            SET("address = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getProvince() != null) {
            SET("province = #{province,jdbcType=VARCHAR}");
        }
        
        if (record.getCity() != null) {
            SET("city = #{city,jdbcType=VARCHAR}");
        }
        
        if (record.getSale_employee_id() != null) {
            SET("sale_employee_id = #{sale_employee_id,jdbcType=INTEGER}");
        }
        
        if (record.getCredit_limit() != null) {
            SET("credit_limit = #{credit_limit,jdbcType=INTEGER}");
        }
        
        WHERE("customer_id = #{customer_id,jdbcType=INTEGER}");
        
        return SQL();
    }

    protected void applyWhere(CustomerExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}