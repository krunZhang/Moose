/*
 * Copyright © 2018 krun, All Rights Reserved.
 * Project: moose
 * File:      MooseDomainMappingProperties.java
 * Date:    18-6-4 下午6:05
 * Author: krun
 */

package com.krun.moose.commons.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * MooseDomainMappingProperties.java
 *
 * @author krun
 * @date 2018/6/4 16:44
 */
@ConfigurationProperties (prefix = "moose.domain-mapping")
@Component
@Data
public class MooseDomainMappingProperties {

	private String prefix;
	private String suffix;

}
