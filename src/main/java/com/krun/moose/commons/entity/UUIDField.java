/*
 * Copyright © 2018 krun, All Rights Reserved.
 * Project: moose
 * File:      UUIDField.java
 * Date:    18-6-4 上午11:03
 * Author: krun
 */

package com.krun.moose.commons.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * UUIDField.java
 *
 * @author krun
 * @date 2018/6/4 10:48
 */
@MappedSuperclass
@Getter
@Setter
public class UUIDField {

	@Id
	@GenericGenerator (name = "uuid", strategy = "uuid")
	@GeneratedValue (generator = "uuid")
	private String id;

}
