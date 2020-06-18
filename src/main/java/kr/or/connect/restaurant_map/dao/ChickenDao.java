package kr.or.connect.restaurant_map.dao;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import kr.or.connect.restaurant_map.dto.Chicken;

import static kr.or.connect.restaurant_map.dao.ChickenDaoSqls.*;

@Repository
public class ChickenDao {
	 private NamedParameterJdbcTemplate jdbc;
	    private RowMapper<Chicken> rowMapper = BeanPropertyRowMapper.newInstance(Chicken.class);

	    public ChickenDao(DataSource dataSource) {
	        this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	    }
	    
	    public List<Chicken> selectTop3(Integer start, Integer limit) {
	    	Map<String, Integer> params = new HashMap<>();
	    	params.put("start", start);
	    	params.put("limit", limit);
	        return jdbc.query(SELECT_TOP3_CHICKEN, params, rowMapper);
	    }
		
}