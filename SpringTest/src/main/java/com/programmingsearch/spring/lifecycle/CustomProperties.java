package com.programmingsearch.spring.lifecycle;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class CustomProperties extends Properties {

	private static final long serialVersionUID = 1L;

	public CustomProperties(DataSource dataSource) {
		super();
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<Map<String, Object>> configs = jdbcTemplate
				.queryForList("select config_key, config_value from config_params");
		
		System.out.println("Loading properties from Database");
		for (Map<String, Object> config : configs) {
			setProperty((config.get("config_key")).toString(), (config.get("config_value")).toString());
		}
	}
}