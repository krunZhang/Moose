/*
 * Copyright © 2018 krun, All Rights Reserved.
 * Project: moose
 * File:      MoosePropertiesController.java
 * Date:    18-6-4 下午6:07
 * Author: krun
 */

package com.krun.moose.controller;

import com.krun.moose.commons.payload.ResponseData;
import com.krun.moose.payload.request.MoosePropertiesListSpecification;
import com.krun.moose.payload.response.MoosePage;
import com.krun.moose.service.MoosePropertiesService;
import com.krun.spring.extend.mapping.RestDomainMapping;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * MoosePropertiesController.java
 *
 * @author krun
 * @date 2018/6/4 16:41
 */
@RestDomainMapping
@AllArgsConstructor
public class MoosePropertiesController extends MooseController {

	private final MoosePropertiesService propertiesService;

	@GetMapping ("")
	public ResponseData<MoosePage> list (@PageableDefault Pageable pageable,
	                                     MoosePropertiesListSpecification specification) {
		return ResponseData.<MoosePage>ok().message("查询成功!")
		                                   .data(MoosePage.slim(propertiesService.findAll(specification, pageable)))
		                                   .build();
	}
}