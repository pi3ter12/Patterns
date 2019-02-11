package pl.wiacekp.patterns.filter.criteria;

import pl.wiacekp.patterns.filter.Person;

import java.util.List;
import java.util.stream.Collectors;

public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(c -> c.getGender().equalsIgnoreCase("FEMALE")).collect(Collectors.toList());
    }
}
