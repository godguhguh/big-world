package com.ypp.tunte.world.junitpractice.parameterized;

import com.ypp.tunte.world.junitpractice.Types;
import com.ypp.tunte.world.junitpractice.parameterized.Person;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.aggregator.ArgumentsAggregationException;
import org.junit.jupiter.params.aggregator.ArgumentsAggregator;

public class PersonAggregator implements ArgumentsAggregator {
    @Override
    public Object aggregateArguments(ArgumentsAccessor arguments, ParameterContext parameterContext) throws ArgumentsAggregationException {
        Person person = new Person();
        person.setFirstName(arguments.getString(0));
        person.setLastName(arguments.getString(1));
        person.setType(arguments.get(2, Types.class));

        return person;
    }
}
