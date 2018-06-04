/*
 * Copyright © 2018 krun, All Rights Reserved.
 * Project: moose
 * File:      EnableField.java
 * Date:    18-6-4 上午11:03
 * Author: krun
 */

package com.krun.moose.commons.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * EnableField.java
 *
 * @author krun
 * @date 2018/6/4 10:52
 */
@MappedSuperclass
@Getter
@Setter
public class EnableField extends UUIDField {

	@Column (nullable = false, columnDefinition = "bit(1) default TRUE")
	private Boolean enable;

}
