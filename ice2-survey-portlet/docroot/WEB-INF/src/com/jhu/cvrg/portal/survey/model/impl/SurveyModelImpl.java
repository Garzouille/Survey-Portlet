/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.jhu.cvrg.portal.survey.model.impl;

import com.jhu.cvrg.portal.survey.model.Survey;
import com.jhu.cvrg.portal.survey.model.SurveyModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

/**
 * The base model implementation for the Survey service. Represents a row in the &quot;JHU_Survey&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.jhu.cvrg.portal.survey.model.SurveyModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SurveyImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. All methods that expect a survey model instance should use the {@link com.jhu.cvrg.portal.survey.model.Survey} interface instead.
 * </p>
 *
 * @author Chris Jurado
 * @see SurveyImpl
 * @see com.jhu.cvrg.portal.survey.model.Survey
 * @see com.jhu.cvrg.portal.survey.model.SurveyModel
 * @generated
 */
public class SurveyModelImpl extends BaseModelImpl<Survey>
	implements SurveyModel {
	public static final String TABLE_NAME = "JHU_Survey";
	public static final Object[][] TABLE_COLUMNS = {
			{ "surveyId", new Integer(Types.BIGINT) },
			{ "communityId", new Integer(Types.BIGINT) },
			{ "surveyName", new Integer(Types.VARCHAR) }
		};
	public static final String TABLE_SQL_CREATE = "create table JHU_Survey (surveyId LONG not null primary key,communityId LONG,surveyName VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table JHU_Survey";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.jhu.cvrg.portal.survey.model.Survey"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.jhu.cvrg.portal.survey.model.Survey"),
			true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.jhu.cvrg.portal.survey.model.Survey"));

	public SurveyModelImpl() {
	}

	public long getPrimaryKey() {
		return _surveyId;
	}

	public void setPrimaryKey(long pk) {
		setSurveyId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_surveyId);
	}

	public long getSurveyId() {
		return _surveyId;
	}

	public void setSurveyId(long surveyId) {
		_surveyId = surveyId;
	}

	public long getCommunityId() {
		return _communityId;
	}

	public void setCommunityId(long communityId) {
		_communityId = communityId;
	}

	public String getSurveyName() {
		if (_surveyName == null) {
			return StringPool.BLANK;
		}
		else {
			return _surveyName;
		}
	}

	public void setSurveyName(String surveyName) {
		_surveyName = surveyName;
	}

	public Survey toEscapedModel() {
		if (isEscapedModel()) {
			return (Survey)this;
		}
		else {
			return (Survey)Proxy.newProxyInstance(Survey.class.getClassLoader(),
				new Class[] { Survey.class }, new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					Survey.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		SurveyImpl surveyImpl = new SurveyImpl();

		surveyImpl.setSurveyId(getSurveyId());

		surveyImpl.setCommunityId(getCommunityId());

		surveyImpl.setSurveyName(getSurveyName());

		return surveyImpl;
	}

	public int compareTo(Survey survey) {
		long pk = survey.getPrimaryKey();

		if (getPrimaryKey() < pk) {
			return -1;
		}
		else if (getPrimaryKey() > pk) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		Survey survey = null;

		try {
			survey = (Survey)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = survey.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{surveyId=");
		sb.append(getSurveyId());
		sb.append(", communityId=");
		sb.append(getCommunityId());
		sb.append(", surveyName=");
		sb.append(getSurveyName());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.jhu.cvrg.portal.survey.model.Survey");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>surveyId</column-name><column-value><![CDATA[");
		sb.append(getSurveyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>communityId</column-name><column-value><![CDATA[");
		sb.append(getCommunityId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>surveyName</column-name><column-value><![CDATA[");
		sb.append(getSurveyName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _surveyId;
	private long _communityId;
	private String _surveyName;
	private transient ExpandoBridge _expandoBridge;
}