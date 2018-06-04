/*
 * Copyright © 2018 krun, All Rights Reserved.
 * Project: moose
 * File:      MooseWebMvcConfiguration.java
 * Date:    18-6-4 下午6:05
 * Author: krun
 */

package com.krun.moose.configuration;

import com.krun.spring.extend.mapping.handler.DomainMappingHandler;
import com.krun.spring.extend.mapping.resolver.MappingNameResolver;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;
import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * MooseWebMvcConfiguration.java
 *
 * @author krun
 * @date 2018/6/4 16:43
 */
@Configuration
@EnableSpringDataWebSupport
@AllArgsConstructor
public class MooseWebMvcConfiguration extends DelegatingWebMvcConfiguration {

	private MappingNameResolver mappingNameResolver;
	/**
	 * 解决 Fetch_Lazy 模式下的 entity_manager_session 丢失问题
	 *
	 * @return {@link OpenEntityManagerInViewFilter}
	 */
	@Bean
	public OpenEntityManagerInViewFilter openEntityManagerInViewFilter () {
		return new OpenEntityManagerInViewFilter();
	}
	@Override
	public RequestMappingHandlerMapping requestMappingHandlerMapping () {
		return new DomainMappingHandler(mappingNameResolver);
	}

}
