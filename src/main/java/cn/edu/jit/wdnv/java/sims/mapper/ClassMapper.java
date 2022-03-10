package cn.edu.jit.osmiumsilver.java.sims.mapper;

import cn.edu.jit.osmiumsilver.java.sims.beans.Class;
import java.math.BigDecimal;
import java.util.List;

public interface ClassMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(BigDecimal clno);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(Class row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Class selectByPrimaryKey(BigDecimal clno);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<Class> selectAll();

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(Class row);
}