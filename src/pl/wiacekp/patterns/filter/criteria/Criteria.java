package pl.wiacekp.patterns.filter.criteria;

import pl.wiacekp.patterns.filter.Person;

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
