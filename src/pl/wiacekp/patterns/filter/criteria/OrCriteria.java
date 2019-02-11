package pl.wiacekp.patterns.filter.criteria;

import pl.wiacekp.patterns.filter.Person;

import java.util.List;

public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> criteria1 = criteria.meetCriteria(persons);
        List<Person> criteria2 = otherCriteria.meetCriteria(persons);

        for (Person person : criteria1) {
            if (!criteria2.contains(person)) {
                criteria2.add(person);
            }
        }

        return criteria2;
    }
}
