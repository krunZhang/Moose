/*
 * Copyright © 2018 krun, All Rights Reserved.
 * Project: moose
 * File:      MooseRequestPayload.java
 * Date:    18-6-4 下午6:07
 * Author: krun
 */

package com.krun.moose.payload.request;

import org.springframework.data.jpa.domain.Specification;

import javax.transaction.NotSupportedException;
import java.lang.reflect.Field;

/**
 * MooseRequestPayload.java
 *
 * @author krun
 * @date 2018/6/4 16:53
 */
public interface MooseRequestPayload <T> extends Specification<T> {

	T merge (T entity) throws NotSupportedException;

	default boolean allNull () {
		try {
			for (Field field : this.getClass()
			                       .getDeclaredFields()) {
				field.setAccessible(true);
				if (field.get(this) != null) {
					return false;
				}
			}
		} catch (Exception ignore) {
		}
		return true;
	}

}
