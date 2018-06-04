/*
 * Copyright © 2018 krun, All Rights Reserved.
 * Project: moose
 * File:      MooseProperties.java
 * Date:    18-6-4 下午6:07
 * Author: krun
 */

package com.krun.moose.commons.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * MooseProperties.java
 *
 * @author krun
 * @date 2018/6/4 11:24
 */
@ConfigurationProperties (prefix = "moose.properties")
@Data
public class MooseProperties {

	private String managerUsername;

	private String managerPassword;

}
