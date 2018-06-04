/*
 * Copyright © 2018 krun, All Rights Reserved.
 * Project: moose
 * File:      MoosePropertiesServiceImpl.java
 * Date:    18-6-4 下午6:07
 * Author: krun
 */

package com.krun.moose.service.impl;

import com.krun.moose.repository.MoosePropertiesRepository;
import com.krun.moose.service.MoosePropertiesService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

/**
 * MoosePropertiesServiceImpl.java
 *
 * @author krun
 * @date 2018/6/4 16:23
 */
@Service
@AllArgsConstructor
public class MoosePropertiesServiceImpl implements MoosePropertiesService {

	@Getter
	private final MoosePropertiesRepository repository;

}
