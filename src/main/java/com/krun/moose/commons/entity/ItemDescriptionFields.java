/*
 * Copyright © 2018 krun, All Rights Reserved.
 * Project: moose
 * File:      ItemDescriptionFields.java
 * Date:    18-6-4 上午11:03
 * Author: krun
 */

package com.krun.moose.commons.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * ItemDescriptionFields.java
 *
 * @author krun
 * @date 2018/6/4 10:55
 */
@MappedSuperclass
@Getter
@Setter
public class ItemDescriptionFields extends EnableField {

	@Column (nullable = false, unique = true)
	private String name;

	@Column
	private String description;

}
