package org.kairosdb.datastore.h2.orm;

/**
	This class has been automatically generated by GenORMous.  This file is for
	adding custom code to.  This file will not be regenerated once it exists.

	Returns the metric ids for a specified query. In essence this the initial rows returned. Takes a tags filter
*/
public class MetricIdsWithTagsData extends MetricIdsWithTagsQuery.Record
		implements MetricIdResults
	{
	public MetricIdsWithTagsData(MetricIdsWithTagsQuery query, java.sql.ResultSet resultSet)
			throws java.sql.SQLException
		{
		query.super(resultSet);
		}
	}