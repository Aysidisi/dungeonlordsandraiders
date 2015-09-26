
package com.aysidisi.dungeonlordsandraiders.raider.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Raider
{

	private ObjectId fieldId;
	
	@Id
	private ObjectId id;
	
	private String name;
	
	private ObjectId ownerAccountId;

	public ObjectId getFieldId()
	{
		return this.fieldId;
	}

	public ObjectId getId()
	{
		return this.id;
	}

	public String getName()
	{
		return this.name;
	}

	public ObjectId getOwnerAccountId()
	{
		return this.ownerAccountId;
	}

	public void setFieldId(final ObjectId fieldId)
	{
		this.fieldId = fieldId;
	}

	public void setId(final ObjectId id)
	{
		this.id = id;
	}

	public void setName(final String name)
	{
		this.name = name;
	}

	public void setOwnerAccountId(final ObjectId ownerAccountId)
	{
		this.ownerAccountId = ownerAccountId;
	}
}
