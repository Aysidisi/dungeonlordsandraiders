
package com.aysidisi.dungeonlordsandraiders.raider.dao;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.aysidisi.dungeonlordsandraiders.raider.model.Raider;

@Repository
public interface RaiderDao extends MongoRepository<Raider, ObjectId>
{
	@Override
	public List<Raider> findAll();

	public Raider findByOwnerAccountId(ObjectId ownerAccountId);
}
