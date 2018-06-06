package com.capco.digital.engineering.user;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class UserSequenceService {

    @Autowired
    private MongoOperations mongo;

    public String getNextSequence(String seqName) {
        UserSequences counter = mongo.findAndModify(query(where("_id").is(seqName)), new Update().inc("seq", 1),
                options().returnNew(true).upsert(true), UserSequences.class);
        return "" + counter.getSeq();
    }
}