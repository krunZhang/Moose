/*
 * Copyright © 2018 krun, All Rights Reserved.
 * Project: moose
 * File:      MoosePropertiesListSpecification.java
 * Date:    18-6-4 下午6:07
 * Author: krun
 */

package com.krun.moose.payload.request;

import com.krun.moose.entity.MooseProperty;
import lombok.Data;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.NotSupportedException;
import java.util.ArrayList;
import java.util.List;

/**
 * MoosePropertiesListSpecification.java
 *
 * @author krun
 * @date 2018/6/4 16:53
 */
@Data
public class MoosePropertiesListSpecification implements MooseRequestPayload<MooseProperty> {

	private String       name;
	private List<String> id;

	@Override
	public MooseProperty merge (MooseProperty entity) throws NotSupportedException {
		throw new NotSupportedException("MooseProperty 列表查询条件不支持合并到实体字段");
	}

	@Override
	public Predicate toPredicate (Root<MooseProperty> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		if (allNull()) {
			return null;
		}
		ArrayList<Predicate> predicates = new ArrayList<>();
		if (name != null) {
			if (name.contains("*") || name.contains("?") || name.contains("%")) {
				predicates.add(criteriaBuilder.like(root.get("name")
				                                        .as(String.class), name));
			} else {
				predicates.add(criteriaBuilder.equal(root.get("name")
				                                         .as(String.class), name));
			}
		} else
			if (id != null && ! id.isEmpty()) {
				predicates.add(criteriaBuilder.in(root.get("id")
				                                      .as(String.class)
				                                      .in(id)));
			}

		return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
	}
}
