package cn.ssm.core.dao.emp;

import cn.ssm.core.bean.emp.E2Emp;
import cn.ssm.core.bean.emp.E2EmpQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface E2EmpDao {
    long countByExample(E2EmpQuery example);

    int deleteByExample(E2EmpQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(E2Emp record);

    int insertSelective(E2Emp record);

    List<E2Emp> selectByExample(E2EmpQuery example);

    E2Emp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") E2Emp record, @Param("example") E2EmpQuery example);

    int updateByExample(@Param("record") E2Emp record, @Param("example") E2EmpQuery example);

    int updateByPrimaryKeySelective(E2Emp record);

    int updateByPrimaryKey(E2Emp record);
}