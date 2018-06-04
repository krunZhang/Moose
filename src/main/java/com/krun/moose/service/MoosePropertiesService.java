/*
 * Copyright © 2018 krun, All Rights Reserved.
 * Project: moose
 * File:      MoosePropertiesService.java
 * Date:    18-6-4 下午6:07
 * Author: krun
 */

package com.krun.moose.service;

import com.krun.moose.commons.service.MooseService;
import com.krun.moose.entity.MooseProperty;
import com.krun.moose.repository.MoosePropertiesRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * MoosePropertiesService.java
 *
 * @author krun
 * @date 2018/6/4 16:22
 */
public interface MoosePropertiesService extends MooseService<MooseProperty, String, MoosePropertiesRepository> {

	default Page<MooseProperty> findALlByKeyLike (String key, Pageable pageable) {
		return getRepository().findAllByKeyLike(key, pageable);
	}
}
