package sec02.DIP.right;

import sec02.DIP.Person;

import java.util.List;

public interface RelationshipBrowser {
    List<Person> findAllChildrenOf(String name);
}
