package com.adtech.data.mapper;

import com.adtech.ysxt.entity.Entity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Mapper
public interface BaseEntityMapper {
	public int save(@Param("entity") Entity entity);

	public int saveEntities(@Param("entities") Entity[] entity);

	public int test(@Param("table") String table, @Param("id") String id);

	public int updatePropByID(@Param("entity") Entity entity, @Param("id") String ID);

	public int updateProp(@Param("table") String table, @Param("setCondition") String setCondition, @Param("condition") String condition);

	public int updatePropByCondition(@Param("entity") Entity entity, @Param("condition") String condition);

	public int deleteByID(@Param("ID") String ID, @Param("table") String table, @Param("primaryKey") String primaryKey);

	public int deleteByCondition(@Param("condition") String condition,
                                 @Param("table") String table);

	public int deleteEntities(@Param("ids") String[] IDs, @Param("table") String table, @Param("primaryKey") String primaryKey);

	public Map<String, Object> getByID(@Param("ID") BigDecimal ID, @Param("primaryKey") String primaryKey, @Param("table") String table);


	public List<Map<String, Object>> getByCondition(@Param("condition") String condition, @Param("table") String table);

	public int getCountByCondition(@Param("condition") String condition, @Param("primaryKey") String primaryKey, @Param("table") String table);

	public Map<String, Object> findByID(@Param("properties") String[] properties, @Param("id") String id, @Param("primaryKey") String primaryKey, @Param("table") String table);

	public List<Map<String, Object>> findByCondition(@Param("properties") String[] properties, @Param("condition") String condition, @Param("table") String table);

	public void createTable(@Param("tableName") String tableName, @Param("fieldSqls") Set<String> fieldSqls);
	
	public List<Map<String,Object>> getMap(@Param("tableName") String tableName, @Param("properties") String[] properties, @Param("condition") String condition);
}
