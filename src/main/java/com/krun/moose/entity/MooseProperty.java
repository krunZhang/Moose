/*
 * Copyright © 2018 krun, All Rights Reserved.
 * Project: moose
 * File:      MooseProperty.java
 * Date:    18-6-4 下午6:07
 * Author: krun
 */

package com.krun.moose.entity;

import com.krun.moose.commons.entity.UUIDField;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * MooseProperty.java
 *
 * @author krun
 * @date 2018/6/4 11:21
 */
@Entity (name = "moose_property")
@Data
@EqualsAndHashCode (callSuper = true)
public class MooseProperty extends UUIDField {

	@Column (name = "p_key", unique = true, nullable = false)
	private String key;

	@Column (name = "p_val", nullable = false)
	private String value;

}
