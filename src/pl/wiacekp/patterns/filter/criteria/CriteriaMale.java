package pl.wiacekp.patterns.filter.criteria;

import pl.wiacekp.patterns.filter.Person;

import java.util.List;
import java.util.stream.Collectors;

public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(c -> c.getGender().equalsIgnoreCase("MALE")).collect(Collectors.toList());
    }
}
