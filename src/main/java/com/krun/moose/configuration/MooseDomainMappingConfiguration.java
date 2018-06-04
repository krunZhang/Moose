/*
 * Copyright © 2018 krun, All Rights Reserved.
 * Project: moose
 * File:      MooseDomainMappingConfiguration.java
 * Date:    18-6-4 下午6:05
 * Author: krun
 */

package com.krun.moose.configuration;

import com.krun.moose.commons.properties.MooseDomainMappingProperties;
import com.krun.spring.extend.mapping.resolver.impl.AbstractMappingNameResolver;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * MooseDomainMappingConfiguration.java
 *
 * @author krun
 * @date 2018/6/4 16:45
 */
@Component
@AllArgsConstructor
public class MooseDomainMappingConfiguration extends AbstractMappingNameResolver {

	private MooseDomainMappingProperties properties;

	@Override
	protected String getSuffix () {
		return properties.getSuffix();
	}
	@Override
	protected String getPrefix () {
		return properties.getPrefix();
	}
}
