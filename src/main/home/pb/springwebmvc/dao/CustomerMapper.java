package home.pb.springwebmvc.dao;

import home.pb.springwebmvc.entity.Customer;
import home.pb.springwebmvc.entity.CustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface CustomerMapper {
    @SelectProvider(type=CustomerSqlProvider.class, method="countByExample")
    int countByExample(CustomerExample example);

    @DeleteProvider(type=CustomerSqlProvider.class, method="deleteByExample")
    int deleteByExample(CustomerExample example);

    @Delete({
        "delete from customer",
        "where customer_id = #{customer_id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer customer_id);

    @Insert({
        "insert into customer (customer_id, customer_name, ",
        "contact_name, phone, ",
        "address, province, ",
        "city, sale_employee_id, ",
        "credit_limit)",
        "values (#{customer_id,jdbcType=INTEGER}, #{customer_name,jdbcType=VARCHAR}, ",
        "#{contact_name,jdbcType=VARCHAR}, #{phone,jdbcType=VARCHAR}, ",
        "#{address,jdbcType=VARCHAR}, #{province,jdbcType=VARCHAR}, ",
        "#{city,jdbcType=VARCHAR}, #{sale_employee_id,jdbcType=INTEGER}, ",
        "#{credit_limit,jdbcType=INTEGER})"
    })
    int insert(Customer record);

    @InsertProvider(type=CustomerSqlProvider.class, method="insertSelective")
    int insertSelective(Customer record);

    @SelectProvider(type=CustomerSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="customer_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="customer_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="contact_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="phone", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="address", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="province", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="city", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sale_employee_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="credit_limit", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    List<Customer> selectByExample(CustomerExample example);

    @Select({
        "select",
        "customer_id, customer_name, contact_name, phone, address, province, city, sale_employee_id, ",
        "credit_limit",
        "from customer",
        "where customer_id = #{customer_id,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="customer_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="customer_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="contact_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="phone", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="address", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="province", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="city", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sale_employee_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="credit_limit", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    Customer selectByPrimaryKey(Integer customer_id);

    @UpdateProvider(type=CustomerSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    @UpdateProvider(type=CustomerSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    @UpdateProvider(type=CustomerSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Customer record);

    @Update({
        "update customer",
        "set customer_name = #{customer_name,jdbcType=VARCHAR},",
          "contact_name = #{contact_name,jdbcType=VARCHAR},",
          "phone = #{phone,jdbcType=VARCHAR},",
          "address = #{address,jdbcType=VARCHAR},",
          "province = #{province,jdbcType=VARCHAR},",
          "city = #{city,jdbcType=VARCHAR},",
          "sale_employee_id = #{sale_employee_id,jdbcType=INTEGER},",
          "credit_limit = #{credit_limit,jdbcType=INTEGER}",
        "where customer_id = #{customer_id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Customer record);
}